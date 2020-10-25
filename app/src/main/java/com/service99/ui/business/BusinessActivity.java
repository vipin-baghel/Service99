package com.service99.ui.business;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.service99.R;
import com.thekhaeng.pushdownanim.PushDownAnim;

import java.util.Objects;

public class BusinessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Business Services");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView mImageView1 = findViewById(R.id.image_ac1);
        SimpleDraweeView mImageView2 = findViewById(R.id.image_ac2);
        SimpleDraweeView mImageView3 = findViewById(R.id.image_ac3);
        SimpleDraweeView mImageView4 = findViewById(R.id.image_ac4);
        SimpleDraweeView mImageView5 = findViewById(R.id.image_ac5);
        SimpleDraweeView mImageView6 = findViewById(R.id.image_ac6);

        mImageView1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/bus_reg.jpeg?alt=media&token=cef8c556-27d5-454e-8a23-4390cb3a7e19");
        mImageView2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/gst.jpeg?alt=media&token=a53e00ef-50e7-4fbe-a142-ed1fca65d459");
        mImageView3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/android_dev.jpeg?alt=media&token=84d64fce-b509-4563-9a0b-716f98a2dfee");
        mImageView4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/web%20design.jpeg?alt=media&token=1e99f33b-89a4-4526-8bbb-11aa7c266070");
        mImageView5.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/digital_marketing.jpeg?alt=media&token=090e6ebf-9313-4c22-b3cb-c2e2f92176b2");
        mImageView6.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/graphics_design.png?alt=media&token=88ba24d3-c1c9-480d-bf93-1af62380b5db");

        LinearLayout l1 = findViewById(R.id.ac1);
        LinearLayout l2 = findViewById(R.id.ac2);
        LinearLayout l3 = findViewById(R.id.ac3);
        LinearLayout l4 = findViewById(R.id.ac4);
        LinearLayout l5 = findViewById(R.id.ac5);
        LinearLayout l6 = findViewById(R.id.ac6);

        PushDownAnim.setPushDownAnimTo(l1)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), CompanyRegActivity.class);
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l2)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), GSTActivity.class);
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l3)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), AndroidDevActivity.class);
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l4)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), WebDevActivity.class);

                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l5)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), DigitalMarketingActivity.class);
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l6)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), GraphicsNvideoEditing.class);
                        startActivity(i);
                    }
                });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
