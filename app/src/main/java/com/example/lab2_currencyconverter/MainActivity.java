package com.example.lab2_currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onConvertButtonClicked(View view) {
        EditText textField = (EditText) findViewById(R.id.conversionAmount);
        Double convertAmount = Double.valueOf(textField.getText().toString());
        convertAmount *= 0.77;

        Intent intent = new Intent(this, ConvertedAmountActivity.class);
        intent.putExtra("message", convertAmount.toString());
        startActivity(intent);
    }
}
