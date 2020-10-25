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

public class Detanning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detanning);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Detanning");
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

        i1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/detanning1.jpeg?alt=media&token=be90bbbb-f4f3-46bd-8722-d71430b79eba");
        i2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/neck%20detan.webp?alt=media&token=ecf6db0b-7ff1-43f6-a0ca-4b2445840fc5");
        i3.setImageURI("");
        i4.setImageURI("");
        i5.setImageURI("");
        i6.setImageURI("");
        i7.setImageURI("");
        i8.setImageURI("");
        i9.setImageURI("");
        i10.setImageURI("");


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

        PushDownAnim.setPushDownAnimTo(l1).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Detanning.this, "Service:\nFace Detanning");
            }
        });
        PushDownAnim.setPushDownAnimTo(l2).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Detanning.this, "Service:\nNeck Detaning");
            }
        });
        PushDownAnim.setPushDownAnimTo(l3).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Detanning.this, "Service:\nFull Arms Detanning");
            }
        });
        PushDownAnim.setPushDownAnimTo(l4).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Detanning.this, "Service:\nHalf Legs Detanning");
            }
        });
        PushDownAnim.setPushDownAnimTo(l5).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Detanning.this, "Service:\nFull Legs Detanning");
            }
        });
        PushDownAnim.setPushDownAnimTo(l6).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Detanning.this, "Service:\nUnderarms Detanning");
            }
        });
        PushDownAnim.setPushDownAnimTo(l7).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Detanning.this, "Service:\nHalf Back/Front Detanning");
            }
        });
        PushDownAnim.setPushDownAnimTo(l8).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Detanning.this, "Service:\nFull Back/Front Detanning");
            }
        });
        PushDownAnim.setPushDownAnimTo(l9).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Detanning.this, "Service:\nFace, Neck & Blouse line Detanning");
            }
        });
        PushDownAnim.setPushDownAnimTo(l10).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Detanning.this, "Service:\nFace, Neck & Back Detanning");
            }
        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
