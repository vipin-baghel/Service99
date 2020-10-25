package com.service99.ui.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.service99.R;
import com.service99.ui.utilities.Help;
import com.thekhaeng.pushdownanim.PushDownAnim;

import java.util.Objects;

public class FabricationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabrication);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Fabrication Services");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView mImageView1 = findViewById(R.id.image_ac1);
        SimpleDraweeView mImageView2 = findViewById(R.id.image_ac2);
        SimpleDraweeView mImageView3 = findViewById(R.id.image_ac3);
        SimpleDraweeView mImageView4 = findViewById(R.id.image_ac4);
        SimpleDraweeView mImageView5 = findViewById(R.id.image_ac5);
        SimpleDraweeView mImageView6 = findViewById(R.id.image_ac6);
        SimpleDraweeView mImageView7 = findViewById(R.id.image_ac7);
        SimpleDraweeView mImageView8 = findViewById(R.id.image_ac8);

        mImageView1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/aluminium-partition.jpg?alt=media&token=055da6db-d400-4a02-90b3-441cba7ea2a2");
        mImageView2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/iron-fabrication.jpeg?alt=media&token=7d0b1f07-895f-4531-857d-1bfd69c98bd5");
        mImageView3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/steel%20fab.jpg?alt=media&token=a17417ea-9197-4fe5-b4a7-20261805dd7f");
        mImageView4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/elevation-work.jpeg?alt=media&token=8952bca7-1416-484b-80da-1cfa84d84ec1");
        mImageView5.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/roof_shed.jpg?alt=media&token=653e259a-7441-41d6-b677-7be3912c1674");
        mImageView6.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/grills%20balcony.jpg?alt=media&token=5011805b-5ec2-4e4f-911e-5d12a05534b0");
        mImageView7.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/rolling%20shutter.jpg?alt=media&token=ed7c8781-6a16-4727-a72e-e3608df207c3");
        mImageView8.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/Fabrication-Work.jpg?alt=media&token=8d267665-53d5-4f32-8b2a-813fe46c16c4");

        LinearLayout l1 = findViewById(R.id.ac1);
        LinearLayout l2 = findViewById(R.id.ac2);
        LinearLayout l3 = findViewById(R.id.ac3);
        LinearLayout l4 = findViewById(R.id.ac4);
        LinearLayout l5 = findViewById(R.id.ac5);
        LinearLayout l6 = findViewById(R.id.ac6);
        LinearLayout l7 = findViewById(R.id.ac7);
        LinearLayout l8 = findViewById(R.id.ac8);

        PushDownAnim.setPushDownAnimTo(l1)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(FabricationActivity.this, "Service:\n Aluminium Partitioning");

                    }
                });

        PushDownAnim.setPushDownAnimTo(l2)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(FabricationActivity.this, "Service:\n Gate Fabrication");

                    }
                });

        PushDownAnim.setPushDownAnimTo(l3)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(FabricationActivity.this, "Service:\n Railing Fabrication");
                    }
                });

        PushDownAnim.setPushDownAnimTo(l4)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(FabricationActivity.this, "Service:\n Elevation Work");

                    }
                });

        PushDownAnim.setPushDownAnimTo(l5)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(FabricationActivity.this, "Service:\n Roof Shed");
                    }
                });

        PushDownAnim.setPushDownAnimTo(l6)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(FabricationActivity.this, "Service:\n Grills");
                    }
                });

        PushDownAnim.setPushDownAnimTo(l7)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(FabricationActivity.this, "Service:\n Rolling Shutter");

                    }
                });

        PushDownAnim.setPushDownAnimTo(l8)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(FabricationActivity.this, "Service:\n Other Fabrication Work");

                    }
                });

    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
