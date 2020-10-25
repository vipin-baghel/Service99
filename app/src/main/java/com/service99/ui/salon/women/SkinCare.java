package com.service99.ui.salon.women;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.thekhaeng.pushdownanim.PushDownAnim;
import com.service99.R;
import com.service99.ui.salon.women.facial.FacialWomen;

import java.util.Objects;

public class SkinCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_care);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Skin Care for Women");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView footer = findViewById(R.id.footer);
        footer.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/salon_footer.webp?alt=media&token=652956e0-a0f3-49cb-a347-b1caaf159204");

        SimpleDraweeView mImageView1 = findViewById(R.id.image_ac1);
        SimpleDraweeView mImageView2 = findViewById(R.id.image_ac2);
        SimpleDraweeView mImageView3 = findViewById(R.id.image_ac3);
        SimpleDraweeView mImageView4 = findViewById(R.id.image_ac4);


        mImageView1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/bleach.jpeg?alt=media&token=eef57c3c-5d55-4f3b-b467-ffbec78d57cd");
        mImageView2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/cleanup_face.jpg?alt=media&token=e0ef248d-af8f-4d48-80a6-62e00e529cb9");
        mImageView3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/detanning1.jpeg?alt=media&token=be90bbbb-f4f3-46bd-8722-d71430b79eba");
        mImageView4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/facial.jpeg?alt=media&token=cd08b9b2-d7e2-4d8a-b62f-3dab486d9d01");


        LinearLayout l1 = findViewById(R.id.ac1);
        LinearLayout l2 = findViewById(R.id.ac2);
        LinearLayout l3 = findViewById(R.id.ac3);
        LinearLayout l4 = findViewById(R.id.ac4);
        

        PushDownAnim.setPushDownAnimTo(l1)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        startActivity(new Intent(SkinCare.this, Bleach.class));
                    }
                });
        PushDownAnim.setPushDownAnimTo(l2)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        startActivity(new Intent(SkinCare.this, CleanUpSkinWomen.class));

                    }
                });
        PushDownAnim.setPushDownAnimTo(l3)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        startActivity(new Intent(SkinCare.this, Detanning.class));
                    }
                });
        PushDownAnim.setPushDownAnimTo(l4)
                .setScale(0.9f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //on click
                        startActivity(new Intent(SkinCare.this, FacialWomen.class));

                    }
                });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
