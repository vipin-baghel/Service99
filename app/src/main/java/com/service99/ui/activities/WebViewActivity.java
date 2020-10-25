package com.service99.ui.activities;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.service99.R;

import java.util.Objects;

public class WebViewActivity extends AppCompatActivity {

    private WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Become our Parner");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        myWebView =  findViewById(R.id.web_view);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("https://surveyheart.com/form/5e95f9eee46fa36a37f7b081");

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Check if the key event was the Back button and if there's history
        if ((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack()) {
            myWebView.goBack();
            return true;
        }
        // If it wasn't the Back key or there's no web page history, bubble up to the default
        // system behavior (probably exit the activity)
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
