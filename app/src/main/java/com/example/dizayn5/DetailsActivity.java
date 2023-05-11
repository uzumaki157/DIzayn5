package com.example.dizayn5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgarticle;
    TextView arttext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initViews();
    }

    private void initViews() {
        arttext = findViewById(R.id.arttext);
        imgarticle = findViewById(R.id.imgarticle);
    }
}