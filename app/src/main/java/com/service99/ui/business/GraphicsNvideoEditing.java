package com.service99.ui.business;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.service99.R;
import com.service99.ui.activities.ScheduleBooking;
import com.thekhaeng.pushdownanim.PushDownAnim;

import java.util.Objects;

public class GraphicsNvideoEditing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphics_nvideo_editing);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("GST Registration");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView mImageView8 = findViewById(R.id.image_ac8);
        SimpleDraweeView mImageView9 = findViewById(R.id.image_ac9);
        SimpleDraweeView mImageView10 = findViewById(R.id.image_ac10);
        SimpleDraweeView mImageView11 = findViewById(R.id.image_ac11);
        SimpleDraweeView mImageView12 = findViewById(R.id.image_ac12);

        mImageView8.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/logo_design.jpeg?alt=media&token=b9fd0059-d700-492f-9d2b-9c5409c53e54");
        mImageView9.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/phamphlet.jpeg?alt=media&token=524e1eed-1daa-492b-9456-bcc837e79914");
        mImageView10.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/flex.jpeg?alt=media&token=f02ee1e5-a9cc-4da7-a1c5-1850aaf81dae");
        mImageView11.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/visiting%20card.jpeg?alt=media&token=3c93ee37-0a50-4fff-8951-0a50e4fafb4a");
        mImageView12.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/bus_promo_video.jpeg?alt=media&token=307f52aa-1dc9-4dcb-80ec-4b2d58fea741");

        LinearLayout l8 = findViewById(R.id.ac8);
        LinearLayout l9 = findViewById(R.id.ac9);
        LinearLayout l10 = findViewById(R.id.ac10);
        LinearLayout l11 = findViewById(R.id.ac11);
        LinearLayout l12 = findViewById(R.id.ac12);

        PushDownAnim.setPushDownAnimTo(l8)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "LOGO Design");
                        i.putExtra("price", "Rs. 499 onwards");
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l9)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Pamphlet/Flyer Design");
                        i.putExtra("price", "Rs. 199 onwards");
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l10)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Flex Design");
                        i.putExtra("price", "Rs. 199 onwards");
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l11)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), ScheduleBooking.class);
                        i.putExtra("title", "Visiting Card Design");
                        i.putExtra("price", "Rs. 99 onwards");
                        startActivity(i);
                    }
                });

        PushDownAnim.setPushDownAnimTo(l12)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        Intent i = new Intent(getApplicationContext(), VideoPromoActivity.class);
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
