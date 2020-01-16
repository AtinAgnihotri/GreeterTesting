package com.example.greeter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void setText(View view){
        EditText editText = (EditText) findViewById(R.id.greetEditText);
        String message = editText.getText().toString();

        TextView textView = findViewById(R.id.greetTextView);
        textView.setText("Hello " + message + "!");


    }
}
