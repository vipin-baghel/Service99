package com.service99.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.textfield.TextInputLayout;
import com.service99.R;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    TextInputLayout phoneNumberLayout;
    Button nextBtn;

    String phoneNo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).hide();

        SimpleDraweeView login_image = findViewById(R.id.login_image);
        login_image.setImageURI("https://firebasestorage.googleapis.com/v0/b/service99-6d6f1.appspot.com/o/signup.webp?alt=media&token=80237d43-e90f-4b4a-8a53-976274d100f2");

        TextView skipTv = findViewById(R.id.skip);
        skipTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        phoneNumberLayout = findViewById(R.id.pn_TextInputLayout);
        nextBtn = findViewById(R.id.next_button);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                phoneNo = Objects.requireNonNull(phoneNumberLayout.getEditText())
                        .getText().toString().trim();

                if (phoneNo.length()==10){

                    int firstDigit = phoneNo.charAt(0) - 48;
                    if (firstDigit>5){
                        //Toast.makeText(LoginActivity.this, phoneNo, Toast.LENGTH_SHORT).show();
                        //Call the next activity and pass phone no with it
                        Intent intent = new Intent(getApplicationContext(), VerifyPhnActivity.class);
                        intent.putExtra("phoneNo", phoneNo);
                        startActivity(intent);
                        finish();
                    }else{
                        //Toast.makeText(LoginActivity.this, "Invalid no", Toast.LENGTH_SHORT).show();
                        phoneNumberLayout.setError("Invalid number");
                    }

                }else{
                    //Toast.makeText(LoginActivity.this, "", Toast.LENGTH_SHORT).show();
                    phoneNumberLayout.setError("Phone no should be in 10 digits");
                }

            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}