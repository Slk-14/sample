package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public EditText E1,E2,E3;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mycalci);
        E1=(EditText)findViewById(R.id.e1);
        E2=(EditText)findViewById(R.id.e2);
        E3=(EditText)findViewById(R.id.e3);
        b=(Button)findViewById(R.id.b1);
        b.setOnClickListener(this);
    }
    public void onClick(View v){
        int n1=Integer.parseInt(E1.getText().toString());
        int n2=Integer.parseInt(E2.getText().toString());
        int n3=n1-n2;
        E3.setText(""+n3);
    }
}