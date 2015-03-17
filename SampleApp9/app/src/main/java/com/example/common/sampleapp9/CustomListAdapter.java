package com.example.common.sampleapp9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

/**
 * Created by common on 2015/03/03.
 */
public class CustomListAdapter extends ArrayAdapter<Book> {
    LayoutInflater mLayoutInflater;

    public CustomListAdapter(Context context, int resource, List<Book> object) {
        super(context, resource, object);

        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;

        /* 再利用するため。 */
        if (convertView == null) {
            /* レイアウトのviewを作る。 */
            view = mLayoutInflater.inflate(R.layout.listitem, parent, false);
        } else {
            view = convertView;
        }
        return view;
    }
}
