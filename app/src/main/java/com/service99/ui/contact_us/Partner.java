package com.service99.ui.contact_us;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.service99.R;
import com.service99.ui.activities.WebViewActivity;

import java.util.Objects;

public class Partner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partner);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Franchisee");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        SimpleDraweeView i1 = findViewById(R.id.i1);
        SimpleDraweeView i2 = findViewById(R.id.i2);
        SimpleDraweeView i3 = findViewById(R.id.i3);
        i1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_partner1.webp?alt=media&token=d78fca70-450c-4adb-ad1e-da62884805a1");
        i2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_partner2.webp?alt=media&token=d94910fd-9136-403d-bf06-f4774c24e081");
        i3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_partner3.webp?alt=media&token=764eac5d-0285-4248-8d6c-2608dcce091d");

        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        if (mAuth.getCurrentUser() != null) {

            Button b = findViewById(R.id.cnf_btn);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Partner.this, WebViewActivity.class));
                }
            });

        } else {
            Snackbar.make(getWindow().getDecorView(), "Please Sign in to apply !", Snackbar.LENGTH_INDEFINITE).show();
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
