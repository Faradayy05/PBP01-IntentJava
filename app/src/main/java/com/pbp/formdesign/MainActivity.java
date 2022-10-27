package com.pbp.formdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

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

        //Calendar
        final Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        etTanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month + 1;
                        String date = day+"/"+month+"/"+year;
                        etTanggal.setText(date);
                    }
                },year,month,day);
                dialog.show();
            }
        });

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