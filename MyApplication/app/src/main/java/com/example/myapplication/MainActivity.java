package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button button;
    TextView textView;
    EditText edmin,edmax;
int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.btnclick);
        textView = findViewById(R.id.textView);
        edmin=findViewById(R.id.edmin);
        edmax=findViewById(R.id.edmax);
                button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int minleng=Integer.parseInt(edmin.getText().toString());
                int maxleng=Integer.parseInt(edmax.getText().toString());
                Random random=new Random();
                int valorSorteado = random.nextInt(maxleng - minleng + 1) + minleng;

                    textView.setText(Integer.toString(valorSorteado));
            }
        });
    }
}