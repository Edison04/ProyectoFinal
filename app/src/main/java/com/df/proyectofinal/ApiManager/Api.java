package com.df.proyectofinal.ApiManager;

import com.df.proyectofinal.Models.Autocomplete;
import com.df.proyectofinal.Models.Brewery;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {
    String BASE_URL = "https://api.openbrewerydb.org/";

    @GET("breweries")
    Call <List<Brewery>> getBreweries();

    @GET("breweries/{id}")
    Call<Brewery> getBreweries(@Path("id") String id);

    @GET("breweries/autocomplete")
    Call<List<Autocomplete>> getAutocomplete(@Query("query") String text);
}
