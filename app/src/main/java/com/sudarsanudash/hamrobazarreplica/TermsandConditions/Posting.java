package com.sudarsanudash.hamrobazarreplica.TermsandConditions;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.sudarsanudash.hamrobazarreplica.R;


public class Posting extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posting);

        webView = findViewById(R.id.webView);

        webView.loadUrl("https://hamrobazaar.com/postrules.html");
    }
}