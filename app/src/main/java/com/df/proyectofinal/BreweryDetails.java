package com.df.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.df.proyectofinal.Models.Brewery;

public class BreweryDetails extends AppCompatActivity {

    TextView txtNameBreweryDet;
    TextView txtObDbIdBreweriesDet;
    TextView txtBrewery_typeBreweriesDet;
    TextView txtCityBreweriesDet;
    TextView txtStateBreweriesDet;
    TextView txtCountryBreweriesDet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brewery_details);

        txtNameBreweryDet = findViewById(R.id.txtNameBreweryDet);
        txtObDbIdBreweriesDet = findViewById(R.id.txtObdbIdBreweriesDet);
        txtBrewery_typeBreweriesDet = findViewById(R.id.txtBrewery_typeBreweriesDet);
        txtCityBreweriesDet = findViewById(R.id.txtCityBreweriesDet);
        txtStateBreweriesDet = findViewById(R.id.txtStateBreweriesDet);
        txtCountryBreweriesDet = findViewById(R.id.txtCountryBreweriesDet);

        Brewery objBrewery = (Brewery) getIntent().getSerializableExtra("objBrewery");
        txtNameBreweryDet.setText(objBrewery.getNameBreweries());
        txtObDbIdBreweriesDet.setText(objBrewery.getObdb_idBreweries());
        txtBrewery_typeBreweriesDet.setText("Type: " + objBrewery.getBrewery_typeBreweries());
        txtCityBreweriesDet.setText("City: " + objBrewery.getCityBreweries());
        txtStateBreweriesDet.setText("State: " + objBrewery.getStateBreweries());
        txtCountryBreweriesDet.setText("Country: " + objBrewery.getCountryBreweries());
    }
}