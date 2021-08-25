package com.omeraydmr.catchthekenny;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scoreBoard;
    TextView timer;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize
        timer = (TextView) findViewById(R.id.timer);
        scoreBoard = (TextView) findViewById(R.id.scoreBoard);
        score = 0;

        new CountDownTimer(10000,1000) {

            @Override
            public void onTick(long millisUntilFinish) {
                timer.setText("Time : "+ millisUntilFinish/1000);
            }

            @Override
            public void onFinish() {

            }
        }.start();

    }

    public void increaseScore(View view) {
        score++;
        scoreBoard.setText("Score : "+ score);
    }
}