package com.example.batterylevel;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    BatteryLevel nivelBaterie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nivelBaterie = new BatteryLevel();
        IntentFilter filtru = new IntentFilter();
        filtru.addAction(Intent.ACTION_BATTERY_CHANGED);
        filtru.addAction(Intent.ACTION_BATTERY_LOW);
        registerReceiver(nivelBaterie, filtru);
    }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            unregisterReceiver(nivelBaterie);
        }

}