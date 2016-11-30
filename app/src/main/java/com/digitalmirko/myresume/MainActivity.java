package com.digitalmirko.myresume;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Buttons used
    Button summaryBtn;
    Button experienceBtn;
    Button callBtn;
    Button emailBtn;
    Button webBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Summary Button (Summary)
        summaryBtn = (Button) findViewById(R.id.summaryBtn);
        summaryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToTheOtherActivity = new Intent(getApplicationContext(),SummaryActivity.class);
                startActivity(goToTheOtherActivity);
            }
        });

        // Experience Button (Experience)
        experienceBtn = (Button) findViewById(R.id.experienceBtn);
        experienceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToTheOtherActivity = new Intent(getApplicationContext(),ExperienceActivity.class);
                startActivity(goToTheOtherActivity);
            }
        });

        // Phone Call Button (Call Mirko)
        callBtn = (Button) findViewById(R.id.callBtn);
        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri myPhoneNumber = Uri.parse("tel:18001234567");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, myPhoneNumber);
                startActivity(callIntent);
            }
        });

        // Send Email Button (Email Mirko)
        emailBtn = (Button) findViewById(R.id.emailBtn);
        emailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"mirko@digitalmirko.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Mirko's Resume");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "I really like your resume!. Let's talk.");
                startActivity(emailIntent);
            }
        });

        // Goto Web URL Button (Samples Website)
        webBtn = (Button) findViewById(R.id.webBtn);
        webBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                webIntent.addCategory(Intent.CATEGORY_BROWSABLE);
                webIntent.setData(Uri.parse("http://www.digitalmirko.com"));
                startActivity(webIntent);
            }
        });
    }
}
