package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private String[] movie = {"bad Boys for life","The old guard"};
private String[] movieYear = {"2001","2002"};

private ArrayList<Movie> movielist;

private ListView lv_movie;
private MovieAdapter movieAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_movie = findViewById(R.id.lv_movie);
        movielist = new ArrayList<>();

        for (int i = 0; i < (movie.length) ; i++){
        Movie mov = new Movie(movie[i],movieYear[i]);
        movielist.add(mov);
        }
        movieAdapter = new MovieAdapter(this,R.layout.item_row,movielist);
        lv_movie.setAdapter(movieAdapter);
    }
}