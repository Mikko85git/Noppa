package com.example.noppa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goSecond(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        Toast toast = Toast.makeText(getApplicationContext(), "Heität yhtä noppaa", Toast.LENGTH_LONG);
        toast.show();
        startActivity(intent);
}
    public void goThird(View view){
        Intent intent = new Intent(this, ThirdActivity.class);
        Toast toast = Toast.makeText(getApplicationContext(), "Heität kahta noppaa", Toast.LENGTH_LONG);
        toast.show();
        startActivity(intent);
    }
    public void goFourth(View view){
        Intent intent = new Intent(this, FourthActivity.class);
        Toast toast = Toast.makeText(getApplicationContext(), "Keksi jotain tärkeämpää tekemistä!", Toast.LENGTH_LONG);
        toast.show();
        startActivity(intent);
    }

}

