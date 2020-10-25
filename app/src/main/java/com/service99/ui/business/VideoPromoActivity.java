package com.service99.ui.business;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.service99.R;
import com.service99.ui.utilities.Help;

import java.util.Objects;

public class VideoPromoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_promo);
        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Business Promotion Video Making");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView i1 = findViewById(R.id.i1);
        SimpleDraweeView i2 = findViewById(R.id.i2);
        SimpleDraweeView i3 = findViewById(R.id.i3);
        SimpleDraweeView i4 = findViewById(R.id.i4);
        i1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_vp1.webp?alt=media&token=d9fcc2fa-f80a-4396-8026-ba140e2aa466");
        i2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_vp2.webp?alt=media&token=0dd6a18a-ae16-4369-b783-45fcc2fa9485");
        i3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_vp3.webp?alt=media&token=cd02938d-6a74-4c21-91c0-1befd74813d1");
        i4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_vp4.webp?alt=media&token=ee1db78f-1e2e-458b-9d4b-416f2da66645");

        Button b = findViewById(R.id.cnf_btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(VideoPromoActivity.this, "Service:\n Business Promotion Video Making");

            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
