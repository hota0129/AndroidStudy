package com.example.common.sampleapplication4.util;

import android.widget.Toast;
import android.content.Context;


/**
 * Created by common on 2015/01/27.
 */
public class Util {
    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();

    }
}
