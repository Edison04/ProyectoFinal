package com.df.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.df.proyectofinal.ApiManager.RetrofitClient;
import com.df.proyectofinal.Models.Autocomplete;

import java.util.List;

import es.dmoral.toasty.Toasty;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AutocompleteActivity extends AppCompatActivity {

    private String text;
    ListView listAutocomplete;
    List<Autocomplete> myAutocompletes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autocomplete);

        text = getIntent().getStringExtra("text");

        listAutocomplete = findViewById(R.id.lvAutocomplete);
        getAutocompleteFromApi(text);
    }

    private void getAutocompleteFromApi(String text) {
        Call<List<Autocomplete>> call = RetrofitClient.getInstance().getMyApi().getAutocomplete(text);
        call.enqueue(new Callback<List<Autocomplete>>() {
            @Override
            public void onResponse(Call<List<Autocomplete>> call, Response<List<Autocomplete>> response) {
                myAutocompletes = response.body();
                AutocompleteAdapter adapter = new AutocompleteAdapter(AutocompleteActivity.this, myAutocompletes);
                listAutocomplete.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Autocomplete>> call, Throwable t) {

            }
        });
    }
}