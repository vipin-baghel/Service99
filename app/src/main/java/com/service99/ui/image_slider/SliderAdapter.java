package com.service99.ui.image_slider;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.facebook.drawee.view.SimpleDraweeView;
import com.google.firebase.auth.FirebaseAuth;
import com.service99.R;
import com.service99.ui.activities.ElectricianActivity;
import com.service99.ui.activities.PestControlActivity;
import com.service99.ui.appliance.ACServicesActivity;
import com.service99.ui.cleaning.BathroomActivity;

import java.util.List;

public class SliderAdapter extends
        RecyclerView.Adapter<SliderAdapter.SliderViewHolder> {

    private List<SliderItem> sliderItems;
    private ViewPager2 viewPager2;
    private Context context;

    public SliderAdapter(List<SliderItem> sliderItems, ViewPager2 viewPager2, Context context) {
        this.sliderItems = sliderItems;
        this.viewPager2 = viewPager2;
        this.context = context;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SliderViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.slide_item_container,
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, final int position) {
        holder.setImageView(sliderItems.get(position));

            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (position) {
                        case 0:
                            context.startActivity(new Intent(context, ACServicesActivity.class));
                            break;
                        case 1:
                            context.startActivity(new Intent(context, BathroomActivity.class));
                            break;
                        case 2:
                            context.startActivity(new Intent(context, ElectricianActivity.class));
                            break;
                        case 3:
                            context.startActivity(new Intent(context, PestControlActivity.class));
                            break;
                        default:
                            Toast.makeText(context, ""+position, Toast.LENGTH_SHORT).show();
                    }
                }
            });



    }

    @Override
    public int getItemCount() {
        return sliderItems.size();
    }

    static class SliderViewHolder extends RecyclerView.ViewHolder {
        private SimpleDraweeView imageView;

        SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageSlide);
        }

        void setImageView(SliderItem sliderItem) {
            imageView.setImageURI(sliderItem.getImageUrl());
        }
    }

}
