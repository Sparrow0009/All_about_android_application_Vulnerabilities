// This is the Secret Shared activity.

package com.example.proofofconcept;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecretActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_secret);

        Intent recievedntent = getIntent();
        String sharedText = recievedntent.getStringExtra(Intent.EXTRA_TEXT);
        if(sharedText != null){
            TextView debugText = findViewById(R.id.debug_text);
            debugText.setText("Shared: " + sharedText);
        }
    }
}