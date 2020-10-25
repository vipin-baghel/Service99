package com.service99.ui.auth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.service99.MainActivity;
import com.service99.R;
import com.service99.ui.utilities.SharedPref;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class VerifyPhnActivity extends AppCompatActivity {

    String verificationCodeBySystem,phoneNo,hno, locality, area,name;
    Button verify_btn;
    TextInputLayout otpLayout;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_phn);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).hide();

        SimpleDraweeView verify_image = findViewById(R.id.verify_image);
        verify_image.setImageURI("https://firebasestorage.googleapis.com/v0/b/service99-6d6f1.appspot.com/o/otp.png?alt=media&token=e786b67b-ef16-4f94-8245-eac49fc6a39c");

        phoneNo = getIntent().getStringExtra("phoneNo");

        verify_btn = findViewById(R.id.verify_btn);
        otpLayout = findViewById(R.id.otp_TextInputLayout);
        progressBar = findViewById(R.id.progress_bar);

        verify_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String code = Objects.requireNonNull(otpLayout.getEditText()).getText().toString();

                if (code.length() != 6) {
                    otpLayout.setError("OTP should be of 6 digits");
                    otpLayout.requestFocus();
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);
                verifyCode(code);
            }
        });

        sendVerificationCodeToUser(phoneNo);

    }

    private void sendVerificationCodeToUser(String phoneNo) {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                "+91" + phoneNo,        // Phone number to verify
                60,                 // Timeout duration
                TimeUnit.SECONDS,   // Unit of timeout
                TaskExecutors.MAIN_THREAD,   // Activity (for callback binding)
                mCallbacks);        // OnVerificationStateChangedCallbacks
    }

    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks =
            new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

                @Override
                public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                    super.onCodeSent(s, forceResendingToken);
                    //Get the code in global variable
                    verificationCodeBySystem = s;
                    //Toast.makeText(VerifyPhnActivity.this, "onCodeSent", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {

                    String code = phoneAuthCredential.getSmsCode();
                    if (code != null) {
                        //Toast.makeText(VerifyPhnActivity.this, "onVerificationCompleted", Toast.LENGTH_SHORT).show();
                        Objects.requireNonNull(otpLayout.getEditText()).setText(code);
                        verifyCode(code);
                    }
                }

                @Override
                public void onVerificationFailed(@NonNull FirebaseException e) {
                    Log.d("OTP VERIFY FAILED :", Objects.requireNonNull(e.getMessage()));
                    Toast.makeText(VerifyPhnActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            };

    private void verifyCode(String codeByUser) {

        try {
            PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationCodeBySystem, codeByUser);
            signInTheUserByCredentials(credential);
        }catch (Exception e){
            Toast.makeText(this, "Verification Code is wrong", Toast.LENGTH_SHORT).show();
        }

    }

    private void signInTheUserByCredentials(PhoneAuthCredential credential) {

        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(VerifyPhnActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {

                            Toast.makeText(VerifyPhnActivity.this, "Authentication Successful!", Toast.LENGTH_SHORT).show();
                            SharedPref.write(SharedPref.PHONE,phoneNo);
                            //Auth success
                            /*Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);*/
                            getAddressDB(phoneNo);

                        } else {
                            Log.d("LOGGER:", Objects.requireNonNull(Objects.requireNonNull(task.getException()).getMessage()));
                            Toast.makeText(VerifyPhnActivity.this, Objects.requireNonNull(task.getException()).getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    private void getAddressDB(String pn) {

        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("users").document(pn)
                .get()
                .addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                        if (task.isSuccessful()) {
                            DocumentSnapshot document = task.getResult();

                            if (Objects.requireNonNull(document).exists()) {
                                Log.i("LOGGER", "Document exists");

                                hno = document.getString("hno");
                                locality = document.getString("locality");
                                area = document.getString("area");
                                name = document.getString("name");

                                Log.i("LOGGER", "hno " + hno);
                                Log.i("LOGGER", "locality " + locality);
                                Log.i("LOGGER", "area " + area);
                                Log.i("LOGGER", "name " + name);

                                SharedPref.write(SharedPref.HNO, hno);
                                SharedPref.write(SharedPref.LOCALITY, locality);
                                SharedPref.write(SharedPref.AREA, area);
                                SharedPref.write(SharedPref.NAME, name);

                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                startActivity(intent);


                            } else {
                                Log.d("LOGGER", "Document DOESNT exist");
                                startActivity(new Intent(VerifyPhnActivity.this, AddressActivity.class));
                                finish();
                            }
                        } else {
                            Log.d("LOGGER", "get failed with ", task.getException());
                        }
                    }
                });

    }
}