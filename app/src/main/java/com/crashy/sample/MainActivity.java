package com.crashy.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnFireCrash).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fireCrash();
            }
        });
    }

    private void fireCrash() {
        throw new IllegalStateException("This is a our Fired Crash!");
    }
}
