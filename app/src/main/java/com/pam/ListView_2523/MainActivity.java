package com.pam.ListView_2523;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private String[] movie = {"Iron Man,","The Incredible Hulk","Thor"
            ,"Captain America","Iron Man 2","Avengers","Iron Man 3","The Winter Soldiers",
            "The Dark World","Age Of Ultron","Civil War","Homecoming","Black Panther","Thor: Ragnarok",
            "Captain Marvel","Infinity War","Endgame","Far From Home"};
    private ListView lv_movie;
    private ArrayAdapter<String> movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieAdapter = new
                ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,movie);

        lv_movie = findViewById(R.id.lv_movie);
        lv_movie.setAdapter(movieAdapter);
    }
}