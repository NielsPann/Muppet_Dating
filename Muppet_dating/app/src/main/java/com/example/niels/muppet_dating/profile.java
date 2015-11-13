package com.example.niels.muppet_dating;

/**
 * Created by Niels on 9-11-2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


public class profile extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);

        addListenerOnButtonClick();
        Intent activityThatCalled = getIntent();

        // get string text from intent and set it on default text
        String muppetName = activityThatCalled.getExtras().getString("muppetName");
        TextView NameOfMuppet = (TextView) findViewById(R.id.profileMuppetName);
        NameOfMuppet.setText(muppetName);

        // get image adress from intent and set it on the empty image in layout
        ImageView muppetProfilePhoto = (ImageView) findViewById(R.id.profilePhoto);
        Bundle bundle = this.getIntent().getExtras();
        int pic = bundle.getInt("image");
        muppetProfilePhoto.setImageResource(pic);

        // get current rating from intent and set rating bar
        RatingBar ratingBar = (RatingBar)findViewById(R.id.ratingBar);
        float rating = bundle.getFloat("rating");
        ratingBar.setRating(rating);


    }

    private void addListenerOnButtonClick() {
        final RatingBar ratingbar = (RatingBar)findViewById(R.id.ratingBar);
        Button button = (Button)findViewById(R.id.rateButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on click button get given rating and pass it back to main activity
                Intent goBack = getIntent();
                float rating = ratingbar.getRating();
                goBack.putExtra("rating", rating);
                setResult(RESULT_OK, goBack);
                finish();
            }

        });
    }

}
