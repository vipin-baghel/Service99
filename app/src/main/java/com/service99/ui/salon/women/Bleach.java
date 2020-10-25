package com.service99.ui.salon.women;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.thekhaeng.pushdownanim.PushDownAnim;
import com.service99.R;
import com.service99.ui.utilities.Help;

import java.util.Objects;

public class Bleach extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bleach);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Bleach");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView footer = findViewById(R.id.footer);
        footer.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/salon_footer.webp?alt=media&token=652956e0-a0f3-49cb-a347-b1caaf159204");

        SimpleDraweeView i1 = findViewById(R.id.i1);
        SimpleDraweeView i2 = findViewById(R.id.i2);
        SimpleDraweeView i3 = findViewById(R.id.i3);
        SimpleDraweeView i4 = findViewById(R.id.i4);
        SimpleDraweeView i5 = findViewById(R.id.i5);
        SimpleDraweeView i6 = findViewById(R.id.i6);
        SimpleDraweeView i7 = findViewById(R.id.i7);
        SimpleDraweeView i8 = findViewById(R.id.i8);
        SimpleDraweeView i9 = findViewById(R.id.i9);
        SimpleDraweeView i10 = findViewById(R.id.i10);
        SimpleDraweeView i11 = findViewById(R.id.i11);

        i1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/bleach-face.jpeg?alt=media&token=97eb5432-ab4e-4309-bd63-060842998aea");
        i2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/bleach-face.jpeg?alt=media&token=97eb5432-ab4e-4309-bd63-060842998aea");
        i3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/bleach-hands.jpeg?alt=media&token=01600b98-0c1d-44c6-a98c-11ee878a3d40");
        i4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/bleach-legs.jpeg?alt=media&token=91974575-26a8-4751-bfdb-0f7b79d50044");
        i5.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/bleach-back.jpeg?alt=media&token=7b99d40f-7792-445a-a982-86ac51a8c95e");
        i6.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/bleach-face.jpeg?alt=media&token=97eb5432-ab4e-4309-bd63-060842998aea");
        i7.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/bleach-back.jpeg?alt=media&token=7b99d40f-7792-445a-a982-86ac51a8c95e");
        i8.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/bleach_full_leg.jpg?alt=media&token=29429636-baab-4ef8-98cb-fd193702d803");
        i9.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/bleach-legs.jpeg?alt=media&token=91974575-26a8-4751-bfdb-0f7b79d50044");
        i10.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/bleach-face.jpeg?alt=media&token=97eb5432-ab4e-4309-bd63-060842998aea");
        i11.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/bleach.jpeg?alt=media&token=eef57c3c-5d55-4f3b-b467-ffbec78d57cd");


        LinearLayout l1 = findViewById(R.id.l1);
        LinearLayout l2 = findViewById(R.id.l2);
        LinearLayout l3 = findViewById(R.id.l3);
        LinearLayout l4 = findViewById(R.id.l4);
        LinearLayout l5 = findViewById(R.id.l5);
        LinearLayout l6 = findViewById(R.id.l6);
        LinearLayout l7 = findViewById(R.id.l7);
        LinearLayout l8 = findViewById(R.id.l8);
        LinearLayout l9 = findViewById(R.id.l9);
        LinearLayout l10 = findViewById(R.id.l10);
        LinearLayout l11= findViewById(R.id.l11);

        PushDownAnim.setPushDownAnimTo(l1).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Bleach.this, "Service:\nFace & Neck Nature's Gold Bleach");
            }
        });
        PushDownAnim.setPushDownAnimTo(l2).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Bleach.this, "Service:\nCheryls - Face & Neck Bleach");
            }
        });
        PushDownAnim.setPushDownAnimTo(l3).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Bleach.this, "Service:\nFull Arms Bleach");
            }
        });
        PushDownAnim.setPushDownAnimTo(l4).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Bleach.this, "Service:\nFull Arms & Full Legs Bleach");
            }
        });
        PushDownAnim.setPushDownAnimTo(l5).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Bleach.this, "Service:\nFull Back Bleach");
            }
        });
        PushDownAnim.setPushDownAnimTo(l6).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Bleach.this, "Service:\nFull Front Bleach");
            }
        });
        PushDownAnim.setPushDownAnimTo(l7).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Bleach.this, "Service:\nFull Body Bleach");
            }
        });
        PushDownAnim.setPushDownAnimTo(l8).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Bleach.this, "Service:\nFull Legs Bleach");
            }
        });
        PushDownAnim.setPushDownAnimTo(l9).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Bleach.this, "Service:\nFeet Bleach");
            }
        });
        PushDownAnim.setPushDownAnimTo(l10).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Bleach.this, "Service:\nO3+ Face Bleach");
            }
        });
        PushDownAnim.setPushDownAnimTo(l11).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Bleach.this, "Service:\nVLCC Gold Bleach");
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
