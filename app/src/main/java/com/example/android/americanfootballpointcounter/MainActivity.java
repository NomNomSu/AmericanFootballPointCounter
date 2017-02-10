package com.example.android.americanfootballpointcounter;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.americanfootballpointcounter.R.id.teamAname;

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
        //startActivity(new Intent(MainActivity.this,PopUp.class));
        displayForTeamA(0);
        displayForTeamB(0);
        sixPointsA = (Button) findViewById(R.id.teamAPlusSix);
        threePointsA = (Button) findViewById(R.id.teamAPlusThree);
        twoPointsA = (Button) findViewById(R.id.teamAPlusTwo);
        onePointA = (Button) findViewById(R.id.teamAPlusOne);
        sixPointsB = (Button) findViewById(R.id.teamBPlusSix);
        threePointsB = (Button) findViewById(R.id.teamBPlusThree);
        twoPointsB = (Button) findViewById(R.id.teamBPlusTwo);
        onePointB = (Button) findViewById(R.id.teamBPlusOne);

        // Pop up stuff
        AlertDialog.Builder popBuilder = new AlertDialog.Builder(MainActivity.this);
        View popView = getLayoutInflater().inflate(R.layout.pop_up, null);
        final EditText tA = (EditText) popView.findViewById(R.id.team_a_input);
        final EditText tB = (EditText) popView.findViewById(R.id.team_b_input);
        Button nC = (Button) popView.findViewById(R.id.names_confirm);
        final TextView tAString = (TextView) findViewById(teamAname);
        final TextView tBString = (TextView) findViewById(R.id.teamBname);


        popBuilder.setView(popView);
        final AlertDialog dialog = popBuilder.create();
        dialog.show();

        tAString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });

        tBString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });

        nC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tA.getText().toString().isEmpty() && !tB.getText().toString().isEmpty()) {
                    tAString.setText(tA.getText().toString());
                    tBString.setText(tB.getText().toString());
                    dialog.dismiss();
                } else {
                    dialog.dismiss();
                }
            }
        });
        // End of Pop up stuff

        //Team A on click code
        //add or remove six points
        sixPointsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                scoreTeamA = scoreTeamA + 6;
                displayForTeamA(scoreTeamA);
            }
        });
        //add or remove three points
        threePointsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                scoreTeamA = scoreTeamA + 3;
                displayForTeamA(scoreTeamA);
            }
        });
        //add or remove two points
        twoPointsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                scoreTeamA = scoreTeamA + 2;
                displayForTeamA(scoreTeamA);
            }
        });
        //add or remove one point
        onePointA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                scoreTeamA = scoreTeamA + 1;
                displayForTeamA(scoreTeamA);
            }
        });
        //Team A on long click code
        sixPointsA.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View va) {
                if (scoreTeamA > 0) {
                    scoreTeamA = scoreTeamA - 6;
                    displayForTeamA(scoreTeamA);
                }
                return true;
            }
        });
        threePointsA.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View va) {
                if (scoreTeamA > 0) {
                    scoreTeamA = scoreTeamA - 3;
                    displayForTeamA(scoreTeamA);
                }
                return true;
            }
        });
        twoPointsA.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View va) {
                if (scoreTeamA > 0) {
                    scoreTeamA = scoreTeamA - 2;
                    displayForTeamA(scoreTeamA);
                }
                return true;
            }
        });
        onePointA.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View va) {
                if (scoreTeamA > 0) {
                    scoreTeamA = scoreTeamA - 1;
                    displayForTeamA(scoreTeamA);
                }
                return true;
            }
        });
        //Team B  on click code
        //add or remove six points
        sixPointsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vb) {
                scoreTeamB = scoreTeamB + 6;
                displayForTeamB(scoreTeamB);
            }
        });
        //add or remove three points
        threePointsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vb) {
                scoreTeamB = scoreTeamB + 3;
                displayForTeamB(scoreTeamB);
            }
        });
        //add or remove two points
        twoPointsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vb) {
                scoreTeamB = scoreTeamB + 2;
                displayForTeamB(scoreTeamB);
            }
        });
        //add or remove one point
        onePointB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vb) {
                scoreTeamB = scoreTeamB + 1;
                displayForTeamB(scoreTeamB);
            }
        });
        //Team B on long click code
        sixPointsB.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View vb) {
                if (scoreTeamB > 0) {
                    scoreTeamB = scoreTeamB - 6;
                    displayForTeamB(scoreTeamB);
                }
                return true;
            }
        });
        threePointsB.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View vb) {
                if (scoreTeamB > 0) {
                    scoreTeamB = scoreTeamB - 3;
                    displayForTeamB(scoreTeamB);
                }
                return true;
            }
        });
        twoPointsB.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View vb) {
                if (scoreTeamB > 0) {
                    scoreTeamB = scoreTeamB - 2;
                    displayForTeamB(scoreTeamB);
                }
                return true;
            }
        });
        onePointB.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View vb) {
                if (scoreTeamB > 0) {
                    scoreTeamB = scoreTeamB - 1;
                    displayForTeamB(scoreTeamB);
                }
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
    public void resetPoints(View vc) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


}
