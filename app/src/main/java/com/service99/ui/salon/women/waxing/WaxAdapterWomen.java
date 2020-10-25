package com.service99.ui.salon.women.waxing;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class WaxAdapterWomen extends FragmentStateAdapter {
    String[] brazil = {"29", "29", "149", "199", "89", "199", "299", "199", "149", "249", "599", "1299", "1799"};
    String[] honey = {"19", "19", "99", "149", "49", "149", "199", "99", "99", "199", "499", "899", "1299"};
    String[] rica = {"39", "39", "199", "249", "129", "249", "349", "249", "199", "299", "699", "1599", "2199"};

    public WaxAdapterWomen(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public Fragment createFragment(int position) {
        if (position == 0) {
            return new WaxFragmentWomen(this.honey);
        }
        if (position == 1) {
            return new WaxFragmentWomen(this.brazil);
        }
        return new WaxFragmentWomen(this.rica);
    }

    public int getItemCount() {
        return 3;
    }
}
