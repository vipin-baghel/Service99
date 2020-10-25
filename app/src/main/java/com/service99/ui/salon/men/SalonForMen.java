package com.service99.ui.salon.men;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.thekhaeng.pushdownanim.PushDownAnim;
import com.service99.R;

import java.util.Objects;

public class SalonForMen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon2_men);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Salon at Home for Men");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView footer = findViewById(R.id.footer);
        footer.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/salon_footer.webp?alt=media&token=652956e0-a0f3-49cb-a347-b1caaf159204");

        LinearLayout l1 = findViewById(R.id.l1);
        LinearLayout l2 = findViewById(R.id.l2);
        // LinearLayout l3 = findViewById(R.id.l3);
        LinearLayout l4 = findViewById(R.id.l4);
        LinearLayout l5 = findViewById(R.id.l5);
        LinearLayout l6 = findViewById(R.id.l6);
        LinearLayout l7 = findViewById(R.id.l7);
        LinearLayout l8 = findViewById(R.id.l8);
        LinearLayout l9 = findViewById(R.id.l9);
        LinearLayout l10 = findViewById(R.id.l10);
        LinearLayout l11 = findViewById(R.id.l11);
        LinearLayout l12 = findViewById(R.id.l12);

        PushDownAnim.setPushDownAnimTo(l1).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        PushDownAnim.setPushDownAnimTo(l2).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Haircut
                startActivity(new Intent(SalonForMen.this, MenTab.class)
                        .putExtra("pos", 0));
            }
        });
        PushDownAnim.setPushDownAnimTo(l4).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Face Care
                startActivity(new Intent(SalonForMen.this, MenTab.class)
                        .putExtra("pos", 1));
            }
        });
        PushDownAnim.setPushDownAnimTo(l5).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Shave
                startActivity(new Intent(SalonForMen.this, MenTab.class)
                        .putExtra("pos", 0));
            }
        });
        PushDownAnim.setPushDownAnimTo(l6).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Waxing
                startActivity(new Intent(SalonForMen.this, WaxingMen.class)
                       );
            }
        });
        PushDownAnim.setPushDownAnimTo(l7).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hair color
                startActivity(new Intent(SalonForMen.this, MenTab.class)
                        .putExtra("pos",2));
            }
        });
        PushDownAnim.setPushDownAnimTo(l8).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Hair Highlighting
                startActivity(new Intent(SalonForMen.this, MenTab.class)
                        .putExtra("pos",3));
            }
        });
        PushDownAnim.setPushDownAnimTo(l9).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hair Spa
                startActivity(new Intent(SalonForMen.this, MenTab.class)
                        .putExtra("pos",4));
            }
        });
        PushDownAnim.setPushDownAnimTo(l10).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //hair treatment
                startActivity(new Intent(SalonForMen.this, MenTab.class)
                        .putExtra("pos",3));
            }
        });
        PushDownAnim.setPushDownAnimTo(l11).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // massage
                startActivity(new Intent(SalonForMen.this, MassageMen.class));
            }
        });
        PushDownAnim.setPushDownAnimTo(l12).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Body Polish Men
                startActivity(new Intent(SalonForMen.this, BodyPolishMen.class));
            }
        });

    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
