// This is the Main Activity.

package com.example.proofofconcept;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //adds a text view to the application
            TextView homeText = findViewById(R.id.home_text);
        homeText.setText("This is My Exploiting Application");

        /* adds a button and then we have a lambda function which I don't actually
         know the purpose of but it increases the count by 1*/
        Button homeButton = findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                // logs the clicks made by the user
                Log.i("HEXTREE", "The Button has been clicked "+counter+" times.");
                homeText.setText("Clicked: "+counter);

                /* if the count reaches 10, it sends an intent that parses/searches the web for the provided link
                 and opens it on the user's default browser*/
                if (counter==10) {
                    Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                    startActivity(browserIntent);
                }
            }
        });
    }
}