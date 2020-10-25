package com.service99.ui.salon.women;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.thekhaeng.pushdownanim.PushDownAnim;
import com.service99.R;
import com.service99.ui.utilities.Help;

import java.util.Objects;

public class ComboWomen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo_women);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Combo");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView footer = findViewById(R.id.footer);
        footer.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/salon_footer.webp?alt=media&token=652956e0-a0f3-49cb-a347-b1caaf159204");

        ImageView l1 = findViewById(R.id.i1);
        ImageView l2 = findViewById(R.id.i2);
        ImageView l3 = findViewById(R.id.i3);
        ImageView l4 = findViewById(R.id.i4);
        ImageView l5 = findViewById(R.id.i5);

        PushDownAnim.setPushDownAnimTo(l1).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(ComboWomen.this, "Service:\nHaircut, Head Massage, Blow Dry, Hair Wash Combo for women");
            }
        });
        PushDownAnim.setPushDownAnimTo(l2).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(ComboWomen.this, "Service:\nRica Wax Combo for women");
            }
        });
        PushDownAnim.setPushDownAnimTo(l3).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(ComboWomen.this, "Service:\nCleanup, Waxing, Threading Combo for Women");
            }
        });
        PushDownAnim.setPushDownAnimTo(l4).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(ComboWomen.this, "Service:\nLotus Mani & Pedicure & Full Face Threading Combo for women");
            }
        });
        PushDownAnim.setPushDownAnimTo(l5).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(ComboWomen.this, "Service:\nLakme Party Makeup, Hair Do & Saree Draping Combo for women");
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
