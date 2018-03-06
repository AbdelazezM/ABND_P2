package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int scoreFighterOne = 0;
    int scoreFighterTwo = 0;
    int roundCounter = 0;
    int lastRound = 12;
    String winnerIs = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Increase the score 10-9 for fighter number one.
     */
    public void closeRoundF1(View v) {
        EditText boxerAName = findViewById(R.id.fighter_one_name);
        String fighterOne = boxerAName.getText().toString();
        EditText boxerBName = findViewById(R.id.fighter_two_name);
        String fighterTwo = boxerBName.getText().toString();
        if (roundCounter < 12)
            scoreFighterOne = scoreFighterOne + 10;

        if (roundCounter < 12)
            scoreFighterTwo = scoreFighterTwo + 9;

        if (roundCounter > -1)
            roundCounter = roundCounter + 1;

        displayForFighterOne(scoreFighterOne);
        displayForFighterTwo(scoreFighterTwo);
        displayNumberOfRounds(roundCounter);
        if (roundCounter > 12)
            displayNumberOfRounds(lastRound);

        if (roundCounter > 12) {
            Toast.makeText(this, "Maximum Number of Rounds", Toast.LENGTH_SHORT).show();
        }

        if (scoreFighterOne > scoreFighterTwo)
            winnerIs = "Fighter # 1 " + fighterOne + " Is The Winner";
        if (scoreFighterOne < scoreFighterTwo)
            winnerIs = "Fighter # 2 " + fighterTwo + " Is The Winner";
        if (scoreFighterOne == scoreFighterTwo)
            winnerIs = "Match Ended In A Draw";
        if (roundCounter == 12) {
            Toast.makeText(this, winnerIs, Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Increase the score 10-8 for fighter number one.
     */
    public void clearWinnerF1(View v) {
        EditText boxerAName = findViewById(R.id.fighter_one_name);
        String fighterOne = boxerAName.getText().toString();
        EditText boxerBName = findViewById(R.id.fighter_two_name);
        String fighterTwo = boxerBName.getText().toString();
        if (roundCounter < 12)
            scoreFighterOne = scoreFighterOne + 10;

        if (roundCounter < 12)
            scoreFighterTwo = scoreFighterTwo + 8;

        if (roundCounter > -1)
            roundCounter = roundCounter + 1;

        displayForFighterOne(scoreFighterOne);
        displayForFighterTwo(scoreFighterTwo);
        displayNumberOfRounds(roundCounter);
        if (roundCounter > 12)
            displayNumberOfRounds(lastRound);

        if (roundCounter > 12) {
            Toast.makeText(this, "Maximum Number of Rounds", Toast.LENGTH_SHORT).show();
        }

        if (scoreFighterOne > scoreFighterTwo)
            winnerIs = "Fighter # 1 " + fighterOne + " Is The Winner";
        if (scoreFighterOne < scoreFighterTwo)
            winnerIs = "Fighter # 2 " + fighterTwo + " Is The Winner";
        if (scoreFighterOne == scoreFighterTwo)
            winnerIs = "Match Ended In A Draw";
        if (roundCounter == 12) {
            Toast.makeText(this, winnerIs, Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Increase the score 10-7 for fighter number one.
     */
    public void totalDominanceF1(View v) {
        EditText boxerAName = findViewById(R.id.fighter_one_name);
        String fighterOne = boxerAName.getText().toString();
        EditText boxerBName = findViewById(R.id.fighter_two_name);
        String fighterTwo = boxerBName.getText().toString();
        if (roundCounter < 12)
            scoreFighterOne = scoreFighterOne + 10;

        if (roundCounter < 12)
            scoreFighterTwo = scoreFighterTwo + 7;

        if (roundCounter > -1)
            roundCounter = roundCounter + 1;

        displayForFighterOne(scoreFighterOne);
        displayForFighterTwo(scoreFighterTwo);
        displayNumberOfRounds(roundCounter);
        if (roundCounter > 12)
            displayNumberOfRounds(lastRound);

        if (roundCounter > 12) {
            Toast.makeText(this, "Maximum Number of Rounds", Toast.LENGTH_SHORT).show();
        }

        if (scoreFighterOne > scoreFighterTwo)
            winnerIs = "Fighter # 1 " + fighterOne + " Is The Winner";
        if (scoreFighterOne < scoreFighterTwo)
            winnerIs = "Fighter # 2 " + fighterTwo + " Is The Winner";
        if (scoreFighterOne == scoreFighterTwo)
            winnerIs = "Match Ended In A Draw";
        if (roundCounter == 12) {
            Toast.makeText(this, winnerIs, Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Increase the score 10-6 for fighter number one.
     */
    public void overMatchedF1(View v) {
        EditText boxerAName = findViewById(R.id.fighter_one_name);
        String fighterOne = boxerAName.getText().toString();
        EditText boxerBName = findViewById(R.id.fighter_two_name);
        String fighterTwo = boxerBName.getText().toString();
        if (roundCounter < 12)
            scoreFighterOne = scoreFighterOne + 10;

        if (roundCounter < 12)
            scoreFighterTwo = scoreFighterTwo + 6;

        if (roundCounter > -1)
            roundCounter = roundCounter + 1;

        displayForFighterOne(scoreFighterOne);
        displayForFighterTwo(scoreFighterTwo);
        displayNumberOfRounds(roundCounter);
        if (roundCounter > 12)
            displayNumberOfRounds(lastRound);

        if (roundCounter > 12) {
            Toast.makeText(this, "Maximum Number of Rounds", Toast.LENGTH_SHORT).show();
        }

        if (scoreFighterOne > scoreFighterTwo)
            winnerIs = "Fighter # 1 " + fighterOne + " Is The Winner";
        if (scoreFighterOne < scoreFighterTwo)
            winnerIs = "Fighter # 2 " + fighterTwo + " Is The Winner";
        if (scoreFighterOne == scoreFighterTwo)
            winnerIs = "Match Ended In A Draw";
        if (roundCounter == 12) {
            Toast.makeText(this, winnerIs, Toast.LENGTH_SHORT).show();
        }

    }


    /**
     * Increase the score 10-9 for fighter number two.
     */
    public void closeRoundF2(View v) {
        EditText boxerAName = findViewById(R.id.fighter_one_name);
        String fighterOne = boxerAName.getText().toString();
        EditText boxerBName = findViewById(R.id.fighter_two_name);
        String fighterTwo = boxerBName.getText().toString();
        if (roundCounter < 12)
            scoreFighterOne = scoreFighterOne + 9;

        if (roundCounter < 12)
            scoreFighterTwo = scoreFighterTwo + 10;

        if (roundCounter > -1)
            roundCounter = roundCounter + 1;

        displayForFighterOne(scoreFighterOne);
        displayForFighterTwo(scoreFighterTwo);
        displayNumberOfRounds(roundCounter);
        if (roundCounter > 12)
            displayNumberOfRounds(lastRound);

        if (roundCounter > 12) {
            Toast.makeText(this, "Maximum Number of Rounds", Toast.LENGTH_SHORT).show();
        }

        if (scoreFighterOne > scoreFighterTwo)
            winnerIs = "Fighter # 1 " + fighterOne + " Is The Winner";
        if (scoreFighterOne < scoreFighterTwo)
            winnerIs = "Fighter # 2 " + fighterTwo + " Is The Winner";
        if (scoreFighterOne == scoreFighterTwo)
            winnerIs = "Match Ended In A Draw";
        if (roundCounter == 12) {
            Toast.makeText(this, winnerIs, Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Increase the score 10-8 for fighter number two.
     */
    public void clearWinnerF2(View v) {
        EditText boxerAName = findViewById(R.id.fighter_one_name);
        String fighterOne = boxerAName.getText().toString();
        EditText boxerBName = findViewById(R.id.fighter_two_name);
        String fighterTwo = boxerBName.getText().toString();
        if (roundCounter < 12)
            scoreFighterOne = scoreFighterOne + 8;

        if (roundCounter < 12)
            scoreFighterTwo = scoreFighterTwo + 10;

        if (roundCounter > -1)
            roundCounter = roundCounter + 1;

        displayForFighterOne(scoreFighterOne);
        displayForFighterTwo(scoreFighterTwo);
        displayNumberOfRounds(roundCounter);
        if (roundCounter > 12)
            displayNumberOfRounds(lastRound);

        if (roundCounter > 12) {
            Toast.makeText(this, "Maximum Number of Rounds", Toast.LENGTH_SHORT).show();
        }

        if (scoreFighterOne > scoreFighterTwo)
            winnerIs = "Fighter # 1 " + fighterOne + " Is The Winner";
        if (scoreFighterOne < scoreFighterTwo)
            winnerIs = "Fighter # 2 " + fighterTwo + " Is The Winner";
        if (scoreFighterOne == scoreFighterTwo)
            winnerIs = "Match Ended In A Draw";
        if (roundCounter == 12) {
            Toast.makeText(this, winnerIs, Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Increase the score 10-7 for fighter number two.
     */
    public void totalDominanceF2(View v) {
        EditText boxerAName = findViewById(R.id.fighter_one_name);
        String fighterOne = boxerAName.getText().toString();
        EditText boxerBName = findViewById(R.id.fighter_two_name);
        String fighterTwo = boxerBName.getText().toString();
        if (roundCounter < 12)
            scoreFighterOne = scoreFighterOne + 7;

        if (roundCounter < 12)
            scoreFighterTwo = scoreFighterTwo + 10;

        if (roundCounter > -1)
            roundCounter = roundCounter + 1;

        displayForFighterOne(scoreFighterOne);
        displayForFighterTwo(scoreFighterTwo);
        displayNumberOfRounds(roundCounter);
        if (roundCounter > 12)
            displayNumberOfRounds(lastRound);

        if (roundCounter > 12) {
            Toast.makeText(this, "Maximum Number of Rounds", Toast.LENGTH_SHORT).show();
        }

        if (scoreFighterOne > scoreFighterTwo)
            winnerIs = "Fighter # 1 " + fighterOne + " Is The Winner";
        if (scoreFighterOne < scoreFighterTwo)
            winnerIs = "Fighter # 2 " + fighterTwo + " Is The Winner";
        if (scoreFighterOne == scoreFighterTwo)
            winnerIs = "Match Ended In A Draw";
        if (roundCounter == 12) {
            Toast.makeText(this, winnerIs, Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Increase the score 10-6 for fighter number two.
     */
    public void overMatchedF2(View v) {
        EditText boxerAName = findViewById(R.id.fighter_one_name);
        String fighterOne = boxerAName.getText().toString();
        EditText boxerBName = findViewById(R.id.fighter_two_name);
        String fighterTwo = boxerBName.getText().toString();
        if (roundCounter < 12)
            scoreFighterOne = scoreFighterOne + 6;

        if (roundCounter < 12)
            scoreFighterTwo = scoreFighterTwo + 10;

        if (roundCounter > -1)
            roundCounter = roundCounter + 1;

        displayForFighterOne(scoreFighterOne);
        displayForFighterTwo(scoreFighterTwo);
        displayNumberOfRounds(roundCounter);
        if (roundCounter > 12)
            displayNumberOfRounds(lastRound);

        if (roundCounter > 12) {
            Toast.makeText(this, "Maximum Number of Rounds", Toast.LENGTH_SHORT).show();
        }

        if (scoreFighterOne > scoreFighterTwo)
            winnerIs = "Fighter # 1 " + fighterOne + " Is The Winner";
        if (scoreFighterOne < scoreFighterTwo)
            winnerIs = "Fighter # 2 " + fighterTwo + " Is The Winner";
        if (scoreFighterOne == scoreFighterTwo)
            winnerIs = "Match Ended In A Draw";
        if (roundCounter == 12) {
            Toast.makeText(this, winnerIs, Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Reset score.
     */
    public void reset(View v) {
        scoreFighterOne = 0;
        scoreFighterTwo = 0;
        roundCounter = 0;
        displayForFighterOne(scoreFighterOne);
        displayForFighterTwo(scoreFighterTwo);
        displayNumberOfRounds(roundCounter);
    }

    /**
     * Displays the given score for Fighter # 1.
     */
    public void displayForFighterOne(int score) {
        TextView scoreView = findViewById(R.id.fighter_one_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Fighter # 2.
     */
    public void displayForFighterTwo(int score) {
        TextView scoreView = findViewById(R.id.fighter_two_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays number of rounds.
     */
    public void displayNumberOfRounds(int rounds) {
        TextView roundsNumber = findViewById(R.id.round);
        roundsNumber.setText(String.valueOf(rounds));

    }


}
