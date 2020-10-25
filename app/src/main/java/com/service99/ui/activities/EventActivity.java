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

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Event Services");
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

        mImageView1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/party-tent-big.jpg?alt=media&token=34996c24-e271-4f4d-8d3f-73e0241b8cdc");
        mImageView2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/catering.jpg?alt=media&token=c1379740-a174-462f-9d65-98e7a648d71a");
        mImageView3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/dj.jpg?alt=media&token=a3347f21-1a91-4448-b24e-86ec979d7676");
        mImageView4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/venue%20decoration.jpg?alt=media&token=1a4a21c5-77d9-451d-a971-2649612e0480");
        mImageView5.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/photographer.jpg?alt=media&token=9aa97761-f875-44a3-a346-46d11af5bf28");
        mImageView6.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/pre-wedding.jpg?alt=media&token=0c2b05d7-2b1b-4613-a6b2-69fc313c9d95");
        mImageView7.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/bridal_makeup.jpeg?alt=media&token=c6df6e4d-d1e8-48c3-b05d-304b9653d556");
        mImageView8.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/party_makeup.jpg?alt=media&token=8e2c514a-014b-4853-b261-3f0bbb4c44f8");

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
                        //on click
                        Help.schedule(EventActivity.this, "Service:\n Tent");

                    }
                });
        PushDownAnim.setPushDownAnimTo(l2)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(EventActivity.this, "Service:\n Catering");

                    }
                });
        PushDownAnim.setPushDownAnimTo(l3)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(EventActivity.this, "Service:\n DJ");

                    }
                });
        PushDownAnim.setPushDownAnimTo(l4)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(EventActivity.this, "Service:\n Venue Decoration");

                    }
                });
        PushDownAnim.setPushDownAnimTo(l5)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(EventActivity.this, "Service: \nEvent Photographer");

                    }
                });
        PushDownAnim.setPushDownAnimTo(l6)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(EventActivity.this, "Service:\n Pre-Wedding Shoot");

                    }
                });
        PushDownAnim.setPushDownAnimTo(l7)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(EventActivity.this, "Service:\n Bridal Makeup Artist");
                    }
                });
        PushDownAnim.setPushDownAnimTo(l8)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(EventActivity.this, "Service:\n Party Makeup Artist");

                    }
                });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
