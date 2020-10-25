package com.service99.ui.cleaning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.service99.ui.activities.ScheduleBooking;
import com.thekhaeng.pushdownanim.PushDownAnim;
import com.service99.R;

import java.util.Objects;

public class CleaningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Cleaning Services");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView mImageView1 = findViewById(R.id.image_ac1);
        SimpleDraweeView mImageView2 = findViewById(R.id.image_ac2);
        SimpleDraweeView mImageView4 = findViewById(R.id.image_ac4);
        SimpleDraweeView mImageView5 = findViewById(R.id.image_ac5);
        SimpleDraweeView mImageView6 = findViewById(R.id.image_ac6);
        SimpleDraweeView mImageView7 = findViewById(R.id.image_ac7);
        SimpleDraweeView mImageView8 = findViewById(R.id.image_ac8);
        SimpleDraweeView mImageView9 = findViewById(R.id.image_ac9);
        SimpleDraweeView mImageView10 = findViewById(R.id.image_ac10);

        mImageView1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/cleaning%2Fbathroomcleaning.jpeg?alt=media&token=5c9cd654-f541-41c3-bd0e-92132acc23d8");
        mImageView2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/cleaning%2Fkitchendeepcleaning.jpeg?alt=media&token=50ec2242-ffc5-42f7-a9b0-94ac3da5d192");
        mImageView4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/cleaning%2Fhomedeepcleaning.jpeg?alt=media&token=6e377baa-4fff-4eb1-8870-3eacffe3c5b6");
        mImageView10.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/cleaning%2Fhomedeepcleaning.jpeg?alt=media&token=6e377baa-4fff-4eb1-8870-3eacffe3c5b6");
        mImageView5.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/cleaning%2Fwatertankcleaning.jpeg?alt=media&token=42bee392-0162-47a0-a61c-37ef9dde42c9");
        mImageView6.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/cleaning%2Fsofacleaning.jpeg?alt=media&token=dd17c07e-c6f6-41e0-9d2a-d5659b71d615");
        mImageView7.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/cleaning%2Fcarpetcleaning.jpeg?alt=media&token=ffe48d3b-531e-4d18-a4e3-a08073710b49");
        mImageView8.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/cleaning%2Fcarwash.jpeg?alt=media&token=f75db2e4-03b4-43c2-8be5-9b2b1838999f");
        mImageView9.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/othercleaning.jpeg?alt=media&token=7ba58077-5f15-4b4b-a518-d0e1b99b6d14");

        LinearLayout l1 = findViewById(R.id.ac1);
        LinearLayout l2 = findViewById(R.id.ac2);
        LinearLayout l4 = findViewById(R.id.ac4);
        LinearLayout l5 = findViewById(R.id.ac5);
        LinearLayout l6 = findViewById(R.id.ac6);
        LinearLayout l7 = findViewById(R.id.ac7);
        LinearLayout l8 = findViewById(R.id.ac8);
        LinearLayout l9 = findViewById(R.id.ac9);
        LinearLayout l10 = findViewById(R.id.ac10);


        PushDownAnim.setPushDownAnimTo(l1)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Bathroom Cleaning");
                        i.putExtra("price", "Rs. 199 onwards");
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
                        i.putExtra("title", "Kitchen Deep Cleaning");
                        i.putExtra("price", "Rs. 999 onwards");
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
                        i.putExtra("title", "Full Home Deep Cleaning");
                        i.putExtra("price", "Rs. 3499 onwards");
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
                        i.putExtra("title", "Full Home Basic Cleaning");
                        i.putExtra("price", "Rs. 1999 onwards");
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
                        i.putExtra("title", "Water Tank Cleaning");
                        i.putExtra("price", "Rs. 299 onwards");
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
                        i.putExtra("title", "Sofa Cleaning");
                        i.putExtra("price", "Rs. 150 per seat");
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
                        i.putExtra("title", "Carpet Cleaning");
                        i.putExtra("price", "Rs. 299 onwards");
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
                        i.putExtra("title", "Car Wash & Vacuum Cleaning");
                        i.putExtra("price", "Rs. 299 onwards");
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
                        i.putExtra("title", "Other Cleaning Service");
                        i.putExtra("price", "On Inspection");
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
