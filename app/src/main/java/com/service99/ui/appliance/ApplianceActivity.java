package com.service99.ui.appliance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.service99.R;
import com.service99.ui.activities.ScheduleBooking;
import com.thekhaeng.pushdownanim.PushDownAnim;

import java.util.Objects;

public class ApplianceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appliance);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Appliances & Electronics Repair Services");
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
        SimpleDraweeView mImageView9 = findViewById(R.id.image_ac9);
        SimpleDraweeView mImageView10 = findViewById(R.id.image_ac10);
        SimpleDraweeView mImageView11 = findViewById(R.id.image_ac11);
        SimpleDraweeView mImageView12 = findViewById(R.id.image_ac12);

        mImageView1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/appliances%2Fac.jpeg?alt=media&token=50b14f2b-bd64-4c83-8b4e-152faf708a72");
        mImageView2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/appliances%2Frefridgerator.jpeg?alt=media&token=6a528f6d-6d72-4eac-99a8-53c0ee397270");
        mImageView3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/appliances%2Fwashingmachine.jpeg?alt=media&token=0186fe16-2cc6-40fb-854f-f40a8680852d");
        mImageView4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/appliances%2Fgeyser.jpeg?alt=media&token=8158c69e-3a78-462d-b0b8-d4b63549a7ec");
        mImageView5.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/appliances%2Fchimney.jpeg?alt=media&token=ebed3da3-a2f0-401d-a295-9b46a0757e05");
        mImageView6.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/appliances%2Fro.jpeg?alt=media&token=088b7c4f-c052-45c8-944d-7a5fe4373d7c");
        mImageView7.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/appliances%2Fgasstove.jpeg?alt=media&token=0ebc2643-2757-48ed-b16a-f97f42cad3b8");
        mImageView8.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/appliances%2Fmicrowave.jpeg?alt=media&token=86717474-ff38-4bae-aa13-ef92c0969f12");
        mImageView9.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/appliances%2Fcctv.jpeg?alt=media&token=255d3799-967c-4cb8-bc67-bcbb76aac4ea");
        mImageView10.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/appliances%2Fmobile.jpeg?alt=media&token=0bd92842-c43c-44bb-ae7a-09cb83ec6a79");
        mImageView11.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/appliances%2Fpcrepair.jpeg?alt=media&token=e756940e-98f4-44c7-9367-657e6d287ae8");
        mImageView12.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/appliances%2Fprinter.jpeg?alt=media&token=ff563fba-107e-400d-9763-1706a56426ca");

        LinearLayout l1 = findViewById(R.id.ac1);
        LinearLayout l2 = findViewById(R.id.ac2);
        LinearLayout l3 = findViewById(R.id.ac3);
        LinearLayout l4 = findViewById(R.id.ac4);
        LinearLayout l5 = findViewById(R.id.ac5);
        LinearLayout l6 = findViewById(R.id.ac6);
        LinearLayout l7 = findViewById(R.id.ac7);
        LinearLayout l8 = findViewById(R.id.ac8);
        LinearLayout l9 = findViewById(R.id.ac9);
        LinearLayout l10 = findViewById(R.id.ac10);
        LinearLayout l11 = findViewById(R.id.ac11);
        LinearLayout l12 = findViewById(R.id.ac12);


        PushDownAnim.setPushDownAnimTo(l1)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ACServicesActivity.class);
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l2)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Refrigerator");
                        i.putExtra("price", "Rs. 349 onwards");
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l3)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Washing Machine");
                        i.putExtra("price", "Rs. 249 onwards");
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l4)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Geyser/Water Heater");
                        i.putExtra("price", "Rs. 249 onwards");
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l5)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Electric Chimney");
                        i.putExtra("price", "Rs. 499 onwards");
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l6)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "RO/Water Purifier");
                        i.putExtra("price", "Rs. 249 onwards");
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l7)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Gas Stove");
                        i.putExtra("price", "Rs. 199 onwards");
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l8)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Microwave");
                        i.putExtra("price", "Rs. 249 onwards");
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l9)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "CCTV Repair");
                        i.putExtra("price", "Rs. 349 onwards");
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l10)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Mobile/Tablets Repair");
                        i.putExtra("price", "Rs. 199 onwards");
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l11)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Laptop/Desktop Repair");
                        i.putExtra("price", "Rs. 349 onwards");
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l12)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Printer Repair");
                        i.putExtra("price", "Rs. 349 onwards");
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
