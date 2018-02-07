package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int scoreAwayTeam = 0;
    int scoreHomeTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForAwayTeam(scoreAwayTeam);
        displayForHomeTeam(scoreHomeTeam);
    }

    /**
     * Away Team scoring buttons
     */
    public void displayForAwayTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_score);
        scoreView.setText(String.valueOf(score));
    }
    public void touchdownAwayTeam (View view) {
        scoreAwayTeam = scoreAwayTeam + 6;
        displayForAwayTeam(scoreAwayTeam);
    }
    public void fieldGoalAwayTeam (View view){
        scoreAwayTeam = scoreAwayTeam + 3;
        displayForAwayTeam(scoreAwayTeam);
    }
    public void tPCAwayTeam (View view){
        scoreAwayTeam = scoreAwayTeam + 2;
        displayForAwayTeam(scoreAwayTeam);
    }
    public void extraPointAwayTeam (View view){
        scoreAwayTeam = scoreAwayTeam + 1;
        displayForAwayTeam(scoreAwayTeam);
    }
    public void safetyAwayTeam (View view){
        scoreAwayTeam = scoreAwayTeam + 2;
        displayForAwayTeam(scoreAwayTeam);
    }

    /**
     * Home Team scoring buttons
     */
    public void displayForHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }
    public void touchdownHomeTeam (View view) {
        scoreHomeTeam = scoreHomeTeam + 6;
        displayForHomeTeam(scoreHomeTeam);
    }
    public void fieldGoalHomeTeam (View view){
        scoreHomeTeam = scoreHomeTeam + 3;
        displayForHomeTeam(scoreHomeTeam);
    }
    public void tPCHomeTeam (View view){
        scoreHomeTeam = scoreHomeTeam + 2;
        displayForHomeTeam(scoreHomeTeam);
    }
    public void extraPointHomeTeam (View view){
        scoreHomeTeam = scoreHomeTeam + 1;
        displayForHomeTeam(scoreHomeTeam);
    }
    public void safetyHomeTeam (View view){
        scoreHomeTeam = scoreHomeTeam + 2;
        displayForHomeTeam(scoreHomeTeam);
    }

    /**Resets score*/

    public void resetScore (View view){
        scoreAwayTeam = 0;
        scoreHomeTeam = 0;
        displayForAwayTeam(scoreAwayTeam);
        displayForHomeTeam(scoreHomeTeam);
    }
}
