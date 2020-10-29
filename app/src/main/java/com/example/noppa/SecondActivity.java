package com.example.noppa;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class SecondActivity extends AppCompatActivity {

    private Button Throw;
    private ImageView Noppa1;
    public static final Random RANDOM = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Throw = (Button) findViewById(R.id.Throw);
        Noppa1 = (ImageView) findViewById(R.id.noppa1);

        Throw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = randomDiceValue();

                int res = getResources().getIdentifier("noppa_" + value,"drawable", "com.example.noppa");
                Noppa1.setImageResource(res);

            }
        });

    }

    public static int randomDiceValue(){
        return RANDOM.nextInt(6);

    }
}