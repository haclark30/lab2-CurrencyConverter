package com.example.lab2_currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ConvertedAmountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converted_amount);

        TextView textView = findViewById(R.id.convertedAmountText);
        Intent intent = getIntent();
        String amount = intent.getStringExtra("message");
        textView.setText("\u00A3" + amount);

    }
}
