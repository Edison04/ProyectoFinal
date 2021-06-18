package com.df.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    private Button btnBreweries;
    private Button btnSearchId;
    private Button btnSearchKeyword;
    private TextView txtIdRes;
    private TextView txtKeyword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        txtIdRes = findViewById(R.id.txtIdRes);
        txtKeyword = findViewById(R.id.txtKeyword);
        btnBreweries = findViewById(R.id.btnBreweries);
        btnSearchId = findViewById(R.id.btnSearchId);
        btnSearchKeyword = findViewById(R.id.btnSearchKeyword);
        btnBreweries.setOnClickListener(this);
        btnSearchId.setOnClickListener(this);
        btnSearchKeyword.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnBreweries) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btnSearchId) {
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("id", txtIdRes.getText().toString());
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, AutocompleteActivity.class);
            intent.putExtra("text", txtKeyword.getText().toString());
            startActivity(intent);
        }
    }
}