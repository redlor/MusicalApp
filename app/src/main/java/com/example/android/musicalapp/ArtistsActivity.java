package com.example.android.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        Button mainMenuButton = (Button) findViewById(R.id.mainMenuButton);
        mainMenuButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent mainMenuIntent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(mainMenuIntent);
            }
        });

        Button buyMusicButton = (Button) findViewById(R.id.buyMusicButton);
        buyMusicButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent buyMusicIntent = new Intent(ArtistsActivity.this, BuyMusicActivity.class);
                startActivity(buyMusicIntent);
            }
        });
    }
}
