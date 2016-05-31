package com.example.user.facebook;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Custom_adapter_friend extends ArrayAdapter<String> {
    Context c;
    ArrayList<String> email;

    public Custom_adapter_friend(Context context, ArrayList<String> resource) {
        super(context, R.layout.activity_custom_adapter_friend, R.id.textfriends, resource);
        this.c = context;
        this.email = resource;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater lv = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row =lv.inflate(R.layout.activity_custom_adapter_friend,parent,false);
        TextView t =(TextView) row.findViewById(R.id.textfriends);
        t.setText(email.get(position));
        return row;

    }
}