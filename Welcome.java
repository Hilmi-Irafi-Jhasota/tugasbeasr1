package com.example.welcome;
import android.os.Bundle;

import android.widget.Button;

public class Welcome extends MainActivity {

        Button btnExit;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_welcome);

            btnExit = (Button) findViewById(R.id.logout);

            btnExit.setOnClickListener(v -> finish());

        }
    }

