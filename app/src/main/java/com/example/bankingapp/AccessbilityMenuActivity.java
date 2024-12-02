package com.example.bankingapp;

import android.os.Bundle;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class AccessibilityMenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessibility_menu);

        Switch highContrastSwitch = findViewById(R.id.highContrastSwitch);
        highContrastSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
        });

        Switch textToSpeechSwitch = findViewById(R.id.textToSpeechSwitch);
        textToSpeechSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // Enable text-to-speech
                // Implement text-to-speech functionality
            } else {
                // Disable text-to-speech
                // Implement disabling text-to-speech functionality
            }
        });
    }
}