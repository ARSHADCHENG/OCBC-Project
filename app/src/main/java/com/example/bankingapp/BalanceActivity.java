package com.example.bankingapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BalanceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);

        TextView balanceTextView = findViewById(R.id.balanceTextView);
        balanceTextView.setText("Your balance is $1000");

        Button transferButton = findViewById(R.id.transferButton);
        transferButton.setOnClickListener(v -> {
            Intent intent = new Intent(BalanceActivity.this, TransferActivity.class);
            startActivity(intent);
        });

        Button logoutButton = findViewById(R.id.logoutButton);
        logoutButton.setOnClickListener(v -> {
            Intent intent = new Intent(BalanceActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}