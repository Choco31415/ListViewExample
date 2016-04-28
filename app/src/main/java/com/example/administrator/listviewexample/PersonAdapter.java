package com.example.administrator.listviewexample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 101015 on 4/26/2016.
 */
public class PersonAdapter extends ArrayAdapter<Person> {

    public PersonAdapter(Context context, List<Person> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Person person = getItem(position);
        TextView itemTopText = (TextView) convertView.findViewById(android.R.id.text1);
        TextView itemBottomText = (TextView) convertView.findViewById(android.R.id.text2);

        itemTopText.setText(person.name);
        itemBottomText.setText(person.age);

        return convertView;
    }
}
