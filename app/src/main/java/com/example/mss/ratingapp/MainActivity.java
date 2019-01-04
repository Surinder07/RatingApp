package com.example.mss.ratingapp;

import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView txtView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        txtView = findViewById(R.id.textView);


    }


    public  void submit(View view){

        float ratingValue = ratingBar.getRating();



        if(ratingValue < 2){


            txtView.setText("Rating  :"+ ratingValue+ "\n we wil try better next time");


        }

        else if(ratingValue >= 2 && ratingValue <=3){


            txtView.setText("Rating  :"+ ratingValue+ "\n we are contanly improving");


        }

        else if(ratingValue >= 4 && ratingValue <5){


            txtView.setText("Rating  :"+ ratingValue+ "\n Thank you, we will learn from our mistakes");


        }

        else if(ratingValue == 5){


            txtView.setText("Rating  :"+ ratingValue+ "\n Thank you so much for loving us!");


        }




    }
}
