package com.example.musicbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Register extends AppCompatActivity {

    TextView textView;
    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        textView=(TextView) findViewById(R.id.txt_signin);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
            }
        });

        cardView=(CardView) findViewById(R.id.btn_signup);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, HomePage.class);
                startActivity(intent);
            }
        });
    }

    public void signup (View view){
        Intent intent = new Intent(Register.this, Login.class);
        startActivity (intent);
    }
}