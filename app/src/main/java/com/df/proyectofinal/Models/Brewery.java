package com.df.proyectofinal.Models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Brewery implements Serializable {
    @SerializedName("id")
    private String idBreweries;

    @SerializedName("obdb_id")
    private String obdb_idBreweries;

    @SerializedName("name")
    private String nameBreweries;

    @SerializedName("brewery_type")
    private String brewery_typeBreweries;

    @SerializedName("city")
    private String cityBreweries;

    @SerializedName("state")
    private String stateBreweries;

    @SerializedName("country")
    private String countryBreweries;

    public Brewery(String idBreweries, String obdb_idBreweries, String nameBreweries,
                   String brewery_typeBreweries, String cityBreweries, String stateBreweries,
                   String countryBreweries) {
        this.idBreweries = idBreweries;
        this.obdb_idBreweries = obdb_idBreweries;
        this.nameBreweries = nameBreweries;
        this.brewery_typeBreweries = brewery_typeBreweries;
        this.cityBreweries = cityBreweries;
        this.stateBreweries = stateBreweries;
        this.countryBreweries = countryBreweries;
    }

    public String getIdBreweries() {
        return idBreweries;
    }

    public void setIdBreweries(String idBreweries) {
        this.idBreweries = idBreweries;
    }

    public String getObdb_idBreweries() {
        return obdb_idBreweries;
    }

    public void setObdb_idBreweries(String obdb_idBreweries) {
        this.obdb_idBreweries = obdb_idBreweries;
    }

    public String getNameBreweries() {
        return nameBreweries;
    }

    public void setNameBreweries(String nameBreweries) {
        this.nameBreweries = nameBreweries;
    }

    public String getBrewery_typeBreweries() {
        return brewery_typeBreweries;
    }

    public void setBrewery_typeBreweries(String brewery_typeBreweries) {
        this.brewery_typeBreweries = brewery_typeBreweries;
    }

    public String getCityBreweries() {
        return cityBreweries;
    }

    public void setCityBreweries(String cityBreweries) {
        this.cityBreweries = cityBreweries;
    }

    public String getStateBreweries() {
        return stateBreweries;
    }

    public void setStateBreweries(String stateBreweries) {
        this.stateBreweries = stateBreweries;
    }

    public String getCountryBreweries() {
        return countryBreweries;
    }

    public void setCountryBreweries(String countryBreweries) {
        this.countryBreweries = countryBreweries;
    }
}
