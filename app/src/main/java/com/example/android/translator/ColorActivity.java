package com.example.android.translator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("Black","Noir",R.drawable.color_black));
        colors.add(new Word("Blue","Bleu",R.drawable.color_brown));
        colors.add(new Word("Brown","Brun",R.drawable.color_brown));
        colors.add(new Word("Gray","Gris",R.drawable.color_gray));
        colors.add(new Word("Green","Vert",R.drawable.color_green));
        colors.add(new Word("Orange","Orange",R.drawable.color_gray));
        colors.add(new Word("Pink","Rose",R.drawable.color_gray));
        colors.add(new Word("Purple","Pourpre",R.drawable.color_gray));
        colors.add(new Word("Red","Rouge",R.drawable.color_gray));
        colors.add(new Word("Sky Blue","Bleu Ciel",R.drawable.color_gray));
        colors.add(new Word("Voilet","Voilet",R.drawable.color_gray));
        colors.add(new Word("White","Blanc",R.drawable.color_gray));
        colors.add(new Word("Yellow","Jaune",R.drawable.color_gray));

        WordAdapter adapter = new WordAdapter(this,colors);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
