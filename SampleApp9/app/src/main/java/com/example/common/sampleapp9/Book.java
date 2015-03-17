package com.example.common.sampleapp9;

import android.graphics.drawable.Drawable;

/**
 * Created by common on 2015/03/03.
 */
public class Book {
    private String mTitle;
    private String mCompany;
    private Drawable mIcon;
    private String mPrice;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getCompany() {
        return mCompany;
    }

    public void setCompany(String mCompany) {
        this.mCompany = mCompany;
    }

    public Drawable getIcon() {
        return mIcon;
    }

    public void setIcon(Drawable mIcon) {
        this.mIcon = mIcon;
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String mPrice) {
        this.mPrice = mPrice;
    }
}
