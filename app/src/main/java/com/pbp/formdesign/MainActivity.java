package com.pbp.formdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // EditText
        EditText etNama = findViewById(R.id.etNama);
        EditText etTempat = findViewById(R.id.etTempat);
        EditText etTanggal = findViewById(R.id.etTanggal);

        //Button
        Button etButton = findViewById(R.id.etButton);

        etButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString().trim();
                String tempat = etTempat.getText().toString().trim();
                String tanggal = etTanggal.getText().toString().trim();

                //Intent
                Intent intent = new Intent(MainActivity.this, ViewActivity.class);
                intent.putExtra("NAMA", nama);
                intent.putExtra("TEMPAT", tempat);
                intent.putExtra("TANGGAL", tanggal);
                startActivity(intent);
            }
        });
    }
}