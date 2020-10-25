package com.service99.ui.contact_us;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.service99.R;

import java.util.Objects;

public class OurTeam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_team);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Our Team");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView image_nikhil = findViewById(R.id.nikhil_image);
        SimpleDraweeView image_vivek = findViewById(R.id.vivek_image);
        SimpleDraweeView image_vipin = findViewById(R.id.vipin_image);
        SimpleDraweeView image_yaman = findViewById(R.id.yaman_image);
        SimpleDraweeView image_prashant = findViewById(R.id.prashant_image);
        SimpleDraweeView image_abhijeet = findViewById(R.id.abhijeet_image);
        SimpleDraweeView image_vikram = findViewById(R.id.vikram_image);

        image_nikhil.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/person2.png?alt=media&token=122ec1b6-ce9c-47fd-aa50-39246ba5929c");
        image_vivek.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/person.jpeg?alt=media&token=c6d856fd-4371-453e-8813-d9dbac506e94");
        image_vipin.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/programmer_avtar.png?alt=media&token=df548194-64ff-4f20-9f93-5235e49ffae0");
        image_yaman.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/person3.png?alt=media&token=c030ed03-0cc6-4061-8f0f-c4b6452bf4fc");
        image_prashant.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/person4.png?alt=media&token=a6b7c742-f75c-4337-ab51-d11512853843");
        image_abhijeet.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/person5.jpg?alt=media&token=af0fc9b3-7839-4170-97eb-69986dc2a8f1");
        image_vikram.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/person6.jpg?alt=media&token=1f983588-0c3a-4b66-a182-9799de0fadb1");


        ImageView fb_nikhil = findViewById(R.id.fb_nikhil);
        fb_nikhil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfb("100008380776749");
            }
        });
        ImageView tw_nikhli = findViewById(R.id.tw_nikhl);
        tw_nikhli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentw("nikhilbpl?s=09");
            }
        });
        ImageView in_nikhil = findViewById(R.id.in_nikhil);
        in_nikhil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinsta("nikhil_m_i_s_h_r_a/?igshid=69bg3clxnndf");
            }
        });


        ImageView fb_vivek = findViewById(R.id.fb_vivek);
        fb_vivek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfb("100006601426444");
            }
        });
        ImageView in_vivek = findViewById(R.id.in_vivek);
        in_vivek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinsta("vivek.rajoriya.3910/?igshid=yvcu5pkqcqr4");
            }
        });

        ImageView fb_vipin = findViewById(R.id.fb_vipin);
        fb_vipin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfb("100004524640281");
            }
        });
        ImageView in_vipin = findViewById(R.id.in_vipin);
        in_vipin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinsta("unthreaded_coder");
            }
        });
        ImageView ln_vipin = findViewById(R.id.ln_vipin);
        ln_vipin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLn("vipin-b-817a85137");
            }
        });

        ImageView fb_yaman = findViewById(R.id.fb_yaman);
        fb_yaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfb("100006483507827");
            }
        });
        ImageView in_yaman = findViewById(R.id.in_yaman);
        in_yaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinsta("yaman.pathak?igshid=1lw208ln2c8e2");
            }
        });
        ImageView tw_yaman = findViewById(R.id.tw_yaman);
        tw_yaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentw("PathakYaman?s=09");
            }
        });

        ImageView fb_prashant = findViewById(R.id.fb_prashant);
        fb_prashant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfb("100000654521476");
            }
        });
        ImageView in_prashant = findViewById(R.id.in_prashant);
        in_prashant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinsta("gautamprashant?igshid=1cgf1xwghzlih");
            }
        });

        ImageView fb_abhijeet = findViewById(R.id.fb_abhijeet);
        fb_abhijeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfb("100015444782081");
            }
        });
        ImageView in_abhijeet = findViewById(R.id.in_abhijeet);
        in_abhijeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinsta("_abhijeet.19_/?igshid=ghxavx17x7et");
            }
        });

    }


    private void openfb(String profileId) {

        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/" + profileId));
            startActivity(intent);
        } catch (Exception e) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/" + profileId));
            startActivity(intent);
        }

    }

    private void opentw(String profileId) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setClassName("com.twitter.android", "com.twitter.android.ProfileActivity");
            intent.putExtra("screen_name", profileId);
            startActivity(intent);
        } catch (Exception e) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/" + profileId));
            startActivity(intent);
        }

    }

    private void openinsta(String profileId) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/_u/" + profileId));
            intent.setPackage("com.instagram.android");
            startActivity(intent);
        } catch (Exception e) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/" + profileId));
            startActivity(intent);
        }

    }

    private void openLn(String pId) {

        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/" + pId)));
        } catch (Exception e) {
            Log.d("LINKEDIN - openLn():", e.toString());
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
