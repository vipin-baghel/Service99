package com.service99.ui.business;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.service99.R;
import com.service99.ui.utilities.Help;

import java.util.Objects;

public class DigitalMarketingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_marketing);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Digital Marketing");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView i1 = findViewById(R.id.i1);
        SimpleDraweeView i2 = findViewById(R.id.i2);
        SimpleDraweeView i3 = findViewById(R.id.i3);
        SimpleDraweeView i4 = findViewById(R.id.i4);

        i1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/socialmediamarketing.webp?alt=media&token=015777e1-98cb-404f-a2b8-aa0d9fc0ba99");
        i2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/contentmarketing.webp?alt=media&token=53dfcd29-c5fa-4f47-95b7-ab0f94ae76f8");
        i3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/emailmarketing.webp?alt=media&token=0a5c0388-f72a-4986-a620-a8002a8fa0d3");
        i4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/seomarketing.webp?alt=media&token=00fc9e0c-9323-4d22-b55f-40895f979c2c");

        Button b = findViewById(R.id.cnf_btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(DigitalMarketingActivity.this, "Service:\n Digital Marketing");

            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
