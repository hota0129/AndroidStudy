package com.example.common.sampleapplication4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.common.sampleapplication4.util.Util;


public class MainActivity2 extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);

        Intent intent = getIntent();

        String text = intent.getStringExtra("text_data");
        TextView textView = (TextView)findViewById(R.id.textview);
        textView.setText(text);

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
        Util.showToast(getApplicationContext(), "back button is clicked");

        Intent intent = new Intent();

        intent.putExtra("text_key", "input text");

        setResult(RESULT_OK, intent);
//        setResult(RESULT_FIRST_USER, intent);
        finish();
    }
}
