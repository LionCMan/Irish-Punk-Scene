package com.example.android.irishpunkscene;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Find the ViewGroup that shows the "Recent" category
        ImageView recent = (ImageView) findViewById(R.id.recentTV);
        // Set a click listener on that View
        recent.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "Recent" View is clicked on.
            @Override
            public void onClick(View view) {
                Intent recentIntent = new Intent(AlbumsActivity.this, RecentActivity.class);
                startActivity(recentIntent);
            }
        });

        // Find the ViewGroup that shows the "Favorite" category
        ImageView favorite = (ImageView) findViewById(R.id.favoriteTV);
        // Set a click listener on that View
        favorite.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "Favorite" View is clicked on.
            @Override
            public void onClick(View view) {
                Intent favoriteIntent = new Intent(AlbumsActivity.this, FavoriteActivity.class);
                startActivity(favoriteIntent);
            }
        });

        // Find the ViewGroup that shows the "Random" category
        ImageView random = (ImageView) findViewById(R.id.randomTV);
        // Set a click listener on that View
        random.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "Random" View is clicked on.
            @Override
            public void onClick(View view) {
                Intent randomIntent = new Intent(AlbumsActivity.this, RandomActivity.class);
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
                Intent bandsIntent = new Intent(AlbumsActivity.this, BandsActivity.class);
                startActivity(bandsIntent);
            }
        });
    }
}
