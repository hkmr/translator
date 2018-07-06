package com.example.android.translator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> phrases = new ArrayList<Word>();
        phrases.add(new Word("Hello","Bonjour"));
        phrases.add(new Word("What is your name ?","comment t'appelles-tu ?"));
        phrases.add(new Word("Where are you going ?","où allez-vous ?"));
        phrases.add(new Word("My name is ..","mon nom est .."));
        phrases.add(new Word("How are you feeling ?","comment allez-vous ?"));
        phrases.add(new Word("I am feeling good ?","Je me sens bien ?"));
        phrases.add(new Word("Are you coming ?","viens-tu ?"));
        phrases.add(new Word("Yes,i am coming.","Oui j'arrive."));
        phrases.add(new Word("Let's go","Allons-y"));
        phrases.add(new Word("Come here","venez ici"));


        WordAdapter adapter = new WordAdapter(this, phrases);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
