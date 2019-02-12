package com.zxu.spotsdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import dmax.dialog.SpotsDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(android.R.id.button1).setOnClickListener(this);
        findViewById(android.R.id.button2).setOnClickListener(this);
        findViewById(android.R.id.button3).setOnClickListener(this);
        findViewById(android.R.id.closeButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case android.R.id.button1:
                new SpotsDialog.Builder()
                        .setContext(this)
                        .build()
                        .show();
                break;
            case android.R.id.button2:
                new SpotsDialog.Builder()
                        .setContext(this)
                        .setTheme(R.style.Custom)
                        .build()
                        .show();
                break;
            case android.R.id.button3:
                new SpotsDialog.Builder()
                        .setContext(this)
                        .setMessage("Custom message")
                        .build()
                        .show();
                break;
            case android.R.id.closeButton:
                new SpotsDialog.Builder()
                        .setContext(this)
                        .setTheme(R.style.Custom)
                        .setMessage(R.string.app_name)
                        .build()
                        .show();
                break;
        }
    }
}
