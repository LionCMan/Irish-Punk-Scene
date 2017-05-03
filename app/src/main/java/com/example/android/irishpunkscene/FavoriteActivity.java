package com.example.android.irishpunkscene;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        // Find the ViewGroup that shows the "Recent" category
        ImageView recent = (ImageView) findViewById(R.id.recentTV);
        // Set a click listener on that View
        recent.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "Recent" View is clicked on.
            @Override
            public void onClick(View view) {
                Intent recentIntent = new Intent(FavoriteActivity.this, RecentActivity.class);
                startActivity(recentIntent);
            }
        });

        // Find the ViewGroup that shows the "Random" category
        ImageView random = (ImageView) findViewById(R.id.randomTV);
        // Set a click listener on that View
        random.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "Random" View is clicked on.
            @Override
            public void onClick(View view) {
                Intent randomIntent = new Intent(FavoriteActivity.this, RandomActivity.class);
                startActivity(randomIntent);
            }
        });

        // Find the ViewGroup that shows the "Bands" category
        ImageView bands = (ImageView) findViewById(R.id.bandsTV);
        // Set a click listener on that View
        bands.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "Bands" View is clicked on.
            @Override
            public void onClick(View view) {
                Intent bandsIntent = new Intent(FavoriteActivity.this, BandsActivity.class);
                startActivity(bandsIntent);
            }
        });

        // Find the ViewGroup that shows the "Albums" category
        ImageView albums = (ImageView) findViewById(R.id.albumsTV);
        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "Albums" View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(FavoriteActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });
    }
}
