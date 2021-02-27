package dev.mobisen.flixster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import org.parceler.Parcels;

import dev.mobisen.flixster.models.Movie;

public class DetailActivity extends AppCompatActivity {

    TextView tvTitleDetail;
    TextView tvOverviewDetail;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTitleDetail = findViewById(R.id.tvTitleDetail);
        tvOverviewDetail = findViewById(R.id.tvOverviewDetail);
        ratingBar = findViewById(R.id.ratingBar);

        Movie movie = Parcels.unwrap(getIntent().getParcelableExtra("movie"));
        tvTitleDetail.setText(movie.getTitle());
        tvOverviewDetail.setText(movie.getOverview());
        ratingBar.setRating((float) movie.getRating());

    }
}