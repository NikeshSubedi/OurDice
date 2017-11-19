package com.example.nasa.ourdice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button roll1, roll2;
    ImageView img1, img2;
    TextView textView;
    final int[] images = {R.mipmap.dice1, R.mipmap.dice2, R.mipmap.dice3, R.mipmap.dice4, R.mipmap.dice5, R.mipmap.dice6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__main);
        roll1 = (Button) findViewById(R.id.button1);
        roll2 = (Button) findViewById(R.id.button2);
        img1 = (ImageView) findViewById(R.id.image1);
        img2 = (ImageView) findViewById(R.id.image2);
        textView = (TextView) findViewById(R.id.tv);
        roll2.setEnabled(false);
                roll1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        roll2.setEnabled(true);
                        Random RandomNumber = new Random();
                        int number1 = RandomNumber.nextInt(6);
                        int number2 = RandomNumber.nextInt(6);
                        img1.setImageResource(images[number1]);
                        img2.setImageResource(images[number2]);
                        roll1.setEnabled(false);
                        if (number1 == number2) {
                            textView.setText("Hurray!!! Player 1 Won");
                        } else {
                            textView.setText("");
                        }

                    }
                });

                roll2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        roll1.setEnabled(true);
                        roll2.setEnabled(false);
                        Random RandomNumber = new Random();
                        int number1 = RandomNumber.nextInt(6);
                        int number2 = RandomNumber.nextInt(6);
                        img1.setImageResource(images[number1]);
                        img2.setImageResource(images[number2]);
                        if (number1 == number2) {
                            textView.setText("Hurray!!! Player 2 Won");
                        } else {
                            textView.setText("");

                        }
                    }
                });

            }}
