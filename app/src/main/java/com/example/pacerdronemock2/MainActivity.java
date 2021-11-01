package com.example.pacerdronemock2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button begin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        begin = findViewById(R.id.button);

        begin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent setApp = new Intent(MainActivity.this, SetupActivity.class);
                startActivity(setApp);

            }
        });
    }
}