package com.example.bankingapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TransferActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        EditText amountEditText = findViewById(R.id.amountEditText);
        EditText recipientEditText = findViewById(R.id.recipientEditText);
        Button transferButton = findViewById(R.id.transferButton);

        transferButton.setOnClickListener(v -> {
            String amount = amountEditText.getText().toString();
            String recipient = recipientEditText.getText().toString();

            if (!amount.isEmpty() && !recipient.isEmpty()) {
                Toast.makeText(TransferActivity.this, "Transferred $" + amount + " to " + recipient, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(TransferActivity.this, "Please enter all details", Toast.LENGTH_SHORT).show();
            }
        });
    }
}