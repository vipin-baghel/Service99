package com.service99.ui.salon.women.facial;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FacialAdapter extends FragmentStateAdapter {

    public FacialAdapter(@NonNull FragmentActivity fragmentActivity) {

        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new VLCCFacial();
        }else if (position == 1) {
            return new LotusFacial();
        }else if (position == 2) {
            return new VidiclineFacial();
        }else if (position == 3){
            return new ShanhazFacial();
        }else if (position == 4){
            return new O3Facial();
        }else{
            return new BlossomFacial();
        }

    }

    @Override
    public int getItemCount() {
        return 6;
    }

}
