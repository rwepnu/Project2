package com.example.android.project2;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    int scorefA=0;
    int scorefB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamAfouls(int score) {
        TextView foulsView = (TextView) findViewById(R.id.team_a_scorefouls);
        foulsView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score)); }

    public void displayForTeamBfouls(int score) {
        TextView foulsViewB = (TextView) findViewById(R.id.team_b_scorefouls);
        foulsViewB.setText(String.valueOf(score));}

    public void incrementScoureTeamA (View view){

        scoreA=scoreA +1;
        displayForTeamA(scoreA);
    }
    public void incrementScoureTeamB (View view){

        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
    public void incrementFoulsTeamA (View view){
        scorefA=scorefA +1;

        displayForTeamAfouls(scorefA);
    }

    public void incrementFoulsTeamB (View view){
        scorefB=scorefB+1;


        displayForTeamBfouls(scorefB);
    }

    public void resetScore(View view){

        scoreA=0;
        scoreB=0;
        scorefA=0;
        scorefB=0;

        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
        displayForTeamAfouls(scorefA);
        displayForTeamBfouls(scorefB);


    }

}




