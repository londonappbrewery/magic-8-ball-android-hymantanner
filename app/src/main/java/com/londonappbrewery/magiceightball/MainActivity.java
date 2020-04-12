package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ballButton;

        ballButton = findViewById(R.id.askButtonId);

        final ImageView imageView = findViewById(R.id.imageViewId);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        ballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              Log.d("Ball", "Button has been Pressed");

              Random randomNumberGenerator = new Random();

              int number = randomNumberGenerator.nextInt(5);
              Log.d("Ball", "The Random Number is: " + number);

                imageView.setImageResource(ballArray[number]);

            }

                                      }

        );
    }
}