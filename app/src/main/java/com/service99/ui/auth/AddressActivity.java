package com.service99.ui.auth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.service99.MainActivity;
import com.service99.R;
import com.service99.ui.utilities.Help;
import com.service99.ui.utilities.SharedPref;
import com.thekhaeng.pushdownanim.PushDownAnim;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class AddressActivity extends AppCompatActivity {

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private EditText etHno, etLocality, etArea, etName;
    private String hno, locality, area, phone, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Address");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        hno = SharedPref.read(SharedPref.HNO, "");
        locality = SharedPref.read(SharedPref.LOCALITY, "");
        area = SharedPref.read(SharedPref.AREA, "");
        phone = SharedPref.read(SharedPref.PHONE, "");
        name = SharedPref.read(SharedPref.NAME, "");

        etHno = findViewById(R.id.etHno);
        etLocality = findViewById(R.id.etLocality);
        etArea = findViewById(R.id.etArea);
        etName = findViewById(R.id.etname);

        if (!hno.equals("")) {
            etHno.setText(hno);
            etLocality.setText(locality);
            etArea.setText(area);
            etName.setText(name);
        }

        final Button btn = findViewById(R.id.save_btn);

        PushDownAnim.setPushDownAnimTo(btn)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addAddressDB();
                    }

                });
    }

    private void addAddressDB() {

        if (etHno.getText().toString().equals("")) {
            etHno.setError("Please Enter your H.No.");
            etHno.requestFocus();
        } else if (etLocality.getText().toString().equals("")) {
            etLocality.setError("Please Enter your Locality");
            etLocality.requestFocus();

        } else if (etArea.getText().toString().equals("")) {
            etArea.setError("Please Enter your area");
            etArea.requestFocus();

        } else if (etName.getText().toString().equals("")) {
            etName.setError("Please Enter your phone no");
            etName.requestFocus();

        } else {

            final SweetAlertDialog s = Help.loadDialog(this);

            hno = etHno.getText().toString();
            locality = etLocality.getText().toString();
            area = etArea.getText().toString();
            name = etName.getText().toString();

            SharedPref.write(SharedPref.HNO, hno);
            SharedPref.write(SharedPref.LOCALITY, locality);
            SharedPref.write(SharedPref.AREA, area);
            SharedPref.write(SharedPref.NAME, name);

            Map<String, Object> data = new HashMap<>();
            data.put("name", name);
            data.put("hno", hno);
            data.put("locality", locality);
            data.put("area", area);
            data.put("phone", phone);

            db.collection("users").document(phone)
                    .set(data)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {

                            Toast.makeText(AddressActivity.this,
                                    "Saved Successfully",
                                    Toast.LENGTH_SHORT).show();
                            s.dismiss();

                            finish();

                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {

                            Toast.makeText(AddressActivity.this,
                                    "Failed! Make sure you have active internet connection.",
                                    Toast.LENGTH_SHORT).show();
                            s.dismiss();
                        }
                    });
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
