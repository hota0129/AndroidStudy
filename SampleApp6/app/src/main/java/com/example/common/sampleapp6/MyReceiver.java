package com.example.common.sampleapp6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("### log", "getAction: " + intent.getAction());
        Intent activity = new Intent();
        activity.setClass(context, MainActivity.class);
        activity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.putExtra("String", intent.getStringExtra("String"));
        context.startActivity(activity);
    }
}
