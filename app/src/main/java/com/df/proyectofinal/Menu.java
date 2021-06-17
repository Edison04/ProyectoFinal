package com.df.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    private Button btnBreweries;
    private Button btnSearch;
    private TextView txtIdRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        txtIdRes = findViewById(R.id.txtIdRes);
        btnBreweries = findViewById(R.id.btnBreweries);
        btnSearch = findViewById(R.id.btnSearch);
        btnBreweries.setOnClickListener(this);
        btnSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnBreweries) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("id", txtIdRes.getText().toString());
            startActivity(intent);
        }
    }
}