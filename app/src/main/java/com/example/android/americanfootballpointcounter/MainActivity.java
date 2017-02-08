package com.example.android.americanfootballpointcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA;
    private int scoreTeamB;
    private Button sixPointsA;
    private Button threePointsA;
    private Button twoPointsA;
    private Button onePointA;
    private Button sixPointsB;
    private Button threePointsB;
    private Button twoPointsB;
    private Button onePointB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        sixPointsA=(Button) findViewById(R.id.teamAPlusSix);
        threePointsA=(Button) findViewById(R.id.teamAPlusThree);
        twoPointsA=(Button) findViewById(R.id.teamAPlusTwo);
        onePointA=(Button) findViewById(R.id.teamAPlusOne);
        sixPointsB=(Button) findViewById(R.id.teamBPlusSix);
        threePointsB=(Button) findViewById(R.id.teamBPlusThree);
        twoPointsB=(Button) findViewById(R.id.teamBPlusTwo);
        onePointB=(Button) findViewById(R.id.teamBPlusOne);

        //Team A code
        //add or remove six points
        sixPointsA.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                scoreTeamA = scoreTeamA + 6;
                displayForTeamA(scoreTeamA);
            }
        });
        sixPointsA.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View va) {
                scoreTeamA = scoreTeamA - 6;
                displayForTeamA(scoreTeamA);
                return true;
            }
        });
        //add or remove three points
        threePointsA.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                scoreTeamA = scoreTeamA + 3;
                displayForTeamA(scoreTeamA);
            }
        });
        threePointsA.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View va) {
                scoreTeamA = scoreTeamA - 3;
                displayForTeamA(scoreTeamA);
                return true;
            }
        });
        //add or remove two points
        twoPointsA.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                scoreTeamA = scoreTeamA + 2;
                displayForTeamA(scoreTeamA);
            }
        });
        twoPointsA.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View va) {
                scoreTeamA = scoreTeamA - 2;
                displayForTeamA(scoreTeamA);
                return true;
            }
        });
        //add or remove one point
        onePointA.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                scoreTeamA = scoreTeamA + 1;
                displayForTeamA(scoreTeamA);
            }
        });
        onePointA.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View va) {
                scoreTeamA = scoreTeamA - 1;
                displayForTeamA(scoreTeamA);
                return true;
            }
        });
        //Team B code
        //add or remove six points
        sixPointsB.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View vb) {
                scoreTeamB = scoreTeamB + 6;
                displayForTeamB(scoreTeamB);
            }
        });
        sixPointsB.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View vb) {
                scoreTeamB= scoreTeamB - 6;
                displayForTeamB(scoreTeamB);
                return true;
            }
        });
        //add or remove three points
        threePointsB.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View vb) {
                scoreTeamB = scoreTeamB + 3;
                displayForTeamB(scoreTeamB);
            }
        });
        threePointsB.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View vb) {
                scoreTeamB = scoreTeamB - 3;
                displayForTeamB(scoreTeamB);
                return true;
            }
        });
        //add or remove two points
        twoPointsB.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View vb) {
                scoreTeamB = scoreTeamB + 2;
                displayForTeamB(scoreTeamB);
            }
        });
        twoPointsB.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View vb) {
                scoreTeamB = scoreTeamB - 2;
                displayForTeamB(scoreTeamB);
                return true;
            }
        });
        //add or remove one point
        onePointB.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View vb) {
                scoreTeamB = scoreTeamB + 1;
                displayForTeamB(scoreTeamB);
            }
        });
        onePointB.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View vb) {
                scoreTeamB = scoreTeamB - 1;
                displayForTeamB(scoreTeamB);
                return true;
            }
        });
    }

    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.teamApoints);
        scoreView.setText(String.valueOf(scoreTeamA));
    }
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.teamBpoints);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
    // Reset
    public void resetPoints (View vc) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


}
