package com.service99.ui.contact_us;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.service99.R;
import com.service99.ui.utilities.Help;
import com.thekhaeng.pushdownanim.PushDownAnim;

public class ContactFragment extends Fragment {

    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_contact, container, false);

        LinearLayout l1 = root.findViewById(R.id.l1);
        LinearLayout l2 = root.findViewById(R.id.l2);
        LinearLayout l3 = root.findViewById(R.id.l3);
        LinearLayout l4 = root.findViewById(R.id.l4);
        //LinearLayout l5 = root.findViewById(R.id.l5);

        PushDownAnim.setPushDownAnimTo(l1).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Help.schedule(getContext(),"Service: Call Back Request");
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "+919993445411", null)));
            }
        });

        PushDownAnim.setPushDownAnimTo(l2).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirebaseAuth mAuth = FirebaseAuth.getInstance();
                if (mAuth.getCurrentUser() != null) {
                    String url = "https://api.whatsapp.com/send?phone=+919993445411";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }else{
                    Snackbar.make(root,"Please Sign in to message !",Snackbar.LENGTH_SHORT).show();
                }

            }
        });

        PushDownAnim.setPushDownAnimTo(l3).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),Franchisee.class));
            }
        });

        PushDownAnim.setPushDownAnimTo(l4).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),Partner.class));
            }
        });

        /*PushDownAnim.setPushDownAnimTo(l5).setScale(0.9f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),OurTeam.class));
            }
        });*/


        return root;
    }
}
