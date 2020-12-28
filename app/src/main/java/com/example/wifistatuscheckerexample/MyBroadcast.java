package com.example.wifistatuscheckerexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.widget.Toast;

public class MyBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int wifiStateExtra = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE, WifiManager.WIFI_STATE_UNKNOWN);

        switch (wifiStateExtra){
            case WifiManager.WIFI_STATE_DISABLED:
                Toast.makeText(context, "WIFI is disabled", Toast.LENGTH_SHORT).show(); break;
            case WifiManager.WIFI_STATE_ENABLED:
                Toast.makeText(context,  "WIFI is enabled", Toast.LENGTH_SHORT).show(); break;
            case WifiManager.WIFI_STATE_UNKNOWN:
                Toast.makeText(context, "WIFI is unknown", Toast.LENGTH_SHORT).show(); break;
        }


    }
}
