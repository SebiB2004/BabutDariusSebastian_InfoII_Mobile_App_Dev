package com.example.batterylevel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.Toast;

public class BatteryLevel extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        int nivel = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        int maxim = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
        float nivelBaterie = nivel * 100 / (float)maxim;

        if(nivelBaterie < 20){
            Toast.makeText(context, "Baterie scazuta: " + nivelBaterie + "%", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, "Nivelul bateriei: " + nivelBaterie + "%", Toast.LENGTH_LONG).show();
        }
    }
}
