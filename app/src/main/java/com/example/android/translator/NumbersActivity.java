package com.example.android.translator;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","Un",R.drawable.number_one));
        words.add(new Word("Two","Deux",R.drawable.number_two));
        words.add(new Word("Three","Trois",R.drawable.number_three));
        words.add(new Word("Four","quatre",R.drawable.number_four));
        words.add(new Word("Five","cinq",R.drawable.number_five));
        words.add(new Word("Six","six",R.drawable.number_six));
        words.add(new Word("Seven","Sept",R.drawable.number_seven));
        words.add(new Word("Eight","huit",R.drawable.number_eight));
        words.add(new Word("Nine","neuf",R.drawable.number_nine));
        words.add(new Word("Ten","Dix",R.drawable.number_ten));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mp = MediaPlayer.create(NumbersActivity.this,R.raw.tiger);
                mp.start();
            }
        });
    }
}
