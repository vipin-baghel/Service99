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

public class CleanUpSkinWomen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean_up_skin_women);
        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Clean-up");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView footer = findViewById(R.id.footer);
        footer.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/salon_footer.webp?alt=media&token=652956e0-a0f3-49cb-a347-b1caaf159204");

        SimpleDraweeView i2 = findViewById(R.id.i2);
        SimpleDraweeView i3 = findViewById(R.id.i3);
        SimpleDraweeView i4 = findViewById(R.id.i4);
        SimpleDraweeView i5 = findViewById(R.id.i5);
        SimpleDraweeView i6 = findViewById(R.id.i6);
        SimpleDraweeView i7 = findViewById(R.id.i7);
        SimpleDraweeView i8 = findViewById(R.id.i8);
        SimpleDraweeView i9 = findViewById(R.id.i9);
        SimpleDraweeView i10 = findViewById(R.id.i10);

        i2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/fruit-clean-up.webp?alt=media&token=d914c2c1-7835-4ead-8186-a2ed8fc319b4");
        i3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/vlcc%20cleanup.webp?alt=media&token=d12ede86-54e5-4759-8dd0-8725c9edf448");
        i4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/o3%2B%20cleanup.webp?alt=media&token=fcad6217-81ed-4087-9d4a-00ece841934c");
        i5.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/oxy%20cleanup.webp?alt=media&token=4762ca5b-4ed0-40ed-b28b-4d1aad0bc05d");
        i6.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/cheryls%20cleanup.webp?alt=media&token=eb91fc67-2d78-450b-991c-83b7a93aef4b");
        i7.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/vlcc%20cleanup.webp?alt=media&token=d12ede86-54e5-4759-8dd0-8725c9edf448");
        i8.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/o3%2B%20cleanup.webp?alt=media&token=fcad6217-81ed-4087-9d4a-00ece841934c");
        i9.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/shanhaz%20cleanup.webp?alt=media&token=cc99961b-122a-40fb-bc81-a8679e1d5c23");
        i10.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/aroma%20cleanup.webp?alt=media&token=29c0f09b-05a5-44c0-bc7d-50ffa3868e62");


        //  LinearLayout l1 = findViewById(R.id.l1);
        LinearLayout l2 = findViewById(R.id.l2);
        LinearLayout l3 = findViewById(R.id.l3);
        LinearLayout l4 = findViewById(R.id.l4);
        LinearLayout l5 = findViewById(R.id.l5);
        LinearLayout l6 = findViewById(R.id.l6);
        LinearLayout l7 = findViewById(R.id.l7);
        LinearLayout l8 = findViewById(R.id.l8);
        LinearLayout l9 = findViewById(R.id.l9);
        LinearLayout l10 = findViewById(R.id.l10);

       /* PushDownAnim.setPushDownAnimTo(l1).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(CleanUpSkinWomen.this, "Service:\nDetan Facemask");
            }
        });*/
        PushDownAnim.setPushDownAnimTo(l2).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(CleanUpSkinWomen.this, "Service:\nFruit Clean-up");
            }
        });
        PushDownAnim.setPushDownAnimTo(l3).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(CleanUpSkinWomen.this, "Service:\nVlCC Clean-up");
            }
        });
        PushDownAnim.setPushDownAnimTo(l4).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(CleanUpSkinWomen.this, "Service:\nO3+ Clean-up");
            }
        });
        PushDownAnim.setPushDownAnimTo(l5).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(CleanUpSkinWomen.this, "Service:\nOXY Cleanup");
            }
        });
        PushDownAnim.setPushDownAnimTo(l6).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(CleanUpSkinWomen.this, "Service:\nCheryls Clean-up");
            }
        });
        PushDownAnim.setPushDownAnimTo(l7).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(CleanUpSkinWomen.this, "Service:\nLotus Clean-up");
            }
        });
        PushDownAnim.setPushDownAnimTo(l8).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(CleanUpSkinWomen.this, "Service:\nNature's Gold Cleaning");
            }
        });
        PushDownAnim.setPushDownAnimTo(l9).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(CleanUpSkinWomen.this, "Service:\nShahnaz Husain Clean-up");
            }
        });
        PushDownAnim.setPushDownAnimTo(l10).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(CleanUpSkinWomen.this, "Service:\nAroma Magic Clean-up");
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
