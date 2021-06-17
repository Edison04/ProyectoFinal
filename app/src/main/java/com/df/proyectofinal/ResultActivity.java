package com.df.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.df.proyectofinal.ApiManager.RetrofitClient;
import com.df.proyectofinal.Models.Brewery;

import es.dmoral.toasty.Toasty;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResultActivity extends AppCompatActivity {

    private String id;
    TextView txtNameBreweryRes;
    TextView txtObDbIdBreweriesRes;
    TextView txtBrewery_typeBreweriesRes;
    TextView txtCityBreweriesRes;
    TextView txtStateBreweriesRes;
    TextView txtCountryBreweriesRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        id = getIntent().getStringExtra("id");

        txtNameBreweryRes = findViewById(R.id.txtNameBreweryRes);
        txtObDbIdBreweriesRes = findViewById(R.id.txtObdbIdBreweriesRes);
        txtBrewery_typeBreweriesRes = findViewById(R.id.txtBrewery_typeBreweriesRes);
        txtCityBreweriesRes = findViewById(R.id.txtCityBreweriesRes);
        txtStateBreweriesRes = findViewById(R.id.txtStateBreweriesRes);
        txtCountryBreweriesRes = findViewById(R.id.txtCountryBreweriesRes);

        getBreweryById(id);
    }

    private void getBreweryById(String id) {
        Call<Brewery> call = RetrofitClient.getInstance().getMyApi().getBreweries(id);
        call.enqueue(new Callback<Brewery>() {
            @Override
            public void onResponse(Call<Brewery> call, Response<Brewery> response) {
                Brewery myBrewery = response.body();
                txtNameBreweryRes.setText(myBrewery.getNameBreweries());
                txtObDbIdBreweriesRes.setText(myBrewery.getObdb_idBreweries());
                txtBrewery_typeBreweriesRes.setText(myBrewery.getBrewery_typeBreweries());
                txtCityBreweriesRes.setText(myBrewery.getCityBreweries());
                txtStateBreweriesRes.setText(myBrewery.getStateBreweries());
                txtCountryBreweriesRes.setText(myBrewery.getCountryBreweries());
            }

            @Override
            public void onFailure(Call<Brewery> call, Throwable t) {
                Toasty.error(getApplicationContext(), "Ocurrió un error", Toast.LENGTH_SHORT, true).show();
            }
        });
    }
}