package com.example.common.sampleapp8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/**
 * Created by common on 2015/02/24.
 */
public class User {
    private String mTitle;
    private String mMessage;
    private Drawable mIcon;

    public Drawable getIcon() {
        return mIcon;
    }

    public void setIcon(Drawable mIcon) {
        this.mIcon = mIcon;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String mMessage) {
        this.mMessage = mMessage;
    }
}
