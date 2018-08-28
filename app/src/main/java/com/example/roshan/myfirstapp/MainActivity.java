package com.example.roshan.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public boolean flip = false;

    public static final String EXTRA_MESSAGE = "com.example.roshan.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void sendMessage(View view) {
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//    }

    public void switchButtonClicked(View view) {
        ImageView imgView = findViewById(R.id.imageView);
        Button btn = findViewById(R.id.button);
        if(!flip) {
            imgView.setImageResource(R.drawable.cat2);
            btn.setText("Switch back!");
            flip = true;
        } else {
            imgView.setImageResource((R.drawable.cat1));
            btn.setText("Switch!");
            flip = false;
        }
    }
}

