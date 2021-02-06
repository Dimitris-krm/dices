 package com.wdk.dices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

 public class MainActivity extends AppCompatActivity {

     private static final String TAG = "tag";
     ImageView zari1;
    ImageView zari2;
     Random rng = new Random();
     int noumero1;
     int noumero2 =5;
     int noumero3 = noumero1+noumero2;
     TextView apotelesma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zari1 = (ImageView)findViewById(R.id.zari1);
        zari2 = (ImageView)findViewById(R.id.zari2);
         apotelesma = (TextView)findViewById(R.id.apotelesma);

        zari1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = noumero1 + noumero2;
                rollDice();
                rollDice2();
                apotelesma.setText("Dice 1:"+" "+noumero1+"\n"+"Dice 2:"+" "+noumero2+"\n"+"Sum :"+String.valueOf(noumero1 + noumero2));
            }
        });

        zari2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = noumero1 + noumero2;
                rollDice();
                rollDice2();
                apotelesma.setText("Dice 1:"+" "+noumero1+"\n"+"Dice 2:"+" "+noumero2+"\n"+"Sum :"+String.valueOf(noumero1 + noumero2));

            }
        });





    }

     public void rollDice() {
        int randomNumber = rng.nextInt(6) + 1;
        switch (randomNumber){
            case 1:
                zari1.setImageResource(R.drawable.dice1);
                noumero1 = 1;
            break;
            case 2:
                zari1.setImageResource(R.drawable.dice2);
                noumero1 = 2;
            break;
            case 3:
                zari1.setImageResource(R.drawable.dice3);
                noumero1 = 3;
            break;
            case 4:
                zari1.setImageResource(R.drawable.dice4);
                noumero1 = 4;
                break;
            case 5:
                zari1.setImageResource(R.drawable.dice5);
                noumero1 = 5;
                break;
            case 6:
                zari1.setImageResource(R.drawable.dice6);
                noumero1 = 6;
                break;

        }
     }

     private void rollDice2() {
         int randomNumber = rng.nextInt(6) + 1;
         switch (randomNumber){
             case 1:
                 zari2.setImageResource(R.drawable.dice1);
                 noumero2 = 1;
                 break;
             case 2:
                 zari2.setImageResource(R.drawable.dice2);
                 noumero2 = 2;
                 break;
             case 3:
                 zari2.setImageResource(R.drawable.dice3);
                 noumero2 = 3;
                 break;
             case 4:
                 zari2.setImageResource(R.drawable.dice4);
                 noumero2 = 4;
                 break;
             case 5:
                 zari2.setImageResource(R.drawable.dice5);
                 noumero2 = 5;
                 break;
             case 6:
                 zari2.setImageResource(R.drawable.dice6);
                 noumero2 = 6 ;
                 break;
         }
     }
 }
