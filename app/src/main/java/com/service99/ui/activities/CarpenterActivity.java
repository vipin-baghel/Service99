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


public class CarpenterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpenter);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Carpenter Services");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView i1 = findViewById(R.id.i1);
        i1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_carpenter_price_list.webp?alt=media&token=c2943478-9524-4689-977d-8455323b6352");

        LinearLayout qb = findViewById(R.id.quickbook);
        PushDownAnim.setPushDownAnimTo(qb).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (FirebaseAuth.getInstance().getCurrentUser() == null) {
                    startActivity(new Intent(CarpenterActivity.this, LoginActivity.class));
                }else if(SharedPref.read(SharedPref.HNO,"").equals("")){
                    startActivity(new Intent(CarpenterActivity.this, AddressActivity.class));
                } else {


                    String hno, locality, area, phone, name;
                    hno = SharedPref.read(SharedPref.HNO, "");
                    locality = SharedPref.read(SharedPref.LOCALITY, "");
                    area = SharedPref.read(SharedPref.AREA, "");
                    phone = SharedPref.read(SharedPref.PHONE, "");
                    name = SharedPref.read(SharedPref.NAME, "");
                    String msg = "Service99" +
                            "\nService: Carpenter Quickbook" +
                            "\nName: " + name +
                            "\nPhone: " + phone +
                            "\nAddress: " + hno + ", "
                            + locality + ", " + area + ", bhopal";

                    Help.send_gmail(CarpenterActivity.this, msg);
                }
            }
        });

        LinearLayout s = findViewById(R.id.something_else);
        PushDownAnim.setPushDownAnimTo(s).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CarpenterActivity.this, ScheduleBooking.class);
                i.putExtra("title","Some Other Carpenter Service");
                i.putExtra("price","0");
                startActivity(i);
            }
        });

        LinearLayout b = findViewById(R.id.balcony);
        PushDownAnim.setPushDownAnimTo(b).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CarpenterActivity.this, ScheduleBooking.class);
                i.putExtra("title","Balcony");
                i.putExtra("price","0");
                startActivity(i);

            }
        });

        LinearLayout bed = findViewById(R.id.bed);
        PushDownAnim.setPushDownAnimTo(bed).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CarpenterActivity.this, ScheduleBooking.class);
                i.putExtra("title","Bed");
                i.putExtra("price","0");
                startActivity(i);

            }
        });

        LinearLayout cb = findViewById(R.id.cupboard);
        PushDownAnim.setPushDownAnimTo(cb).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CarpenterActivity.this, ScheduleBooking.class);
                i.putExtra("title","Cupboard and Drawer");
                i.putExtra("price","0");
                startActivity(i);
            }
        });

        LinearLayout door = findViewById(R.id.door);
        PushDownAnim.setPushDownAnimTo(door).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CarpenterActivity.this, ScheduleBooking.class);
                i.putExtra("title","Door");
                i.putExtra("price","0");
                startActivity(i);
            }
        });

        LinearLayout drill = findViewById(R.id.drillnhang);
        PushDownAnim.setPushDownAnimTo(drill).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CarpenterActivity.this, ScheduleBooking.class);
                i.putExtra("title","Drill and Hang");
                i.putExtra("price","0");
                startActivity(i);
            }
        });

        LinearLayout f = findViewById(R.id.furnitureassembly);
        PushDownAnim.setPushDownAnimTo(f).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CarpenterActivity.this, ScheduleBooking.class);
                i.putExtra("title","Furniture Assembly");
                i.putExtra("price","0");
                startActivity(i);
            }
        });

        LinearLayout fr = findViewById(R.id.furniturerepair);
        PushDownAnim.setPushDownAnimTo(fr).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CarpenterActivity.this, ScheduleBooking.class);
                i.putExtra("title","Furniture Repair");
                i.putExtra("price","0");
                startActivity(i);
            }
        });

        LinearLayout w = findViewById(R.id.windowncurtain);
        PushDownAnim.setPushDownAnimTo(w).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CarpenterActivity.this, ScheduleBooking.class);
                i.putExtra("title","Window and Curtain");
                i.putExtra("price","0");
                startActivity(i);
            }
        });

        LinearLayout m = findViewById(R.id.misc);
        PushDownAnim.setPushDownAnimTo(m).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CarpenterActivity.this, ScheduleBooking.class);
                i.putExtra("title","Miscellaneous");
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
