package com.example.secondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.testFunction();

        inputText = (EditText) findViewById(R.id.inputText);
        inputText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_UP))   {
                    text.setText(inputText.getText());
                }
                return false;
            }
        });
        text = (TextView) findViewById(R.id.textView);
    }

    public void tekstiMuokkaus(View v)  {
        text.setText(inputText.getText());
    }


    public void testFunction (View v) {
        System.out.println("Hello World!");
        text.setText("Hello world!");

    }
}