package com.samlltest.app.sub;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.samlltest.lib.utils.Body;

import net.wequick.small.Small;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uri uri = Small.getUri(this);
        if(uri != null){
            String json = uri.getQueryParameter(Body.BODY_EXTRA);
            Body body = new Gson().fromJson(json, Body.class);
            if(body != null){
                TextView txt = (TextView) findViewById(R.id.app_sub);
                txt.setText(body.getName() + ":" + body.getAge() + ":" + body.getAddr());
            }
        }
    }
}
