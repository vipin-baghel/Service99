package com.service99.ui.delivery;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.thekhaeng.pushdownanim.PushDownAnim;
import com.service99.R;
import com.service99.ui.utilities.Help;

import java.util.Objects;

public class DeliveryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Home Delivery");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView mImageView1 = findViewById(R.id.image_ac1);
        SimpleDraweeView mImageView2 = findViewById(R.id.image_ac2);
        SimpleDraweeView mImageView3 = findViewById(R.id.image_ac3);
        SimpleDraweeView mImageView4 = findViewById(R.id.image_ac4);
        SimpleDraweeView mImageView5 = findViewById(R.id.image_ac5);
        SimpleDraweeView mImageView6 = findViewById(R.id.image_ac6);

        mImageView1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/cake.png?alt=media&token=a26a86ab-cf60-4716-9b3d-8bb3fd6a9c4e");
        mImageView2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/surprisegift.jpeg?alt=media&token=7be4a2e7-3714-4d42-b9a8-d4dbea0f6fae");
        mImageView3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/dairy.jpeg?alt=media&token=bc7e57cc-36fe-41a3-91f7-ede6d789a72b");
        mImageView4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/fruits.jpeg?alt=media&token=fc497a0a-07c0-44db-9500-a4e16a5058d3");
        mImageView5.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/vegetable.jpeg?alt=media&token=ccc049a4-65cb-483e-89f4-e020d3e19ee8");
        mImageView6.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/medicine.jpeg?alt=media&token=87036ec5-819f-405a-8be9-e245d0bb0909");

        /*
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
                        startActivity(new Intent(DeliveryActivity.this, CakeActivity.class));
                    }
                });

        PushDownAnim.setPushDownAnimTo(l2)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Help.schedule(DeliveryActivity.this,"Service:\nSurprise Gift Delivery");
                    }
                });
        PushDownAnim.setPushDownAnimTo(l3)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(DeliveryActivity.this, DairyActivity.class));

                    }
                });
        PushDownAnim.setPushDownAnimTo(l4)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(DeliveryActivity.this, FruitsActivity.class));

                    }
                });
        PushDownAnim.setPushDownAnimTo(l5)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(DeliveryActivity.this, VegetablesActivity.class));

                    }
                });
        PushDownAnim.setPushDownAnimTo(l6)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String phone = "+918982802013";
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                        startActivity(intent);

                    }
                });*/

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


}
