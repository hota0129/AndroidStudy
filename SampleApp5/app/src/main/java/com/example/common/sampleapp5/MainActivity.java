package com.example.common.sampleapp5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);

        Button btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    private static final String ACTION_BROADCAST_EVENT = "com.example.common.sampleapp5.BROADCAST_EVENT";

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button: {
                Intent intent = new Intent();
                EditText editText = (EditText)findViewById(R.id.text);
                String msg = editText.getText().toString();
                intent.setAction(ACTION_BROADCAST_EVENT);
                intent.putExtra("String", msg);
                sendBroadcast(intent);
                break;
            }
            case R.id.button2: {
                MyIntentService.startActionBroadcast(getApplicationContext());
                break;
            }
        }
    }
}
