package com.service99.ui.vehicle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.service99.R;
import com.service99.ui.utilities.Help;

import java.util.Objects;

public class TwoWheelerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_wheeler);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Two Wheeler Servicing");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SimpleDraweeView i1 = findViewById(R.id.i1);
        i1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_a_two_wheeler.webp?alt=media&token=a32f6d77-30ab-44d6-925a-2c7d83486563");

        Button b = findViewById(R.id.cnf_btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(TwoWheelerActivity.this, "Service:\n Two Wheeler Servicing");

            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
