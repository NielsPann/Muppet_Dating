package com.example.niels.muppet_dating;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    public int ratingAdress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void BeakerOnClick(View view) {
        // initiate intent
        Intent GoToProfile = new Intent(this, profile.class);
        // initiate bundle and fill it with image adress
        Bundle bundle = new Bundle();
        bundle.putInt("image", R.drawable.beaker);
        // get current rating and pass it in the bundle
        RatingBar ratingBar = (RatingBar)findViewById(R.id.ratingBarBeaker);
        float rating = ratingBar.getRating();
        bundle.putFloat("rating", rating);
        // pass string text with intent
        GoToProfile.putExtra("muppetName", "Mee mee meee meeep");
        // pass the bundle with intent
        GoToProfile.putExtras(bundle);
        // start intent activity with request code, expecting a float rating back
        startActivityForResult(GoToProfile, 2);
        // set the current adress of int ratingAdress to current profile so it can be updated
        ratingAdress = R.id.ratingBarBeaker;
    }

    public void GonzoOnClick(View view) {
        // initiate intent
        Intent GoToProfile = new Intent(this, profile.class);
        // initiate bundle and fill it with image adress
        Bundle bundle = new Bundle();
        bundle.putInt("image", R.drawable.gonzo);
        RatingBar ratingBar = (RatingBar)findViewById(R.id.ratingBarGonzo);
        float rating = ratingBar.getRating();
        bundle.putFloat("rating", rating);
        // pass string text with intent
        GoToProfile.putExtra("muppetName", "Hello I am the great Gonzo!");
        // pass the bundle with intent
        GoToProfile.putExtras(bundle);
        // start intent activity with request code, expecting a float rating back
        startActivityForResult(GoToProfile, 2);
        // set the current adress of int ratingAdress to current profile so it can be updated
        ratingAdress = R.id.ratingBarGonzo;
    }

    public void KermitOnClick(View view) {
        // initiate intent
        Intent GoToProfile = new Intent(this, profile.class);
        // initiate bundle and fill it with image adress
        Bundle bundle = new Bundle();
        bundle.putInt("image", R.drawable.kermit);
        // get current rating and pass it in the bundle
        RatingBar ratingBar = (RatingBar)findViewById(R.id.ratingBarKermit);
        float rating = ratingBar.getRating();
        bundle.putFloat("rating", rating);
        // pass string text with intent
        GoToProfile.putExtra("muppetName", "My name is Kermit a single frog looking " +
                "for nice stuffed animal date");
        // pass the bundle with intent
        GoToProfile.putExtras(bundle);
        // start intent activity with request code, expecting a float rating back
        startActivityForResult(GoToProfile, 2);
        // set the current adress of int ratingAdress to current profile so it can be updated
        ratingAdress = R.id.ratingBarKermit;
    }

    public void PepeOnClick(View view) {
        // initiate intent
        Intent GoToProfile = new Intent(this, profile.class);
        // initiate bundle and fill it with image adress
        Bundle bundle = new Bundle();
        bundle.putInt("image", R.drawable.pepe);
        // get current rating and pass it in the bundle
        RatingBar ratingBar = (RatingBar)findViewById(R.id.ratingBarPepe);
        float rating = ratingBar.getRating();
        bundle.putFloat("rating", rating);
        // pass string text with intent
        GoToProfile.putExtra("muppetName", "I am Pepino Rodrigo Serrano Gonzales from spain!");
        // pass the bundle with intent
        GoToProfile.putExtras(bundle);
        // start intent activity with request code, expecting a float rating back
        startActivityForResult(GoToProfile, 2);
        // set the current adress of int ratingAdress to current profile so it can be updated
        ratingAdress = R.id.ratingBarPepe;
    }

    public void MarkOnClick(View view) {
        // initiate intent
        Intent GoToProfile = new Intent(this, profile.class);
        // initiate bundle and fill it with image adress
        Bundle bundle = new Bundle();
        bundle.putInt("image", R.drawable.mark);
        // get current rating and pass it in the bundle
        RatingBar ratingBar = (RatingBar)findViewById(R.id.ratingBarMark);
        float rating = ratingBar.getRating();
        bundle.putFloat("rating", rating);
        // pass string text with intent
        GoToProfile.putExtra("muppetName", "My name is Mark Rutte looking for a date with " +
                "fellow muppet");
        // pass the bundle with intent
        GoToProfile.putExtras(bundle);
        // start intent activity with request code, expecting a float rating back
        startActivityForResult(GoToProfile, 2);
        // set the current adress of int ratingAdress to current profile so it can be updated
        ratingAdress = R.id.ratingBarMark;
    }

    public void PiggyOnClick(View view) {
        // initiate intent
        Intent GoToProfile = new Intent(this, profile.class);
        // initiate bundle and fill it with image adress
        Bundle bundle = new Bundle();
        bundle.putInt("image", R.drawable.piggy);
        // get current rating and pass it in the bundle
        RatingBar ratingBar = (RatingBar)findViewById(R.id.ratingBarPiggy);
        float rating = ratingBar.getRating();
        bundle.putFloat("rating", rating);
        // pass string text with intent
        GoToProfile.putExtra("muppetName", "My name is Miss Piggy looking for a date with a date" +
                "with a fellow muppet");
        // pass the bundle with intent
        GoToProfile.putExtras(bundle);
        // start intent activity with request code, expecting a float rating back
        startActivityForResult(GoToProfile, 2);
        // set the current adress of int ratingAdress to current profile so it can be updated
        ratingAdress = R.id.ratingBarPiggy;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // set passed rating from profile activity to the right ratingbar indicator
        // only do this if something is actually is passes (data not null), otherwise app will crash
        if(data != null) {
            RatingBar rating = (RatingBar) findViewById(ratingAdress);
            float starRating = data.getExtras().getFloat("rating");
            rating.setRating(starRating);
        }
    }
}
