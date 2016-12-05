package com.example.wlw.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by wlw on 2016/12/5.
 */
public class FruitAdapter extends ArrayAdapter<Fruits> {
    public FruitAdapter(Context context, int resource, List<Fruits> objects) {

        super(context, resource, objects);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruits fruits = getItem(position);
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.fruits_item, null);

        } else {
            view = convertView;
        }
        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruits_image);
        TextView fruitstitle= (TextView) view.findViewById(R.id.fruits_title);
        TextView fruitsdesc= (TextView) view.findViewById(R.id.fruits_desc);
        fruitImage.setImageResource(fruits.getImageID());
        fruitstitle.setText(fruits.getTitle());
        fruitsdesc.setText(fruits.getDesc());
        return view;

    }
}
