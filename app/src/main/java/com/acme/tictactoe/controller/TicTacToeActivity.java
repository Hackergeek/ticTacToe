package com.acme.tictactoe.controller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.acme.tictactoe.R;

public class TicTacToeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tictactoe);
    }
}
