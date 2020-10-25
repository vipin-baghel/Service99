package com.service99.ui.delivery;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import com.service99.R;
import com.service99.ui.utilities.Help;

import java.util.Objects;

public class FruitsActivity extends AppCompatActivity {

    CheckBox banana,apple,orange,grapes,watermelon;

    Button cnf_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Fruits Delivery");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        banana=findViewById(R.id.banana);
        apple=findViewById(R.id.apple);
        orange=findViewById(R.id.orange);
        grapes=findViewById(R.id.grapes);
        watermelon=findViewById(R.id.watermelon);

        cnf_btn=findViewById(R.id.cnf_btn);
        cnf_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder result=new StringBuilder();
                result.append("Delivery Items:  ");
                if(banana.isChecked()){
                    result.append("Banana,  ");
                }
                if(apple.isChecked()){
                    result.append("Apples,  ");
                }
                if(orange.isChecked()){
                    result.append("Oranges,  ");
                }
                if(grapes.isChecked()){
                    result.append("Grapes Green,  ");
                }
                if(watermelon.isChecked()){
                    result.append("Watermelon,  ");
                }

                Help.schedule(FruitsActivity.this, result.toString());
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
