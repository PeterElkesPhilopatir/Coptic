package com.example.peter.coptic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements MainFragment.Callback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.mainActivity, new MainFragment()).commit();

    }

    @Override
    public void OnItemSelected(Letter position) {

        setTitle(position.getName());
        Bundle bundle = new Bundle();
        bundle.putString(Letter.LETTER_NAME,position.getName());
        bundle.putString(Letter.LETTER_IMAGE, String.valueOf(position.getImage()));
        DetailsFragment detailsFragment=new DetailsFragment();
        detailsFragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().replace(R.id.mainActivity,detailsFragment).commit();

    }
}
