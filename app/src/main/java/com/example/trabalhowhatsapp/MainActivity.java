package com.example.trabalhowhatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button butano;
    private EditText TextNumber;
    private EditText TextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextNumber = findViewById(R.id.TextNumber);
        TextMessage = findViewById(R.id.TextMessage);
        butano = findViewById(R.id.butano);


        butano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = TextMessage.getText().toString();
                String number = TextNumber.getText().toString();

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone="+number+
                                "&text="+message));
                        startActivity(i);
                        TextMessage.setText("");
                        TextNumber.setText("");




            }
        });
    }
}