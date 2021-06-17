package com.df.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.df.proyectofinal.ApiManager.RetrofitClient;
import com.df.proyectofinal.Models.Brewery;

import java.util.List;

import es.dmoral.toasty.Toasty;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listBreweries;
    List<Brewery> myBreweries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listBreweries = findViewById(R.id.lvBreweries);
        getBreweriesFromApi();
        listBreweries.setOnItemClickListener(this);
    }

    private void getBreweriesFromApi() {
        Call<List<Brewery>> call = RetrofitClient.getInstance().getMyApi().getBreweries();
        call.enqueue(new Callback<List<Brewery>>() {
            @Override
            public void onResponse(Call<List<Brewery>> call, Response<List<Brewery>> response) {
                myBreweries = response.body();
                BreweryAdapter adapter = new BreweryAdapter(MainActivity.this, myBreweries);
                listBreweries.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Brewery>> call, Throwable t) {
                Toasty.error(getApplicationContext(), "Ocurrió un error", Toast.LENGTH_SHORT, true).show();
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, BreweryDetails.class);
        intent.putExtra("objBrewery", myBreweries.get(position));
        startActivity(intent);
    }
}