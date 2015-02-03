package com.example.common.sampleapplication4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.common.sampleapplication4.util.Util;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    private static final int RESULT_CODE_1 = 0x01;

    @Override
    public void onClick(View v) {

        // 文字列の取得
        EditText editText = (EditText) findViewById(R.id.et);
        String text = editText.getText().toString();
        // TODO; textの入力値チェック


        Intent intent = new Intent();
//        intent.setClassName("com.android.settings", "com.android.settings.Settings");
        intent.setClass(getApplicationContext(), MainActivity2.class);
        intent.putExtra(KEY_INTENT_DATA_EDITTEXT, text);
//        startActivity(intent);
        startActivityForResult(intent, RESULT_CODE_1);
    }

    public static String KEY_INTENT_DATA_EDITTEXT = "text_data";

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case RESULT_CODE_1: {
                switch (resultCode) {
                    case RESULT_OK:
                        Util.showToast(getApplicationContext(), data.getStringExtra("text_key"));

                        break;
                    case RESULT_CANCELED:
                        Util.showToast(getApplicationContext(), "RESULT_CANCELED");
                        break;
                    case RESULT_FIRST_USER:
                        Util.showToast(getApplicationContext(), "RESULT_FIRST_USER");
                        break;
                    case RESULT_FIRST_USER + 1:
                        Util.showToast(getApplicationContext(), "RESULT_FIRST_USER+1");
                        break;
                    default:
                        break;
                }
                break;
            }
            default: {
                // unknown
                Util.showToast(getApplicationContext(), "back button is clicked");
                break;
            }
        }
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

}
