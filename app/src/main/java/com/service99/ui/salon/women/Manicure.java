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

public class Manicure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manicure);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Manicure");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView footer = findViewById(R.id.footer);
        footer.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/salon_footer.webp?alt=media&token=652956e0-a0f3-49cb-a347-b1caaf159204");

        SimpleDraweeView mImageView1 = findViewById(R.id.i1);
        SimpleDraweeView mImageView2 = findViewById(R.id.i2);
        SimpleDraweeView mImageView3 = findViewById(R.id.i3);
        SimpleDraweeView mImageView4 = findViewById(R.id.i4);
        SimpleDraweeView mImageView5 = findViewById(R.id.i5);
        SimpleDraweeView mImageView6 = findViewById(R.id.i6);
        SimpleDraweeView mImageView7 = findViewById(R.id.i7);
        SimpleDraweeView mImageView8 = findViewById(R.id.i8);
        SimpleDraweeView mImageView9 = findViewById(R.id.i9);

        mImageView1.setImageURI("");
        mImageView2.setImageURI("");
        mImageView3.setImageURI("");
        mImageView4.setImageURI("");
        mImageView5.setImageURI("");
        mImageView6.setImageURI("");
        mImageView7.setImageURI("");
        mImageView8.setImageURI("");
        mImageView9.setImageURI("");

        for (int i = 1; i <= 9; i++) {
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
                            Help.schedule(Manicure.this, "Service:\n" + t.getText());

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
