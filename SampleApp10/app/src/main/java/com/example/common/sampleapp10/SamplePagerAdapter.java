package com.example.common.sampleapp10;

import android.content.ContentProvider;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.security.auth.Destroyable;

/**
 * Created by common on 2015/03/03.
 */
public class SamplePagerAdapter extends PagerAdapter {

    private Context mContext;
    public SamplePagerAdapter(Context context) {
        mContext = context;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView textView = new TextView(mContext);
        textView.setText("position: " + position);
        Log.i("### ota", " position:" + String.valueOf(position));
        container.addView(textView);
       return textView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        Log.i("### ota", String.valueOf(view == (TextView) o));
        return view == (TextView) o;
    }
}
