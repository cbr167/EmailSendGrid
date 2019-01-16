package com.example.bhagy.senduassis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get the received intent
        Intent receivingUAssIntent = getIntent();
        String receivedAction = receivingUAssIntent.getAction();
        if(receivedAction != null){
            String receivedActionType = receivingUAssIntent.getType();

            if(receivedActionType.startsWith("text/")){
                String receivedText = receivingUAssIntent.getStringExtra(Intent.EXTRA_TEXT);
                Toast.makeText(this, receivedText, Toast.LENGTH_SHORT).show();
            }
        }

    }
}
