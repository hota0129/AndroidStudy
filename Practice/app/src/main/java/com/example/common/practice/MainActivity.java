package com.example.common.practice;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<User> list = new ArrayList<User>();
        // TODO:IntentService を使用しデータを抜き出してリストに詰める。

        CustomListAdapter customListAdapter = new CustomListAdapter(this, R.layout.custom_list_item, list);
        User user = new User();
        user.setIcon(getResources().getDrawable(R.mipmap.ic_launcher));
        user.setMail("ota.hikaru@mail.com");
        user.setName("ota.hikaru");
        list.add(user);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(customListAdapter);
        listView.setOnItemClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
