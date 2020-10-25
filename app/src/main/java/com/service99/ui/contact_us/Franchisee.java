package com.service99.ui.contact_us;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.service99.R;

import java.util.Objects;

public class Franchisee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_franchisee);


        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Franchisee");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView i1 = findViewById(R.id.i1);
        SimpleDraweeView i2 = findViewById(R.id.i2);
        SimpleDraweeView i3 = findViewById(R.id.i3);
        SimpleDraweeView i4 = findViewById(R.id.i4);
        SimpleDraweeView i5 = findViewById(R.id.i5);
        i1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_franchisee1.webp?alt=media&token=9ca09798-3edd-4e12-a4b6-fee29e65d753");
        i2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_franchisee2.webp?alt=media&token=154fc241-4373-40fb-8c68-e622b400afa3");
        i3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_franchisee3.webp?alt=media&token=9dd0c013-9a3e-4487-96c4-7db12f50f1a7");
        i4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_franchisee4.webp?alt=media&token=0081a7c6-6495-4c77-afb2-eb6908ad68cc");
        i5.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_franchisee5.webp?alt=media&token=c5d42095-9f2c-4c22-9ac3-a4837d7605d4");

        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        if (mAuth.getCurrentUser() != null) {

            Button btn = findViewById(R.id.cnf_btn);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String phone = "+919993445411";
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                    startActivity(intent);
                }
            });

        }else{
            Snackbar.make(getWindow().getDecorView(), "Please Sign in to apply !", Snackbar.LENGTH_INDEFINITE).show();
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
