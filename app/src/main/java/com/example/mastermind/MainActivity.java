package com.example.mastermind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button classicModeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.classicModeButton = (Button) findViewById(R.id.classicModeButton);
        this.classicModeButton.setOnClickListener((View view) -> {
            System.out.println("classic Mode Started!");
            if(checkUserName())
            {
                Intent intent = new Intent(this, ClassicModeActivity.class);
                startActivity(intent);
            }

        });
    }

    private boolean checkUserName()
    {
        return !((TextView) findViewById(R.id.userNameTextBox)).getText().toString().isEmpty();
    }







}