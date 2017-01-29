package com.example.myandroidlibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Peter Stone on 28/01/2017.
 */

public class ALJoke extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.al_joke);
        Bundle extras = getIntent().getExtras();
        String currentJoke = extras.getString("Jokes");
        TextView jokeText = (TextView) findViewById(R.id.joke_textView);
        jokeText.setText(currentJoke);

    }
}
