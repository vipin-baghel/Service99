package com.service99.ui.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.service99.R;
import com.service99.ui.utilities.Help;
import com.thekhaeng.pushdownanim.PushDownAnim;

import java.util.Objects;

public class CCTVActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cctv);


        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("CCTV Services");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button b = findViewById(R.id.cnf_btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(CCTVActivity.this, "Service: CCTV \n Book enquiry or free Demo ","0");
            }
        });

        ImageView i1 = findViewById(R.id.i1);
        PushDownAnim.setPushDownAnimTo(i1).setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(CCTVActivity.this,"Service: CCTV \n2 Cameras set","Rs. 8499");
                    }
                });

        ImageView i2 = findViewById(R.id.i2);
        PushDownAnim.setPushDownAnimTo(i2).setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(CCTVActivity.this,"Service: CCTV \n4 Cameras set","Rs. 1099");
                    }
                });

        ImageView i3 = findViewById(R.id.i3);
        PushDownAnim.setPushDownAnimTo(i3).setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(CCTVActivity.this,"Service: CCTV \n6 Cameras set","Rs. 1899");
                    }
                });

        ImageView i4 = findViewById(R.id.i4);
        PushDownAnim.setPushDownAnimTo(i4).setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(CCTVActivity.this,"Service: CCTV \n8 Cameras set","Rs. 2199");
                    }
                });

        ImageView i5 = findViewById(R.id.i5);
        PushDownAnim.setPushDownAnimTo(i5).setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(CCTVActivity.this,"Service: CCTV \n16 Cameras set","Rs. 3399");
                    }
                });

        ImageView i6 = findViewById(R.id.i6);
        PushDownAnim.setPushDownAnimTo(i6).setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(CCTVActivity.this,"Service: CCTV \nInstallation Only","Rs. 349");
                    }
                });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
