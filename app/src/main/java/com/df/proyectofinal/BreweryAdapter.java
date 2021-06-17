package com.df.proyectofinal;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.df.proyectofinal.Models.Brewery;

import java.util.List;

public class BreweryAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Brewery> myBreweries;

    public BreweryAdapter(Activity activity, List<Brewery> myBreweries) {
        this.activity = activity;
        this.myBreweries = myBreweries;
    }

    @Override
    public int getCount() {
        return myBreweries.size();
    }

    @Override
    public Object getItem(int position) {
        return myBreweries.get(position);
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
            view = inflater.inflate(R.layout.brewery_item, null);
        }
        Brewery brewery = myBreweries.get(position);
        TextView nameBrewery = view.findViewById(R.id.txtNameBrewery);
        nameBrewery.setText(brewery.getNameBreweries());
        return view;
    }
}
