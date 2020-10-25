package com.service99.ui.salon.women.hair;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.thekhaeng.pushdownanim.PushDownAnim;
import com.service99.R;
import com.service99.ui.utilities.Help;

import java.util.Objects;

public class HaircolorWomen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haircolor_women);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Hair Color");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView footer = findViewById(R.id.footer);
        footer.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/salon_footer.webp?alt=media&token=652956e0-a0f3-49cb-a347-b1caaf159204");

        SimpleDraweeView mImageView1 = findViewById(R.id.i1);
        SimpleDraweeView mImageView2 = findViewById(R.id.i2);
        SimpleDraweeView mImageView3 = findViewById(R.id.i3);
        SimpleDraweeView mImageView4 = findViewById(R.id.i4);
        SimpleDraweeView mImageView5 = findViewById(R.id.i5);
        SimpleDraweeView mImageView6 = findViewById(R.id.i6);
        SimpleDraweeView mImageView7 = findViewById(R.id.i7);
        SimpleDraweeView mImageView8 = findViewById(R.id.i8);
        SimpleDraweeView mImageView9 = findViewById(R.id.i9);
        SimpleDraweeView mImageView10 = findViewById(R.id.i10);

        mImageView1.setImageURI("");
        mImageView2.setImageURI("");
        mImageView3.setImageURI("");
        mImageView4.setImageURI("");
        mImageView5.setImageURI("");
        mImageView6.setImageURI("");
        mImageView7.setImageURI("");
        mImageView8.setImageURI("");
        mImageView9.setImageURI("");
        mImageView10.setImageURI("");

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

        PushDownAnim.setPushDownAnimTo(l1)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(HaircolorWomen.this, "Service:\nOnly Hair Color for Women");

                    }
                });
        PushDownAnim.setPushDownAnimTo(l2)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(HaircolorWomen.this, "Service:\nNormal Root Touch-up for Women");

                    }
                });
        PushDownAnim.setPushDownAnimTo(l3)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(HaircolorWomen.this, "Service:\nMatrix Root Touch-up for Women");

                    }
                });
        PushDownAnim.setPushDownAnimTo(l4)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(HaircolorWomen.this, "Service:\nAmmonia Free Root Touch-up for Women");

                    }
                });
        PushDownAnim.setPushDownAnimTo(l5)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(HaircolorWomen.this, "Service:\nMajirel Root Touch-up for Women");

                    }
                });
        PushDownAnim.setPushDownAnimTo(l6)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(HaircolorWomen.this, "Service:\nMatix Global Hair Color for Women");

                    }
                });
        PushDownAnim.setPushDownAnimTo(l7)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(HaircolorWomen.this, "Service:\nMajirel Global Hair Color for Women");

                    }
                });
        PushDownAnim.setPushDownAnimTo(l8)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(HaircolorWomen.this, "Service:\nAmmonia Free Global Hair Color for Women");

                    }
                });
        PushDownAnim.setPushDownAnimTo(l9)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(HaircolorWomen.this, "Service:\nStreak Global Hair Color for Women");

                    }
                });
        PushDownAnim.setPushDownAnimTo(l10)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Help.schedule(HaircolorWomen.this, "Service:\nGodrej Global Hair Color for Women");

                    }
                });
        
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
