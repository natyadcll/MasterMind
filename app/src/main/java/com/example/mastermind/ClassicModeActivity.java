package com.example.mastermind;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.Random;

import java.util.concurrent.atomic.AtomicInteger;

public class ClassicModeActivity extends AppCompatActivity {

    Button nextAndPlayButton;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_mode);
        AtomicInteger tries = new AtomicInteger();
        AtomicInteger randomNumber = new AtomicInteger();
        this.nextAndPlayButton = (Button)findViewById(R.id.mainButton);
        this.nextAndPlayButton.setOnClickListener((View view) -> {
            int stage = getStage();
            Spinner intervalTextView = findViewById(R.id.intervalSpinner);
            TextView chooseTextView = findViewById(R.id.ChooseTextView);
            TextView guessTextBox = findViewById(R.id.guessTestBox);
            TextView infoTextView  = findViewById(R.id.infoTextView);
            int interval = Integer.parseInt(intervalTextView.getSelectedItem().toString());
            if(stage == 1)
            {
                System.out.println("Stage 1 entered");
                chooseTextView.setText("Guess a number between 0 - " + intervalTextView.getSelectedItem().toString());
                chooseTextView.setVisibility(View.VISIBLE);
                guessTextBox.setVisibility(View.VISIBLE);
                nextAndPlayButton.setText(R.string.play);
                intervalTextView.setEnabled(false);
                infoTextView.setVisibility(View.VISIBLE);
                tries.set(getTotalTries(interval));
                infoTextView.setText("Total tries left: " + tries);
                randomNumber.set(randomNumber(interval));
            }
            else if(stage == 2 && isTextBoxNotEmpty(R.id.guessTestBox) && tries.get() != 1)
            {
                System.out.println("Stage 2 entered");
                int gussednumber;
                gussednumber = Integer.parseInt(guessTextBox.getText().toString());
                System.out.println(gussednumber);
                if(gussednumber < 0 || gussednumber > Integer.parseInt(intervalTextView.getSelectedItem().toString()))
                {
                    guessTextBox.setText("");
                    guessTextBox.setHint(R.string.tryAgain);
                }
                else
                {
                    if(guess(gussednumber, randomNumber.get()))
                    {
                        System.out.println("Won");
                        System.out.println("Starting Winning activity");
                        Intent resultModeActivity = new Intent(this, ClassicModeResultActivity.class);
                        resultModeActivity.putExtra("result","You WON!");
                        startActivity(resultModeActivity);
                        finish();
                    }
                    else
                    {
                        tries.getAndDecrement();
                        System.out.println("Lost");
                        guessTextBox.setText("");
                        guessTextBox.setHint(R.string.wrongSelection);
                        infoTextView.setText("Total tries left: " + (tries));
                    }
                }
            }
            else if(tries.get() == 1)
            {
                System.out.println("Starting Loosing activity");
                Intent resultModeActivity = new Intent(this, ClassicModeResultActivity.class);
                resultModeActivity.putExtra("result","You LOST");
                startActivity(resultModeActivity);
                finish();
            }
        });

    }

    private int getTotalTries(int num) {
        return (num / 10) * 5;
    }

    private int getStage() {
        //System.out.println(((TextView)findViewById(R.id.guessTestBox)).getVisibility() == View.VISIBLE);
        if(((TextView)findViewById(R.id.guessTestBox)).getVisibility() != View.VISIBLE)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }


    public boolean isTextBoxNotEmpty(int textView)
    {
        return !((TextView) findViewById(textView)).getText().toString().isEmpty();
    }


    public boolean guess(int playerGuess, int randomNumber)
    {
        System.out.println("The Correct Guess is: "+ randomNumber);
        return playerGuess == randomNumber;
    }

    private int randomNumber(int interval)
    {
        Random random = new Random();
        int number = random.nextInt(interval + 1);
        System.out.println("The Correct Guess is: "+number);
        return number;
    }
}