package com.example.androidforbeginner;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

public class StatusBar {
    public static void changingStatusBar(Activity activity) {
        //changing statusbar
        if (android.os.Build.VERSION.SDK_INT >= 21){
            Window window = activity.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(activity.getResources().getColor(R.color.colorGreenDark));
        }
    }
}
