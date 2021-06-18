package com.df.proyectofinal.Models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Autocomplete implements Serializable {
    @SerializedName("id")
    private String idAutocomplete;

    @SerializedName("name")
    private String nameAutocomplete;

    public Autocomplete(String idBreweries, String nameBreweries) {
        this.idAutocomplete = idBreweries;
        this.nameAutocomplete = nameBreweries;
    }

    public String getIdAutocomplete() {
        return idAutocomplete;
    }

    public void setIdAutocomplete(String idAutocomplete) {
        this.idAutocomplete = idAutocomplete;
    }

    public String getNameAutocomplete() {
        return nameAutocomplete;
    }

    public void setNameAutocomplete(String nameAutocomplete) {
        this.nameAutocomplete = nameAutocomplete;
    }
}
