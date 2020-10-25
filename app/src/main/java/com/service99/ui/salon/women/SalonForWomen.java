package com.service99.ui.salon.women;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.thekhaeng.pushdownanim.PushDownAnim;
import com.service99.R;
import com.service99.ui.salon.women.hair.HairCareWomen;
import com.service99.ui.salon.women.waxing.WaxingWomen;

import java.util.Objects;

public class SalonForWomen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon2_women);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Salon at home for Women");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView footer = findViewById(R.id.footer);
        footer.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/salon_footer.webp?alt=media&token=652956e0-a0f3-49cb-a347-b1caaf159204");

        LinearLayout l1 = findViewById(R.id.l1);
        LinearLayout l2 = findViewById(R.id.l2);
        LinearLayout l3 = findViewById(R.id.l3);
        LinearLayout l4 = findViewById(R.id.l4);
        LinearLayout l5 = findViewById(R.id.l5);
        LinearLayout l6 = findViewById(R.id.l6);
        LinearLayout l7 = findViewById(R.id.l7);
        LinearLayout l8 = findViewById(R.id.l8);
        LinearLayout l9 = findViewById(R.id.l9);

        PushDownAnim.setPushDownAnimTo(l1).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SalonForWomen.this, ComboWomen.class));
            }
        });
        PushDownAnim.setPushDownAnimTo(l2).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SalonForWomen.this, SkinCare.class));
            }
        });
        PushDownAnim.setPushDownAnimTo(l3).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SalonForWomen.this, HairCareWomen.class));
            }
        });
        PushDownAnim.setPushDownAnimTo(l4).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(SalonForWomen.this, WaxingWomen.class));
            }
        });
        PushDownAnim.setPushDownAnimTo(l5).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SalonForWomen.this, Threading.class));
            }
        });
        PushDownAnim.setPushDownAnimTo(l6).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SalonForWomen.this, PedicureManicure.class));
            }
        });
        PushDownAnim.setPushDownAnimTo(l7).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SalonForWomen.this, MakeUp.class));
            }
        });
        PushDownAnim.setPushDownAnimTo(l8).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SalonForWomen.this, MassageWomen.class));
            }
        });
        PushDownAnim.setPushDownAnimTo(l9).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SalonForWomen.this, BodyPolishWomen.class));
            }
        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
