package com.samlltest.app.main;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import net.wequick.small.Small;

public class QueryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);
        Uri uri = Small.getUri(this);
        if(uri != null){
            TextView txt = (TextView) findViewById(R.id.intent_extra);
            txt.setText(uri.getQueryParameter("name") + "\n" + uri.getQueryParameter("age") + "\n" + uri.getQueryParameter("addr"));
        }
    }
}
