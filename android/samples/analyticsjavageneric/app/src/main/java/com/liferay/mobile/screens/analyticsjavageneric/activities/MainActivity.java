package com.liferay.mobile.screens.analyticsjavageneric.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.liferay.mobile.screens.analyticsjavageneric.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOne = findViewById(R.id.button_one);
        Button buttonTwo = findViewById(R.id.button_two);
        Button buttonThree = findViewById(R.id.button_three);

        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        long id = view.getId();

        if (id == R.id.button_one) {
            startActivity(new Intent(this, ActivityOne.class));
        } else if (id == R.id.button_two) {
            startActivity(new Intent(this, ActivityTwo.class));
        } else {
            startActivity(new Intent(this, ActivityThree.class));
        }
    }
}
