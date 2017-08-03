package com.samlltest.app.main;

import android.app.Activity;
import android.os.Bundle;

import net.wequick.small.Small;

public class PassEntityActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String uri = "sub";
        Small.openUri(uri, this);
    }
}
