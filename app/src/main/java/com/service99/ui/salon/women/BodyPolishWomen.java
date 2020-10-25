package com.service99.ui.salon.women;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.thekhaeng.pushdownanim.PushDownAnim;
import com.service99.R;
import com.service99.ui.utilities.Help;

import java.util.Objects;

public class BodyPolishWomen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_polish_women);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Body Polish for Women");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView footer = findViewById(R.id.footer);
        footer.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/salon_footer.webp?alt=media&token=652956e0-a0f3-49cb-a347-b1caaf159204");

        SimpleDraweeView mImageView1 = findViewById(R.id.i1);
        SimpleDraweeView mImageView2 = findViewById(R.id.i2);
        SimpleDraweeView mImageView3 = findViewById(R.id.i3);
        SimpleDraweeView mImageView4 = findViewById(R.id.i4);

        mImageView1.setImageURI("");
        mImageView2.setImageURI("");
        mImageView3.setImageURI("");
        mImageView4.setImageURI("");


        for (int i = 1; i <= 4; i++) {
            String tId = "t" + i ;
            final TextView t =findViewById(getResources().getIdentifier(tId, "id", getPackageName()));
            String lId = "l" + i ;
            LinearLayout l = findViewById(getResources().getIdentifier(lId, "id", getPackageName()));
            PushDownAnim.setPushDownAnimTo(l)
                    .setScale(0.9f)
                    .setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //on click
                            Help.schedule(BodyPolishWomen.this, "Service:\n" + t.getText());

                        }
                    });

        }


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
