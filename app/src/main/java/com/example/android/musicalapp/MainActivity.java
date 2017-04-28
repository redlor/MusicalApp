package com.example.android.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Artists category
        CardView artists = (CardView) findViewById(R.id.artistsCard);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });
        // Set click listeners for the other Categories
        CardView playlists = (CardView) findViewById(R.id.playlistsCard);
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

        CardView recents = (CardView) findViewById(R.id.recentCard);
        recents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentIntent = new Intent(MainActivity.this, RecentActivity.class);
                startActivity(recentIntent);
            }
        });

        CardView buyMusic = (CardView) findViewById(R.id.buyMusicCard);
        buyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyMusicIntent = new Intent(MainActivity.this, BuyMusicActivity.class);
                startActivity(buyMusicIntent);
            }
        });

        CardView nowPlaying = (CardView) findViewById(R.id.nowplayingCard);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}

