package com.app.rohullah.notes;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;

/**
 * Created by Dator005Avd2 on 2016-08-11.
 */
public class G extends Application {
    public static Context context;
    public static LayoutInflater inflater;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        inflater= (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
}
