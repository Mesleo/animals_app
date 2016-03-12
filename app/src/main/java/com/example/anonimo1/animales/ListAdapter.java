package com.example.anonimo1.animales;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by anonimo1 on 05/02/2016.
 */
public class ListAdapter extends ArrayAdapter<Animal> {
    private Activity activity;
    ArrayList<String> mensajes;

    public ListAdapter(Activity activity, ArrayList<String> mensajes) {
        super(activity, R.layout.animal);
        this.activity = activity;
        this.mensajes = mensajes;
    }

    static class ViewHolder {
    }

    public int getCount() {
        return mensajes.size();
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View convertView,
                        final ViewGroup parent) {
        View view = null;
        return view;
    }
}
