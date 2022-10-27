package com.pbp.formdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        //intent to Get data
        Intent intent = getIntent();
        String nama = intent.getStringExtra("NAMA");
        String tempat = intent.getStringExtra("TEMPAT");
        String tanggal = intent.getStringExtra("TANGGAL");

        //Text View
        TextView tvNama = findViewById(R.id.textView7);
        TextView tvTempat = findViewById(R.id.textView9);
        TextView tvTanggal = findViewById(R.id.textView11);

        //Set Text
        tvNama.setText(nama);
        tvTempat.setText(tempat);
        tvTanggal.setText(tanggal);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}