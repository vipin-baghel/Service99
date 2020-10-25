package com.service99.ui.appliance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.service99.R;
import com.service99.ui.activities.ScheduleBooking;
import com.thekhaeng.pushdownanim.PushDownAnim;

import java.util.Objects;


public class ACServicesActivity extends AppCompatActivity {

    TextView t, rs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acservices);
        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("AC Services");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView mImageView1 = findViewById(R.id.image_ac1);
        SimpleDraweeView mImageView2 = findViewById(R.id.image_ac2);
        SimpleDraweeView mImageView3 = findViewById(R.id.image_ac3);
        SimpleDraweeView mImageView4 = findViewById(R.id.image_ac4);
        SimpleDraweeView mImageView5 = findViewById(R.id.image_ac5);

        mImageView1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/ac%20installation.jpg?alt=media&token=24d97b56-bd12-499b-bcb3-0e339d3257c2");
        mImageView2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/ac-uninstallation.jpg?alt=media&token=e48983ae-6352-418b-bc65-086858860fc9");
        mImageView3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/ac%20gas%20refill.jpg?alt=media&token=d62703e6-ae14-4f09-89cc-b2b455b3d404");
        mImageView4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/ac%20not%20cooling.png?alt=media&token=e3363443-6c34-41f8-9f1f-224bc2d9ad92");
        mImageView5.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/ac%20other%20work.jpg?alt=media&token=e17213a6-d193-4b5a-aa19-ea52e4f21eb8");

        LinearLayout l1 = findViewById(R.id.ac1);
        LinearLayout l2 = findViewById(R.id.ac2);
        LinearLayout l3 = findViewById(R.id.ac3);
        LinearLayout l4 = findViewById(R.id.ac4);
        LinearLayout l5 = findViewById(R.id.ac5);

        PushDownAnim.setPushDownAnimTo(l1)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        t = findViewById(R.id.t1);
                        rs = findViewById(R.id.rs1);
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", t.getText());
                        i.putExtra("price", rs.getText());
                        startActivity(i);
                    }
                });
        PushDownAnim.setPushDownAnimTo(l2)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        t = findViewById(R.id.t2);
                        rs = findViewById(R.id.rs2);
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", t.getText());
                        i.putExtra("price", rs.getText());
                        startActivity(i);
                    }
                });
        PushDownAnim.setPushDownAnimTo(l3)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        t = findViewById(R.id.t3);
                        rs = findViewById(R.id.rs3);
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", t.getText());
                        i.putExtra("price", rs.getText());
                        startActivity(i);
                    }
                });
        PushDownAnim.setPushDownAnimTo(l4)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        t = findViewById(R.id.t4);
                        rs = findViewById(R.id.rs4);
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", t.getText());
                        i.putExtra("price", rs.getText());
                        startActivity(i);
                    }
                });
        PushDownAnim.setPushDownAnimTo(l5)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        t = findViewById(R.id.t5);
                        rs = findViewById(R.id.rs5);
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", t.getText());
                        i.putExtra("price", rs.getText());
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
