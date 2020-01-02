package com.sudarsanudash.hamrobazarreplica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.sudarsanudash.hamrobazarreplica.TermsandCondition.Posting;
import com.sudarsanudash.hamrobazarreplica.TermsandCondition.Safety;
import com.sudarsanudash.hamrobazarreplica.TermsandCondition.Terms;

public class MainActivity extends AppCompatActivity {

    CheckBox cbTerms, cbSafety, cbPosting;
    Button btnAgreed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbTerms = findViewById(R.id.cbTerms);
        cbSafety = findViewById(R.id.cbSafety);
        cbPosting = findViewById(R.id.cbPosting);
        btnAgreed = findViewById(R.id.btnAgreed);

        cbTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Terms.class));
            }
        });

        cbSafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Safety.class));
            }
        });

        cbPosting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Posting.class));
            }
        });

        btnAgreed.setOnClickListener(new View.OnClickListener() {
            @Override
            //Validation for terms and condition
            public void onClick(View v) {
                if (cbTerms.isChecked()) {
                    if (cbSafety.isChecked()){
                        if (cbPosting.isChecked()) {
                            startActivity(new Intent(getApplicationContext(), DashboardActivity.class));


                        }
                        else{
                            Toast.makeText(MainActivity.this, "Please Read and agree all term and condition", Toast.LENGTH_SHORT).show();

                        }



                    }

                }
            }


        });
    }}
