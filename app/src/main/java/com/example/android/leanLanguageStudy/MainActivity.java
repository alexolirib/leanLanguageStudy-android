package com.example.android.leanLanguageStudy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(view -> {
            Intent i = new Intent(this, NumbersActivity.class);
            startActivity(i);
        });
        TextView familyMenbers = (TextView) findViewById(R.id.family);
        familyMenbers.setOnClickListener(view -> {
            Intent i = new Intent(this, FamilyActivity.class);
            startActivity(i);
        });
        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(view -> {
            Intent i = new Intent(this, ColorsActivity.class);
            startActivity(i);
        });
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(view -> {
            Intent i = new Intent(this, PhrasesActivity.class);
            startActivity(i);
        });



    }

//    public void openNumbersList(View view) {
//        Intent i = new Intent(this, NumbersActivity.class);
//        startActivity(i);
//    }
//
//    public void openColorsList(View view) {
//        Intent i = new Intent(this, ColorsActivity.class);
//        startActivity(i);
//    }
//
//    public void openFamilyList(View view) {
//        Intent i = new Intent(this, FamilyActivity.class);
//        startActivity(i);
//    }
//
//    public void openPhrasesList(View view) {
//        Intent i = new Intent(this, PhrasesActivity.class);
//        startActivity(i);
//    }
}
