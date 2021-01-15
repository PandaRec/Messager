package com.example.messager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.editTextTextMessage);
        System.out.println("+++> "+editText.getText());
    }

    public void onClickSendMessage(View view) {
        EditText editText = findViewById(R.id.editTextTextMessage);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,editText.getText().toString());
        Intent choice = Intent.createChooser(intent,getString(R.string.choice));
        startActivity(choice);

    }
}