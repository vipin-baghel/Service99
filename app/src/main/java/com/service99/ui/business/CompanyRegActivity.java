package com.service99.ui.business;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.service99.R;
import com.service99.ui.utilities.Help;

import java.util.Objects;

public class CompanyRegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_reg);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Company Registration");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        Button b = findViewById(R.id.cnf_btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(CompanyRegActivity.this, "Service:\n Company Registration");

            }
        });

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
