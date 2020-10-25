package com.service99.ui.profile;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.service99.R;
import com.service99.ui.auth.AddressActivity;
import com.service99.ui.auth.LoginActivity;
import com.service99.ui.utilities.SharedPref;
import com.thekhaeng.pushdownanim.PushDownAnim;

public class ProfileFragment extends Fragment {

    private LinearLayout signOutLayout;
    private FirebaseAuth mAuth;
    private View root;
    private TextView tHno, tLocality, tArea, tPhone,tName;
    Button signInButton,signOutBtn;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }

    private void updateUI(FirebaseUser currentUser) {
        if (currentUser != null) {

            signInButton.setVisibility(View.GONE);
            signOutLayout.setVisibility(View.VISIBLE);

            tName.setText(SharedPref.read(SharedPref.NAME, ""));
            tHno.setText(SharedPref.read(SharedPref.HNO, ""));
            tLocality.setText(SharedPref.read(SharedPref.LOCALITY, ""));
            tArea.setText(SharedPref.read(SharedPref.AREA, ""));
            tPhone.setText(SharedPref.read(SharedPref.PHONE, ""));

        } else {
            signInButton.setVisibility(View.VISIBLE);
            signOutLayout.setVisibility(View.GONE);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_profile, container, false);
        signInButton = root.findViewById(R.id.sign_in_button);
        signOutBtn = root.findViewById(R.id.sign_out);
        signOutLayout = root.findViewById(R.id.sign_out_layout);
        signOutLayout.setVisibility(View.GONE);
        tHno = root.findViewById(R.id.tHno);
        tName = root.findViewById(R.id.tName);
        tLocality = root.findViewById(R.id.tLocality);
        tArea = root.findViewById(R.id.tArea);
        tPhone = root.findViewById(R.id.tphone);
        SimpleDraweeView displaypic = root.findViewById(R.id.display_pic);
        displaypic.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/person4.png?alt=media&token=a6b7c742-f75c-4337-ab51-d11512853843");
        TextView editTv = root.findViewById(R.id.edit_tv);
        editTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mAuth.getCurrentUser()!=null)
                    startActivity(new Intent(getContext(),AddressActivity.class));
            }
        });

        // sign out button on click
        PushDownAnim.setPushDownAnimTo(signOutBtn)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mAuth.signOut();
                        Snackbar.make(root, "Signed Out", Snackbar.LENGTH_SHORT).show();
                        SharedPref.write(SharedPref.NAME, "");
                        SharedPref.write(SharedPref.UID, "");
                        SharedPref.write("hno", "");
                        SharedPref.write("locality", "");
                        SharedPref.write("area", "");
                        SharedPref.write("phone", "");
                        updateUI(mAuth.getCurrentUser());

                    }
                });

        // sign in button on click
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), LoginActivity.class));
            }
        });

        return root;
    }

}
