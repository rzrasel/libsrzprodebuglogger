package com.rzandroid.usagesprodebuglogger;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.rzandroid.libsprodebuglogger.ProLogWriter;

public class ActivitySplash extends AppCompatActivity {
    private Activity activity;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
        context = this;
        setContentView(R.layout.activity_splash);
        //
        ProLogWriter.log("DEBUG_LOG_WRITE");
    }
}