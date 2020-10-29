package com.example.noppa;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class ThirdActivity extends AppCompatActivity {

    private Button Throw;
    private ImageView Noppa1, Noppa2;
    public static final Random RANDOM = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Throw = (Button) findViewById(R.id.Throw);
        Noppa1 = (ImageView) findViewById(R.id.noppa1);
        Noppa2 = (ImageView) findViewById(R.id.noppa2);

        Throw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = randomDiceValue();
                int value2 = randomDiceValue();

                int res1 = getResources().getIdentifier("noppa_" + value1, "drawable", "com.example.noppa");
                int res2 = getResources().getIdentifier("noppa_" + value2, "drawable", "com.example.noppa");
                Noppa1.setImageResource(res1);
                Noppa2.setImageResource(res2);

            }
        });

    }

    public static int randomDiceValue() {
        return RANDOM.nextInt(6) + 1;

    }
}
