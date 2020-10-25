package com.service99.ui.salon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.service99.ui.salon.men.SalonForMen;
import com.service99.ui.salon.women.SalonForWomen;
import com.thekhaeng.pushdownanim.PushDownAnim;
import com.service99.R;

import java.util.Objects;

public class SalonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Choose your Gender");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView footer = findViewById(R.id.footer);
        footer.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/salon_footer.webp?alt=media&token=652956e0-a0f3-49cb-a347-b1caaf159204");

        SimpleDraweeView she = findViewById(R.id.she);
        she.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/she.jpg?alt=media&token=9a84cb88-bd78-4ba8-a492-dc8fd674daca");

        SimpleDraweeView he = findViewById(R.id.he);
        he.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/he.jpg?alt=media&token=e6f32605-746a-485a-83d3-bdcb30256cf0");


        LinearLayout l1 = findViewById(R.id.l1);
        LinearLayout l2 = findViewById(R.id.l2);
        PushDownAnim.setPushDownAnimTo(l1).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SalonActivity.this, SalonForWomen.class));
            }
        });

        PushDownAnim.setPushDownAnimTo(l2).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SalonActivity.this, SalonForMen.class));
            }
        });



    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
