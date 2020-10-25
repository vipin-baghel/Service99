package com.service99.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.service99.R;
import com.thekhaeng.pushdownanim.PushDownAnim;

import java.util.Objects;

public class PainterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painter);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Painter Services");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ImageView fresh = findViewById(R.id.fresh);
        PushDownAnim.setPushDownAnimTo(fresh)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //fresh painting layout
                        startActivity(new Intent(getApplicationContext(),FreshPaintingActivity.class));

                    }
                });

        ImageView repainting = findViewById(R.id.repainting);
        PushDownAnim.setPushDownAnimTo(repainting)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //repainting layout
                        startActivity(new Intent(getApplicationContext(),RepaintingActivity.class));

                    }
                });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
