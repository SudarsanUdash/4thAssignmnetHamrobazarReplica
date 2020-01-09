package com.sudarsanudash.hamrobazarreplica.TermsandConditions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.sudarsanudash.hamrobazarreplica.R;


public class Safety extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety);

        webView = findViewById(R.id.webView);




        webView.loadUrl("https://hamrobazaar.com/m/safetytips.php");

    }
}