package com.ccna.quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class PrivacyPolicyActivity extends AppCompatActivity {

    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Privacy Policy");

        web =(WebView)findViewById(R.id.webView);
        web.loadUrl("https://firebasestorage.googleapis.com/v0/b/ccna-quiz-8b357.appspot.com/o/privacy%20policy%2Fprivacy_policy.html?alt=media&token=cf087753-5417-45e2-8663-9fc56fa10e09");

    }
}
