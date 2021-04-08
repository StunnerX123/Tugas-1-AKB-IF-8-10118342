package com.example.tugas1abk_10118342;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnProfil = findViewById(R.id.btn_profil);
        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goProfil = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(goProfil);
                finish();
            }
        });
        Button btnLogout = findViewById(R.id.btn_logout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goLogout = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(goLogout);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent goLogout = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(goLogout);
        finish();
    }
}