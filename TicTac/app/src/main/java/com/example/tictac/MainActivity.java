package com.example.tictac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button[][] buttons = new Button[3][3];

    private boolean playerTurn = true;
    private int turnCount;

    private int playerPoints;
    private int CPUPoints;

    private TextView textViewPlayer;
    private TextView textViewCPU;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewPlayer = findViewById(R.id.view_player);
        textViewCPU = findViewById(R.id.view_cpu);

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                String buttonID = "button_"
            }
        }
    }
}