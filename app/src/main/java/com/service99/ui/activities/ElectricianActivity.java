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

public class ElectricianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrician);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Electrician Services");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView i1 = findViewById(R.id.i1);
        i1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_elect_price_list.webp?alt=media&token=3da6f5ab-21aa-4b8f-8fb5-3951833a1e34");

        LinearLayout qb = findViewById(R.id.quickbook);
        PushDownAnim.setPushDownAnimTo(qb).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (FirebaseAuth.getInstance().getCurrentUser() == null) {
                    startActivity(new Intent(ElectricianActivity.this, LoginActivity.class));
                }else if(SharedPref.read(SharedPref.HNO,"").equals("")){
                    startActivity(new Intent(ElectricianActivity.this, AddressActivity.class));
                } else {


                    String hno, locality, area, phone, name;
                    hno = SharedPref.read(SharedPref.HNO, "");
                    locality = SharedPref.read(SharedPref.LOCALITY, "");
                    area = SharedPref.read(SharedPref.AREA, "");
                    phone = SharedPref.read(SharedPref.PHONE, "");
                    name = SharedPref.read(SharedPref.NAME, "");
                    String msg = "Service99" +
                            "\nService: Electrician Quickbook" +
                            "\nName: " + name +
                            "\nPhone: " + phone +
                            "\nAddress: " + hno + ", "
                            + locality + ", " + area + ", bhopal";

                    Help.send_gmail(ElectricianActivity.this, msg);
                }
            }
        });

        LinearLayout ss = findViewById(R.id.switchnsocket);
        PushDownAnim.setPushDownAnimTo(ss).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ElectricianActivity.this, ScheduleBooking.class);
                i.putExtra("title","Switch and Socket");
                i.putExtra("price","0");
                startActivity(i);

            }
        });

        LinearLayout fan = findViewById(R.id.fan);
        PushDownAnim.setPushDownAnimTo(fan).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ElectricianActivity.this, ScheduleBooking.class);
                i.putExtra("title","Fan Services");
                i.putExtra("price","0");
                startActivity(i);

            }
        });

        LinearLayout light = findViewById(R.id.light);
        PushDownAnim.setPushDownAnimTo(light).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ElectricianActivity.this, ScheduleBooking.class);
                i.putExtra("title","Light Services");
                i.putExtra("price","0");
                startActivity(i);

            }
        });

        LinearLayout chand = findViewById(R.id.chandelier);
        PushDownAnim.setPushDownAnimTo(chand).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ElectricianActivity.this, ScheduleBooking.class);
                i.putExtra("title","Chandelier Services");
                i.putExtra("price","0");
                startActivity(i);

            }
        });

        LinearLayout mcb = findViewById(R.id.mcb);
        PushDownAnim.setPushDownAnimTo(mcb).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ElectricianActivity.this, ScheduleBooking.class);
                i.putExtra("title","MCB and Fuse Services");
                i.putExtra("price","0");
                startActivity(i);

            }
        });

        LinearLayout invert = findViewById(R.id.inverter);
        PushDownAnim.setPushDownAnimTo(invert).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ElectricianActivity.this, ScheduleBooking.class);
                i.putExtra("title","Inverter and Stabilizer Services");
                i.putExtra("price","0");
                startActivity(i);

            }
        });

        LinearLayout wire = findViewById(R.id.wiring);
        PushDownAnim.setPushDownAnimTo(wire).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ElectricianActivity.this, ScheduleBooking.class);
                i.putExtra("title","Wiring Services");
                i.putExtra("price","0");
                startActivity(i);

            }
        });

        LinearLayout bell = findViewById(R.id.doorbell);
        PushDownAnim.setPushDownAnimTo(bell).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ElectricianActivity.this, ScheduleBooking.class);
                i.putExtra("title","Door Bell Services");
                i.putExtra("price","0");
                startActivity(i);

            }
        });

        LinearLayout drill = findViewById(R.id.drill);
        PushDownAnim.setPushDownAnimTo(drill).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ElectricianActivity.this, ScheduleBooking.class);
                i.putExtra("title","Drill and Hang Services");
                i.putExtra("price","0");
                startActivity(i);

            }
        });

        LinearLayout room = findViewById(R.id.roomheater);
        PushDownAnim.setPushDownAnimTo(room).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ElectricianActivity.this, ScheduleBooking.class);
                i.putExtra("title","Room Heater Services");
                i.putExtra("price","0");
                startActivity(i);
            }
        });

        LinearLayout s = findViewById(R.id.something_else);
        PushDownAnim.setPushDownAnimTo(s).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ElectricianActivity.this, ScheduleBooking.class);
                i.putExtra("title","Some Other Electrician Service");
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
