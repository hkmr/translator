package com.example.android.translator;

import android.content.Intent;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView numbers =(TextView) findViewById(R.id.category_numbers);
        TextView family =(TextView) findViewById(R.id.category_family);
        TextView colors =(TextView) findViewById(R.id.category_colors);
        TextView phrases =(TextView) findViewById(R.id.category_phrases);
        TextView audio =(TextView) findViewById(R.id.audio_button);

        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,FamiyActivity.class);
                startActivity(numbersIntent);
            }
        });

        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,ColorActivity.class);
                startActivity(numbersIntent);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,PhraseActivity.class);
                startActivity(numbersIntent);
            }
        });

        audio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,AudioActivity.class);
                startActivity(numbersIntent);
            }
        });


    }

}
