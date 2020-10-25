package com.service99.ui.salon.women.waxing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.facebook.drawee.view.SimpleDraweeView;
import com.thekhaeng.pushdownanim.PushDownAnim;
import com.service99.R;
import com.service99.ui.utilities.Help;

public class WaxFragmentWomen extends Fragment {

    private String[] a;

    private int i;

    public WaxFragmentWomen() {
    }

    public WaxFragmentWomen(String[] a) {
        this.a = a;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_wax, container, false);
        SimpleDraweeView footer = root.findViewById(R.id.footer);
        footer.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/salon_footer.webp?alt=media&token=652956e0-a0f3-49cb-a347-b1caaf159204");
        SimpleDraweeView mImageView1 = (SimpleDraweeView) root.findViewById(R.id.i1);
        SimpleDraweeView mImageView2 = (SimpleDraweeView) root.findViewById(R.id.i2);
        SimpleDraweeView mImageView3 = (SimpleDraweeView) root.findViewById(R.id.i3);
        SimpleDraweeView mImageView4 = (SimpleDraweeView) root.findViewById(R.id.i4);
        SimpleDraweeView mImageView5 = (SimpleDraweeView) root.findViewById(R.id.i5);
        SimpleDraweeView mImageView6 = (SimpleDraweeView) root.findViewById(R.id.i6);
        SimpleDraweeView mImageView7 = (SimpleDraweeView) root.findViewById(R.id.i7);
        SimpleDraweeView mImageView8 = (SimpleDraweeView) root.findViewById(R.id.i8);
        SimpleDraweeView mImageView9 = (SimpleDraweeView) root.findViewById(R.id.i9);
        mImageView1.setImageURI("");
        mImageView2.setImageURI("");
        mImageView3.setImageURI("");
        mImageView4.setImageURI("");
        mImageView5.setImageURI("");
        mImageView6.setImageURI("");
        mImageView7.setImageURI("");
        mImageView8.setImageURI("");
        mImageView9.setImageURI("");

        for (i = 1; i <= 13; i++) {
            String pId = "p" + i ;
            final TextView p =root.findViewById(getResources().getIdentifier(pId, "id", requireActivity().getPackageName()));
            p.setText("Rs. "+a[i-1]);
            String tId = "t" + i ;
            final TextView t =root.findViewById(getResources().getIdentifier(tId, "id", requireActivity().getPackageName()));
            String lId = "l" + i ;
            LinearLayout l = root.findViewById(getResources().getIdentifier(lId, "id", requireActivity().getPackageName()));
            PushDownAnim.setPushDownAnimTo(l)
                    .setScale(0.9f)
                    .setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //on click
                            Help.schedule(getActivity(),  t.getText().toString() , p.getText().toString());

                        }
                    });

        }

        return root;
    }
}
