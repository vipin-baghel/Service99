package com.service99.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.google.firebase.auth.FirebaseAuth;
import com.service99.R;
import com.service99.ui.auth.AddressActivity;
import com.service99.ui.auth.LoginActivity;
import com.service99.ui.utilities.Help;
import com.service99.ui.utilities.SharedPref;
import com.thekhaeng.pushdownanim.PushDownAnim;

import java.util.Objects;

public class PlumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plumber);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Plumber Services");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView i1 = findViewById(R.id.i1);
        i1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_plumber_price_list.webp?alt=media&token=8151501a-bcd5-469f-8a45-c5d43a5c2270");

        LinearLayout qb = findViewById(R.id.quickbook);
        PushDownAnim.setPushDownAnimTo(qb).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (FirebaseAuth.getInstance().getCurrentUser() == null) {
                    startActivity(new Intent(PlumberActivity.this, LoginActivity.class));
                }else if(SharedPref.read(SharedPref.HNO,"").equals("")){
                    startActivity(new Intent(PlumberActivity.this, AddressActivity.class));
                } else {
                    String hno, locality, area, phone, name;
                    hno = SharedPref.read(SharedPref.HNO, "");
                    locality = SharedPref.read(SharedPref.LOCALITY, "");
                    area = SharedPref.read(SharedPref.AREA, "");
                    phone = SharedPref.read(SharedPref.PHONE, "");
                    name = SharedPref.read(SharedPref.NAME, "");
                    String msg = "Service99" +
                            "\nService: Plumber Quickbook" +
                            "\nName: " + name +
                            "\nPhone: " + phone +
                            "\nAddress: " + hno + ", "
                            + locality + ", " + area + ", bhopal";

                    Help.send_gmail(PlumberActivity.this, msg);
                }
            }
        });

        LinearLayout s = findViewById(R.id.something_else);
        PushDownAnim.setPushDownAnimTo(s).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlumberActivity.this, ScheduleBooking.class);
                i.putExtra("title","Some Other Electrician Service");
                i.putExtra("price","0");
                startActivity(i);
            }
        });

        LinearLayout s1 = findViewById(R.id.basinnsink);
        PushDownAnim.setPushDownAnimTo(s1).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlumberActivity.this, ScheduleBooking.class);
                i.putExtra("title","Basin and Sink Plumbing");
                i.putExtra("price","0");
                startActivity(i);
            }
        });

        LinearLayout s2 = findViewById(R.id.bathfitting);
        PushDownAnim.setPushDownAnimTo(s2).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlumberActivity.this, ScheduleBooking.class);
                i.putExtra("title","Bath Fitting");
                i.putExtra("price","0");
                startActivity(i);
            }
        });

        LinearLayout s3 = findViewById(R.id.blockage);
        PushDownAnim.setPushDownAnimTo(s3).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlumberActivity.this, ScheduleBooking.class);
                i.putExtra("title","Blockage Plumbing");
                i.putExtra("price","0");
                startActivity(i);
            }
        });
        LinearLayout s4 = findViewById(R.id.tapnmixer);
        PushDownAnim.setPushDownAnimTo(s4).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlumberActivity.this, ScheduleBooking.class);
                i.putExtra("title","Tap and Mixer Plumbing");
                i.putExtra("price","0");
                startActivity(i);
            }
        });
        LinearLayout s5 = findViewById(R.id.toilet);
        PushDownAnim.setPushDownAnimTo(s5).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlumberActivity.this, ScheduleBooking.class);
                i.putExtra("title","Toilet Plumbing");
                i.putExtra("price","0");
                startActivity(i);
            }
        });

        LinearLayout s6 = findViewById(R.id.watertank);
        PushDownAnim.setPushDownAnimTo(s6).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlumberActivity.this, ScheduleBooking.class);
                i.putExtra("title","Water Tank Plumbing");
                i.putExtra("price","0");
                startActivity(i);
            }
        });

        LinearLayout s7 = findViewById(R.id.motor);
        PushDownAnim.setPushDownAnimTo(s7).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlumberActivity.this, ScheduleBooking.class);
                i.putExtra("title","Water Motor Fitting/Plumbing");
                i.putExtra("price","0");
                startActivity(i);
            }
        });
        LinearLayout s8 = findViewById(R.id.minor_installation);
        PushDownAnim.setPushDownAnimTo(s8).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlumberActivity.this, ScheduleBooking.class);
                i.putExtra("title","Minor Installation/Plumbing");
                i.putExtra("price","0");
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
