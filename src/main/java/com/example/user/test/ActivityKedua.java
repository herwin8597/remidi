package com.example.user.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {

    int scoreTeamA, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));


    }

    public void tigaPointA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }

    public void duaPointA(View v) {
        scoreTeamA = scoreTeamA - 1;
        displayForTeamA(scoreTeamA);


    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    public void tigaPointB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);


    }

    public void duaPointB(View v) {
        scoreTeamB = scoreTeamB - 1;
        displayForTeamB(scoreTeamB);

    }


    public void resetPoint(View v) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
    }

    public void resetPointB(View v) {
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);

    }
}
