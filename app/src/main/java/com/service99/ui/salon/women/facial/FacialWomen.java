package com.service99.ui.salon.women.facial;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.service99.R;

import java.util.Objects;

public class FacialWomen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facial_women);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Facial");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ViewPager2 viewPager2 = findViewById(R.id.view_pager);
        viewPager2.setAdapter(new FacialAdapter(this));
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setTabGravity(0);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if (position == 0) {
                    tab.setText("VLCC Facial");
                } else if (position == 1) {
                    tab.setText(" Lotus Herbals Facial");
                } else if (position == 2) {
                    tab.setText("Vidicline Facial");
                } else if (position == 3){
                    tab.setText("Shanhnaz Husain Facial");
                } else if (position == 4){
                    tab.setText("O3+ Facial");
                } else if (position == 5){
                    tab.setText("Blossom Kochha Aroma Magic Facial");
                }
            }
        }).attach();

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
