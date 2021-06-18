package com.df.proyectofinal;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.df.proyectofinal.Models.Autocomplete;

import java.util.List;

public class AutocompleteAdapter extends BaseAdapter {
    protected Activity activity;
    protected List<Autocomplete> myAutocompletes;

    public AutocompleteAdapter(Activity activity, List<Autocomplete> myBreweries) {
        this.activity = activity;
        this.myAutocompletes = myBreweries;
    }

    @Override
    public int getCount() {
        return myAutocompletes.size();
    }

    @Override
    public Object getItem(int position) {
        return myAutocompletes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.autocomplete_item, null);
        }
        Autocomplete autocomplete = myAutocompletes.get(position);
        TextView idAutocomplete = view.findViewById(R.id.txtIdAutocomplete);
        TextView nameAutocomplete = view.findViewById(R.id.txtNameAutocomplete);
        idAutocomplete.setText(autocomplete.getIdAutocomplete());
        nameAutocomplete.setText(autocomplete.getNameAutocomplete());
        return view;
    }
}
