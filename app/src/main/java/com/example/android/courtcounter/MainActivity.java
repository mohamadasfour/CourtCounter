package com.example.android.courtcounter;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    static final String STATE_SCORETEAMA = "scoreBostonCeltics";
    static final String STATE_SCORETEAMB = "scoreChicagoBulls";
    int scoreBostonCeltics = 0;
    int scoreChicagoBulls = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * Displays the given score for Boston Celtics.
     */
    public void displayForBostonCeltics(int score) {
        TextView scoreView =  findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForBostonCeltics(View v) {
        scoreBostonCeltics = scoreBostonCeltics + 3;
        displayForBostonCeltics(scoreBostonCeltics);
    }

    public void addTwoForBostonCeltics(View v) {
        scoreBostonCeltics = scoreBostonCeltics + 2;
        displayForBostonCeltics(scoreBostonCeltics);
    }

    public void addOneForBostonCeltics(View v) {
        scoreBostonCeltics = scoreBostonCeltics + 1;
        displayForBostonCeltics(scoreBostonCeltics);
    }
    /**
     * Displays the given score for Chicagoe Bulls.
     */
    public void displayForChicagoBulls(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForChicagoBulls(View v) {
        scoreChicagoBulls = scoreChicagoBulls + 3;
        displayForChicagoBulls(scoreChicagoBulls);
    }

    public void addTwoForChicagoBulls(View v) {
        scoreChicagoBulls = scoreChicagoBulls+ 2;
        displayForChicagoBulls(scoreChicagoBulls);
    }

    public void addOneForChicagoBulls(View v) {
        scoreChicagoBulls = scoreChicagoBulls + 1;
        displayForChicagoBulls(scoreChicagoBulls);
    }

    public void isWinner(View view) {

        if (scoreBostonCeltics > scoreChicagoBulls) {
            Toast.makeText(this, "Boston Celtics wins", Toast.LENGTH_SHORT).show();

        } else if (scoreChicagoBulls > scoreBostonCeltics) {
            Toast.makeText(this, "Chicago Bulls wins", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Equals", Toast.LENGTH_SHORT).show();

        }
    }
    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreBostonCeltics = 0;
        scoreChicagoBulls = 0;
        displayForBostonCeltics(scoreBostonCeltics);
        displayForChicagoBulls(scoreChicagoBulls);
    }
}
