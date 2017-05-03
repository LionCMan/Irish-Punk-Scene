package com.example.android.irishpunkscene;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class RecentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent);

        // Find the ViewGroup that shows the "Favorite" category
        ImageView favorite = (ImageView) findViewById(R.id.favoriteTV);
        // Set a click listener on that View
        favorite.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the "Favorite" View is clicked on.
            @Override
            public void onClick(View view) {
                Intent favoriteIntent = new Intent(RecentActivity.this, FavoriteActivity.class);
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
                Intent randomIntent = new Intent(RecentActivity.this, RandomActivity.class);
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
                Intent bandsIntent = new Intent(RecentActivity.this, BandsActivity.class);
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
                Intent albumsIntent = new Intent(RecentActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });
    }
}
