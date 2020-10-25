package com.service99.ui.salon.men.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.service99.R;
import com.service99.ui.utilities.Help;
import com.thekhaeng.pushdownanim.PushDownAnim;

public class FaceCareFragment extends Fragment {

    public FaceCareFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_face_care, container, false);


        SimpleDraweeView mImageView1 = (SimpleDraweeView) root.findViewById(R.id.i1);
        SimpleDraweeView mImageView2 = (SimpleDraweeView) root.findViewById(R.id.i2);
        SimpleDraweeView mImageView3 = (SimpleDraweeView) root.findViewById(R.id.i3);
        SimpleDraweeView mImageView4 = (SimpleDraweeView) root.findViewById(R.id.i4);
        mImageView1.setImageURI("");
        mImageView2.setImageURI("");
        mImageView3.setImageURI("");
        mImageView4.setImageURI("");


        for (int i = 1; i <= 4; i++) {
            String pId = "p" + i ;
            final TextView p =root.findViewById(getResources().getIdentifier(pId, "id", requireActivity().getPackageName()));
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
