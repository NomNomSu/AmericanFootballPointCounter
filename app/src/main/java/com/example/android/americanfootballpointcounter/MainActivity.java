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


        //threePointsA = (Button) findViewById(R.id.teamAPlusThree);
        //twoPointsA = (Button) findViewById(R.id.teamAPlusTwo);
        //onePointA = (Button) findViewById(R.id.teamAPlusOne);
        //sixPointsB = (Button) findViewById(R.id.teamBPlusSix);
        //threePointsB = (Button) findViewById(R.id.teamBPlusThree);
        //twoPointsB = (Button) findViewById(R.id.teamBPlusTwo);
        //onePointB = (Button) findViewById(R.id.teamBPlusOne);

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
                } else if (tA.getText().toString().isEmpty() && !tB.getText().toString().isEmpty()) {
                    //something
                    Toast.makeText(MainActivity.this, R.string.error_message, Toast.LENGTH_SHORT).show();
                } else if (!tA.getText().toString().isEmpty() && tB.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, R.string.error_message, Toast.LENGTH_SHORT).show();
                } else {
                    tAString.setText(R.string.team_A_name);
                    tBString.setText(R.string.team_B_name);
                    dialog.dismiss();
                }
            }
        });
        // End of Pop up stuff

        //Team A on click code

        final View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.teamAPlusSix:
                        scoreTeamA = scoreTeamA + 6;
                        displayForTeamA(scoreTeamA);
                        break;
                    case R.id.teamAPlusThree:
                        scoreTeamA = scoreTeamA + 3;
                        displayForTeamA(scoreTeamA);
                        break;
                    case R.id.teamAPlusTwo:
                        scoreTeamA = scoreTeamA + 2;
                        displayForTeamA(scoreTeamA);
                        break;
                    case R.id.teamAPlusOne:
                        scoreTeamA = scoreTeamA + 1;
                        displayForTeamA(scoreTeamA);
                        break;
                    case R.id.teamBPlusSix:
                        scoreTeamB = scoreTeamB +6;
                        displayForTeamB(scoreTeamB);
                        break;
                    case R.id.teamBPlusThree:
                        scoreTeamB = scoreTeamB + 3;
                        displayForTeamB(scoreTeamB);
                        break;
                    case R.id.teamBPlusTwo:
                        scoreTeamB = scoreTeamB + 2;
                        displayForTeamB(scoreTeamB);
                        break;
                    case R.id.teamBPlusOne:
                        scoreTeamB = scoreTeamB + 1;
                        displayForTeamB(scoreTeamB);
                        break;
                }
            }
        };

        final View.OnLongClickListener longListener = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View vl) {
                switch(vl.getId()) {
                    case R.id.teamAPlusSix:
                        scoreTeamA = scoreTeamA - 6;
                        displayForTeamA(scoreTeamA);
                        break;
                    case R.id.teamAPlusThree:
                        scoreTeamA = scoreTeamA - 3;
                        displayForTeamA(scoreTeamA);
                        break;
                    case R.id.teamAPlusTwo:
                        scoreTeamA = scoreTeamA - 2;
                        displayForTeamA(scoreTeamA);
                        break;
                    case R.id.teamAPlusOne:
                        scoreTeamA = scoreTeamA - 1;
                        displayForTeamA(scoreTeamA);
                        break;
                    case R.id.teamBPlusSix:
                        scoreTeamB = scoreTeamB - 6;
                        displayForTeamB(scoreTeamB);
                        break;
                    case R.id.teamBPlusThree:
                        scoreTeamB = scoreTeamB - 3;
                        displayForTeamB(scoreTeamB);
                        break;
                    case R.id.teamBPlusTwo:
                        scoreTeamB = scoreTeamB - 2;
                        displayForTeamB(scoreTeamB);
                        break;
                    case R.id.teamBPlusOne:
                        scoreTeamB = scoreTeamB - 1;
                        displayForTeamB(scoreTeamB);
                        break;
                }
                return true;
            }
        };

        findViewById(R.id.teamAPlusSix).setOnClickListener(clickListener);
        findViewById(R.id.teamAPlusThree).setOnClickListener(clickListener);
        findViewById(R.id.teamAPlusTwo).setOnClickListener(clickListener);
        findViewById(R.id.teamAPlusOne).setOnClickListener(clickListener);

        findViewById(R.id.teamBPlusSix).setOnClickListener(clickListener);
        findViewById(R.id.teamBPlusThree).setOnClickListener(clickListener);
        findViewById(R.id.teamBPlusTwo).setOnClickListener(clickListener);
        findViewById(R.id.teamBPlusOne).setOnClickListener(clickListener);

        findViewById(R.id.teamAPlusSix).setOnLongClickListener(longListener);
        findViewById(R.id.teamAPlusThree).setOnLongClickListener(longListener);
        findViewById(R.id.teamAPlusTwo).setOnLongClickListener(longListener);
        findViewById(R.id.teamAPlusOne).setOnLongClickListener(longListener);
                findViewById(R.id.teamBPlusSix).setOnLongClickListener(longListener);
        findViewById(R.id.teamBPlusThree).setOnLongClickListener(longListener);
        findViewById(R.id.teamBPlusTwo).setOnLongClickListener(longListener);
        findViewById(R.id.teamBPlusOne).setOnLongClickListener(longListener);
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
