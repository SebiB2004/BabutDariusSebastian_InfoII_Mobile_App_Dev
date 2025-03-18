package com.example.stopwatch;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    boolean timerOn = false;
    private Handler handler = new Handler();
    private Runnable runnable;

    private int secunde = 0;

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

        Button buttonStart = findViewById(R.id.buttonStartWatch);
        Button buttonStop = findViewById(R.id.buttonStopWatch);
        TextView textViewTimer = findViewById(R.id.textViewTimer);
        Button buttonReset = findViewById(R.id.buttonReset);

        runnable = new Runnable() {
            @Override
            public void run() {
                if(timerOn){
                    secunde++;
                    int min = secunde / 60;
                    int sec = secunde % 60;
                    textViewTimer.setText(String.format("%02d:%2d", min, sec));
                    handler.postDelayed(this, 1000);
                }
            }
        };


        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!timerOn){
                    timerOn = true;
                    handler.post(runnable);
                }
            }
        });

        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timerOn = false;
            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timerOn = false;
                handler.removeCallbacks(runnable);

                secunde = 0;
                textViewTimer.setText("00:00");

            }
        });
    }
}