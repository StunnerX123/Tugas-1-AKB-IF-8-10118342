package com.example.tugas1abk_10118342;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        Button btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goMain = new Intent(ProfilActivity.this, MainActivity.class);
                startActivity(goMain);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent goMain = new Intent(ProfilActivity.this, MainActivity.class);
        startActivity(goMain);
        finish();
    }
}