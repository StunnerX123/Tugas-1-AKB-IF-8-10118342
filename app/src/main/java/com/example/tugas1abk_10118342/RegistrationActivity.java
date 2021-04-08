package com.example.tugas1abk_10118342;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button btnRegister = findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goRegister = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(goRegister);
                finish();
            }
        });
        Button btnLogin = findViewById(R.id.btn_back);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goLogin = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(goLogin);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent goLogin = new Intent(RegistrationActivity.this, LoginActivity.class);
        startActivity(goLogin);
        finish();
    }
}