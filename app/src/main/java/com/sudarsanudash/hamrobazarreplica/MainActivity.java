package com.sudarsanudash.hamrobazarreplica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


import com.sudarsanudash.hamrobazarreplica.TermsandConditions.Posting;
import com.sudarsanudash.hamrobazarreplica.TermsandConditions.Safety;
import com.sudarsanudash.hamrobazarreplica.TermsandConditions.Terms;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbTerms, cbSafety, cbPosting;
    private Button btnAgree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbTerms = findViewById(R.id.cbTerms);
        cbSafety = findViewById(R.id.cbSafety);
        cbPosting = findViewById(R.id.cbPosting);
        btnAgree = findViewById(R.id.btnAgree);

        cbTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Terms.class));
            }
        });

        cbSafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Safety.class));
            }
        });


        cbPosting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Posting.class));
            }
        });

        btnAgree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbTerms.isChecked() && cbSafety.isChecked() && cbPosting.isChecked()) {
                    startActivity(new Intent(MainActivity.this, SplashScreen.class));
                }

                else {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}