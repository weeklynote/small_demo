package com.android.samll.small;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import net.wequick.small.Small;

/**
 * An example launcher activity that setUp the Small bundles and launch the main plugin.
 */
public class LaunchActivity extends Activity {

    boolean mCompleted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View main = findViewById(R.id.main);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mCompleted) return;
                if (!Small.openUri("main", LaunchActivity.this)) {
                    Toast.makeText(LaunchActivity.this,
                            "Open failed, see log for detail!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        View sec = findViewById(R.id.second);
        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mCompleted) return;
                if (!Small.openUri("main/sec", LaunchActivity.this)) {
                    Toast.makeText(LaunchActivity.this,
                            "Open failed, see log for detail!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        View extra = findViewById(R.id.extra);
        extra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mCompleted) return;
                if (!Small.openUri("main/query?name=android&age=26&addr=sichuan", LaunchActivity.this)) {
                    Toast.makeText(LaunchActivity.this,
                            "Open failed, see log for detail!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        View entity = findViewById(R.id.entity);
        entity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mCompleted) return;
                if (!Small.openUri("main/pass_entity", LaunchActivity.this)) {
                    Toast.makeText(LaunchActivity.this,
                            "Open failed, see log for detail!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Small.setUp(this, new Small.OnCompleteListener() {
            @Override
            public void onComplete() {
                mCompleted = true;
            }
        });
    }
}
