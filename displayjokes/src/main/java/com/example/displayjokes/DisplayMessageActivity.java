package com.example.displayjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    public TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        textView = findViewById(R.id.displaymessage_text);
        String msg = getIntent().getStringExtra("jokeMessage");
        textView.setText(msg);
    }
}
