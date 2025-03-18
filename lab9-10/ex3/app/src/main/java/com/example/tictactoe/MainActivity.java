package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int[][] tablaJoc = new int[3][3];
    private boolean playerXturn = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        androidx.gridlayout.widget.GridLayout gridLayout = findViewById(R.id.gridLayout);

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                int finalI = i;
                int finalJ = j;
                TextView celula = (TextView) gridLayout.getChildAt(i*3 + j);
                if (celula == null) {
                    continue;
                }
                celula.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(tablaJoc[finalI][finalJ] == 0){
                            if(playerXturn == true){
                                tablaJoc[finalI][finalJ] = 1;
                                celula.setText("X");

                            } else {
                                tablaJoc[finalI][finalJ] = 2;
                                celula.setText("0");
                            }
                            if(verificaVictorie()) {
                                if (playerXturn) {
                                    Toast.makeText(MainActivity.this, "X a castigat!", Toast.LENGTH_SHORT).show();
                                    resetGame();
                                } else {
                                    Toast.makeText(MainActivity.this, "0 a castigat!", Toast.LENGTH_SHORT).show();
                                    resetGame();
                                }

                            } else if(verificaTablaPlina()){
                                Toast.makeText(MainActivity.this, "EGALITATE!", Toast.LENGTH_SHORT).show();
                                resetGame();
                            } else {
                                playerXturn = !playerXturn;
                            }

                        }
                    }
                });
            }
        }


    }
    private boolean verificaVictorie(){
        for (int i = 0; i < 3; i++) {
            if (tablaJoc[i][0] == tablaJoc[i][1] && tablaJoc[i][1] == tablaJoc[i][2] && tablaJoc[i][0] != 0) {
                return true;
            }
            if (tablaJoc[0][i] == tablaJoc[1][i] && tablaJoc[1][i] == tablaJoc[2][i] && tablaJoc[0][i] != 0) {
                return true;
            }
        }
        if (tablaJoc[0][0] == tablaJoc[1][1] && tablaJoc[1][1] == tablaJoc[2][2] && tablaJoc[0][0] != 0) {
            return true;
        }
        if (tablaJoc[0][2] == tablaJoc[1][1] && tablaJoc[1][1] == tablaJoc[2][0] && tablaJoc[0][2] != 0) {
            return true;
        }
        return false;
    }

    private boolean verificaTablaPlina(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablaJoc[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetGame() {
        androidx.gridlayout.widget.GridLayout gridLayout = findViewById(R.id.gridLayout);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablaJoc[i][j] = 0;
                ((TextView) gridLayout.getChildAt(i * 3 + j)).setText("--");
            }
        }
        playerXturn = true;
    }
}