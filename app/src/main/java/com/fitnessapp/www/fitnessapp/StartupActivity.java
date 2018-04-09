package com.fitnessapp.www.fitnessapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class StartupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup);

        /*Init Variables */
        Button sign_btn =  findViewById(R.id.sign_btn);
        Button use_btn =  findViewById(R.id.use_btn);
        TextView sign_in=findViewById(R.id.sign_in);


        /*Setting Font */

        Typeface font1 = Typeface.createFromAsset(getAssets(),
                "fonts/SFUIDisplayBold.otf");

        Typeface font2 = Typeface.createFromAsset(getAssets(),
                "fonts/SFUIDisplayMedium.otf");

        use_btn.setTypeface(font2);
        sign_btn.setTypeface(font1);
        sign_in.setTypeface(font2);

        /*Login Functions*/
        sign_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StartupActivity.this, SignupActivity.class));


            }
        });

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StartupActivity.this, LoginActivity.class));

            }
        });

    }
}
