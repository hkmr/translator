package com.example.android.translator;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by harsh on 05/03/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context,0,words );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word wordsList = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView frenchTextView = (TextView) listItemView.findViewById(R.id.french_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        frenchTextView.setText(wordsList.getFrench_word());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(wordsList.getDefault_word());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        if(wordsList.getMimageId() != 0){
            imageView.setImageResource(wordsList.getMimageId());
        }
        else{
            imageView.setVisibility(View.GONE);
        }

//        ImageView soundImage = (ImageView) listItemView.findViewById(R.id.sound_image);
//        soundImage.setImageResource(R.drawable.speaker);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
