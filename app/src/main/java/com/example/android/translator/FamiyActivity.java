package com.example.android.translator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamiyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> families = new ArrayList<Word>();
        families.add(new Word("Father","père",R.drawable.family_father));
        families.add(new Word("Mother","mère",R.drawable.family_mother));
        families.add(new Word("Son","fils",R.drawable.family_son));
        families.add(new Word("Daughter","fille",R.drawable.family_daughter));
        families.add(new Word("Older Brother","grand frère",R.drawable.family_older_brother));
        families.add(new Word("Younger Brother","frère cadet",R.drawable.family_younger_brother));
        families.add(new Word("Older Sister","soeur aînée",R.drawable.family_older_sister));
        families.add(new Word("Younger Sister","sœur cadette",R.drawable.family_younger_sister));
        families.add(new Word("Grandmother","grand-mère",R.drawable.family_grandmother));
        families.add(new Word("Grandfather","grand-père",R.drawable.family_grandfather));
        families.add(new Word("Uncle","oncle",R.drawable.family_father));
        families.add(new Word("Son-in-law","beau fils",R.drawable.family_older_brother));
        families.add(new Word("Father-in-law","beau-père",R.drawable.family_father));

        WordAdapter adapter = new WordAdapter(this,families);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
