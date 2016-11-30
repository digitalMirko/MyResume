package com.digitalmirko.myresume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button summaryButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        summaryButton = (Button) findViewById(R.id.summaryBtn);
        summaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToTheOtherActivity = new Intent(getApplicationContext(),SummaryActivity.class);
                startActivity(goToTheOtherActivity);
            }
        });
    }
}
