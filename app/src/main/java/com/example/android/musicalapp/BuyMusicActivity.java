package com.example.android.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class BuyMusicActivity extends AppCompatActivity {

    TextView searchedArtist;
    EditText searchEditText;
    String artistSearched;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_music);

        //Set the soft keyboard hidden when the activity is launched
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        Button mainMenuButton = (Button) findViewById(R.id.mainMenuButton);
        mainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenuIntent = new Intent(BuyMusicActivity.this, MainActivity.class);
                startActivity(mainMenuIntent);
            }
        });
        Button artistsButton = (Button) findViewById(R.id.artistsButton);
        artistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(BuyMusicActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });
        searchedArtist = (TextView) findViewById(R.id.wantedArtist);
        searchEditText = (EditText) findViewById(R.id.searchEditable);
        searchedArtist.setVisibility(View.GONE);
        ImageButton searchArtist = (ImageButton) findViewById(R.id.searchButton);
        searchArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchedArtist.setVisibility(View.VISIBLE);
                artistSearched = searchEditText.getText().toString();
                searchedArtist.setText(artistSearched);
            }
        });
    }
}
