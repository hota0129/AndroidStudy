package com.example.common.parcelableapp.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by common on 2015/03/10.
 */
public class Utility {
    public static void savePreferences(Context context, int userId, String userName, String mail){
        SharedPreferences sharedPreferences = context.getSharedPreferences("user", context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("userId", userId);
        editor.putString("userName", userName);
        editor.putString("mail", mail);
        editor.commit();    // 保存
    }
}
