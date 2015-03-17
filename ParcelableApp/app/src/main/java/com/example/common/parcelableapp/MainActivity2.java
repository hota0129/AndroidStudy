package com.example.common.parcelableapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.common.parcelableapp.data.User;
import com.example.common.parcelableapp.util.Utility;


public class MainActivity2 extends Activity implements View.OnClickListener {

    private User mUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        ((Button)findViewById(R.id.Button)).setOnClickListener(this);
        ((Button)findViewById(R.id.Button2)).setOnClickListener(this);

        mUser = bundle.getParcelable("parcelable_data");
        Log.i("### ota", "get data:" + mUser.toString());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        // TODO; 読み込みは来週
        switch(v.getId()) {
            case R.id.Button :
                Utility.savePreferences(getApplicationContext(), mUser.getUserId(), mUser.getUserName(), mUser.getMail());
                break;
            case R.id.Button2 :
                SharedPreferences preferences = getSharedPreferences("user", Context.MODE_PRIVATE);
                int userId = preferences.getInt("userId", -1);
                String userName = preferences.getString("userName", "");
                String mailAddr = preferences.getString("mail", "");
                Log.i("### ota", "userId:" + userId + ", userName:" + userName + ", mailAddr:" + mailAddr);
                break;
        }
    }
}
