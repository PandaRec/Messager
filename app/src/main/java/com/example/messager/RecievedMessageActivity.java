package com.example.messager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecievedMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieved_message);
        Intent intent = getIntent();
        String text = intent.getStringExtra("msg");
        TextView textView = findViewById(R.id.textViewRecievedMessage);
        textView.setText(text);
    }
}