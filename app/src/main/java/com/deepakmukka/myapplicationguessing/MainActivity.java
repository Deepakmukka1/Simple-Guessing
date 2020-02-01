package com.deepakmukka.myapplicationguessing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.muddzdev.styleabletoast.StyleableToast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNum;
    public void show(View v){
        StyleableToast.makeText(this,"Hello Deepak",R.style.exampleToast).show();
    }

    public void guessfunc(View view) {
        EditText guess = (EditText) findViewById(R.id.editGuess);
        int gum = Integer.parseInt(guess.getText().toString());
        if (randomNum == gum) {
            Toast.makeText(this, "You are Right!", Toast.LENGTH_SHORT).show();


        } else if (gum > randomNum) {
            Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            Random rand = new Random();
            randomNum = rand.nextInt(20) + 1;

        }

        }






