package com.sudarsanudash.hamrobazarreplica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.sudarsanudash.hamrobazarreplica.TermsandCondition.Posting;
import com.sudarsanudash.hamrobazarreplica.TermsandCondition.Safety;
import com.sudarsanudash.hamrobazarreplica.TermsandCondition.Terms;

public class MainActivity extends AppCompatActivity {

    CheckBox cbTerms, cbSafety, cbPosting;
    Button btnAgreed;
    String terms, safety,ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbTerms = findViewById(R.id.cbTerms);
        cbSafety = findViewById(R.id.cbSafety);
        cbPosting = findViewById(R.id.cbPosting);
        btnAgreed = findViewById(R.id.btnAgreed);

        cbTerms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Intent intent=new Intent(getApplicationContext(),Terms.class);
                startActivity(intent);
                terms="checked";
            }
        });

        cbSafety.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Intent intent=new Intent(getApplicationContext(), Safety.class);
                startActivity(intent);
                safety="checked";
            }
        });
        cbPosting.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Intent intent=new Intent(getApplicationContext(),Posting.class);
                startActivity(intent);
                ad="checked";
            }
        });


        btnAgreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Agree();
            }
        });
    }

    private void Agree() {
        if (!cbTerms.isChecked())
        {
            Toast.makeText(this, "Terms is not checked", Toast.LENGTH_SHORT).show();
            return;
        }
        else if (!cbSafety.isChecked())
        {
            Toast.makeText(this, "Safety is not checked", Toast.LENGTH_SHORT).show();
            return;
        }
        else if (!cbPosting.isChecked())
        {
            Toast.makeText(this, "AD is not checked", Toast.LENGTH_SHORT).show();
            return;
        }
        else {
            SharedPreferences sharedPreferences=getSharedPreferences("welcome",MODE_PRIVATE);
            SharedPreferences.Editor editor=sharedPreferences.edit();

           editor.putString("Terms", terms);
            editor.putString("safety",safety);
            editor.putString("ad",ad);
            editor.commit();



            Intent intent=new Intent(MainActivity.this,SplashScreen.class);
            startActivity(intent);

        }


    }}
