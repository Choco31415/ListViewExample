package com.example.administrator.listviewexample;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by 101015 on 4/26/2016.
 */
public class PersonAdapter extends ArrayAdapter<Person> {

    public PersonAdapter(Context context, List<Person> objects) {
        super(context, 0, objects);
    }
}
