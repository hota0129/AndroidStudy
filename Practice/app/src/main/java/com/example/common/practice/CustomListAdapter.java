package com.example.common.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by common on 2015/03/31.
 */
public class CustomListAdapter extends ArrayAdapter<User> {
    LayoutInflater mLayoutInflater;

    public CustomListAdapter(Context context, int resource, List<User> object) {
        super(context, resource, object);

        mLayoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;

        if(convertView == null) {
            view = mLayoutInflater.inflate(R.layout.custom_list_item, parent, false);
        }
        else {
            view = convertView;
        }
        User user = getItem(position);
        ((ImageView)view.findViewById(R.id.icon)).setImageDrawable(user.getIcon());
        ((TextView)view.findViewById(R.id.text_view_name)).setText(user.getName());
        ((TextView)view.findViewById(R.id.text_view_mail)).setText(user.getMail());
        return view;
    }
}

