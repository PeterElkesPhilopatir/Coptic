package com.example.peter.coptic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment implements AdapterView.OnItemClickListener {

    View rootView;
    List<Integer> images;
    List<Letter> letters;
    GridView gridView;
    Adapter mAdapter;
    Letter selectedLetter;

    public MainFragment() {
        // Required empty public constructor
    }

    public interface Callback {
        public void OnItemSelected(Letter position);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        gridView = (GridView) rootView.findViewById(R.id.coptic_grid);

        gridView.setOnItemClickListener(this);
        setHasOptionsMenu(true);
        return rootView;
    }

    @Override
    public void onStart() {
        letters = new ArrayList<>();
        defineLetters();
        loadImages();
        super.onStart();
    }

    public void loadImages() {

        images = new ArrayList<>();

        for (int i = 0; i < letters.size(); i++) {
            images.add(letters.get(i).getImage());
        }
        Log.d("letters", "" + letters);

        Log.d("Images", "" + images);

        Log.d("sizeOfImages", "" + images.size());
        mAdapter = new Adapter(getActivity(), images);
        gridView.setAdapter(mAdapter);
    }

    public void defineLetters() {
        Letter letter = new Letter();
        letter.setName(getString(R.string.alfa));
        letter.setImage(R.mipmap.alfa);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.beta));
        letter.setImage(R.mipmap.beta);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.gamma));
        letter.setImage(R.mipmap.gamma);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.delta));
        letter.setImage(R.mipmap.delta);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.e));
        letter.setImage(R.mipmap.e);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.so));
        letter.setImage(R.mipmap.so);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.zeta));
        letter.setImage(R.mipmap.zeta);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.eta));
        letter.setImage(R.mipmap.eta);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.theta));
        letter.setImage(R.mipmap.theta);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.iota));
        letter.setImage(R.mipmap.iota);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.kappa));
        letter.setImage(R.mipmap.kappa);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.lavla));
        letter.setImage(R.mipmap.lavla);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.mei));
        letter.setImage(R.mipmap.mei);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.nei));
        letter.setImage(R.mipmap.nei);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.exi));
        letter.setImage(R.mipmap.exi);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.omekron));
        letter.setImage(R.mipmap.omekron);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.pe));
        letter.setImage(R.mipmap.pe);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.ro));
        letter.setImage(R.mipmap.ro);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.cima));
        letter.setImage(R.mipmap.cema);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.tav));
        letter.setImage(R.mipmap.tav);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.epslon));
        letter.setImage(R.mipmap.epslon);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.fi));
        letter.setImage(R.mipmap.fe);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.ki));
        letter.setImage(R.mipmap.ki);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.epsi));
        letter.setImage(R.mipmap.epsi);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.omega));
        letter.setImage(R.mipmap.omega);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.shai));
        letter.setImage(R.mipmap.shai);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.fai));
        letter.setImage(R.mipmap.fai);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.khai));
        letter.setImage(R.mipmap.khai);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.hory));
        letter.setImage(R.mipmap.hori);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.janja));
        letter.setImage(R.mipmap.janja);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.tchema));
        letter.setImage(R.mipmap.tchema);
        letters.add(letter);

        letter = new Letter();
        letter.setName(getString(R.string.ti));
        letter.setImage(R.mipmap.ti);
        letters.add(letter);

        Log.d("sizeOfLetters", "" + letters.size());
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        selectedLetter = letters.get(position);
        CustomToast(selectedLetter.getName());
//        showToast("You clicked on " + selectedLetter.getName());
        ((Callback) getActivity()).OnItemSelected(selectedLetter);
    }

    // Because iam lazy to write this line :D
    public void showToast(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }

    @SuppressLint("SetTextI18n")
    public void CustomToast(String msg) {
        Toast toast = new Toast(getActivity());
        TextView textView = new TextView(getActivity());
        textView.setText(msg);

        setFont(textView, "BArabics_0.ttf");

        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(textView);
        toast.show();
    }

    public void setFont(TextView textView, String fontname) {
        String fontPath = "fonts/" + fontname;
        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), fontPath);
        textView.setTypeface(tf);
    }


}

