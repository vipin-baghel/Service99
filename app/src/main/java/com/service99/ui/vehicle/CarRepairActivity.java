package com.service99.ui.vehicle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.thekhaeng.pushdownanim.PushDownAnim;
import com.service99.R;
import com.service99.ui.activities.ScheduleBooking;

import java.util.Objects;

public class CarRepairActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_repair);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Car Repair");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView mImageView5 = findViewById(R.id.image_ac5);
        SimpleDraweeView mImageView6 = findViewById(R.id.image_ac6);
        SimpleDraweeView mImageView7 = findViewById(R.id.image_ac7);
        SimpleDraweeView mImageView8 = findViewById(R.id.image_ac8);
        SimpleDraweeView mImageView9 = findViewById(R.id.image_ac9);
        SimpleDraweeView mImageView10 = findViewById(R.id.image_ac10);
        SimpleDraweeView mImageView11 = findViewById(R.id.image_ac11);
        SimpleDraweeView mImageView12 = findViewById(R.id.image_ac12);
        SimpleDraweeView mImageView13 = findViewById(R.id.image_ac13);

        mImageView5.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/car_ac.jpeg?alt=media&token=e4823c3e-4065-419f-80ac-afc088650ebd");
        mImageView6.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/car%20clutch.jpg?alt=media&token=e8ee82f5-af3b-4ca0-924d-4f054b8613dd");
        mImageView7.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/car%20brake.jpg?alt=media&token=6e0cf9ad-08b2-4519-91db-c18c6ce13ec9");
        mImageView8.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/car%20suspension.jpg?alt=media&token=4e704506-ecaf-4f3a-85a6-0e74afefd95c");
        mImageView9.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/car%20start.jpg?alt=media&token=e5b1cd71-f522-4268-a845-806d50a6e42f");
        mImageView10.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/car_battery_replacement.jpg?alt=media&token=9cb06c82-3508-483d-9a19-e549ecfdf9ff");
        mImageView11.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/car%20inspection.jpg?alt=media&token=b0ca6722-e755-43dd-833f-8a2b31cc31d9");
        mImageView12.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/engine_diagnostics.jpg?alt=media&token=ac7ab9c9-814b-4afb-8fd2-84f6e0698f5d");
        mImageView13.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/denting_painting.jpeg?alt=media&token=5fff37ab-ab77-406e-be26-17dc9ff4ad3b");

        LinearLayout l5 = findViewById(R.id.ac5);
        LinearLayout l6 = findViewById(R.id.ac6);
        LinearLayout l7 = findViewById(R.id.ac7);
        LinearLayout l8 = findViewById(R.id.ac8);
        LinearLayout l9 = findViewById(R.id.ac9);
        LinearLayout l10 = findViewById(R.id.ac10);
        LinearLayout l11 = findViewById(R.id.ac11);
        LinearLayout l12 = findViewById(R.id.ac12);
        LinearLayout l13 = findViewById(R.id.ac13);

        PushDownAnim.setPushDownAnimTo(l5)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Car AC not working");
                        i.putExtra("price", "0");
                        startActivity(i);
                    }
                });
        PushDownAnim.setPushDownAnimTo(l6)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Clutch not working");
                        i.putExtra("price", "0");
                        startActivity(i);
                    }
                });
        PushDownAnim.setPushDownAnimTo(l7)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Trouble Braking");
                        i.putExtra("price", "0");
                        startActivity(i);
                    }
                });
        PushDownAnim.setPushDownAnimTo(l8)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Faulty Suspension");
                        i.putExtra("price", "0");
                        startActivity(i);
                    }
                });
        PushDownAnim.setPushDownAnimTo(l9)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Delay in Engine Start");
                        i.putExtra("price", "0");
                        startActivity(i);
                    }
                });
        PushDownAnim.setPushDownAnimTo(l10)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Battery Replacement");
                        i.putExtra("price", "0");
                        startActivity(i);
                    }
                });
        PushDownAnim.setPushDownAnimTo(l11)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Car Inspection Diagnostics");
                        i.putExtra("price", "0");
                        startActivity(i);
                    }
                });
        PushDownAnim.setPushDownAnimTo(l12)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Engine Diagnostics");
                        i.putExtra("price", "0");
                        startActivity(i);
                    }
                });
        PushDownAnim.setPushDownAnimTo(l13)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Denting & Painting");
                        i.putExtra("price", "0");
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
