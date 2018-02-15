package com.example.peter.coptic;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsFragment extends Fragment {

    View rootView;
    Intent intent;
    Bundle args;
    String id;
    Letter selectedLetter;

    public DetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);
        this.args = args;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_details, container, false);

        ImageView letterImageView = (ImageView) rootView.findViewById(R.id.letterImageView);
        if (args != null) {
            selectedLetter = new Letter();
            selectedLetter.setName(args.getString(Letter.LETTER_NAME));
            selectedLetter.setImage(Integer.valueOf(args.getString(Letter.LETTER_IMAGE)));
        }
        letterImageView.setImageResource(selectedLetter.getImage());
//        // text view label
        TextView spellTextView = (TextView) rootView.findViewById(R.id.spellTextView);
        setFont(spellTextView,"BArabics_0.ttf");
        return rootView;

    }

    public void setFont(TextView textView, String fontname){
        String fontPath = "fonts/"+fontname;
        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), fontPath);
        textView.setTypeface(tf);
    }

}
