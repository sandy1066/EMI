package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double p=0, r=0, t=0, i=0;
    String emi ="", ti="", tp="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                EditText et1 = (EditText) findViewById(R.id.et1);
                String d1 = et1.getText().toString();
                EditText et2 = (EditText) findViewById(R.id.et2);
                String d2 = et2.getText().toString();
                EditText et3 = (EditText) findViewById(R.id.et3);
                String d3 = et3.getText().toString();

                if(d1.isEmpty()||d2.isEmpty()||d3.isEmpty()){
                    Toast.makeText(MainActivity.this,":Please fill the VALUES:", Toast.LENGTH_SHORT).show();
                }
                else {
                    p = Double.parseDouble(d1);
                    r = Double.parseDouble(d2);
                    t = Double.parseDouble(d3);

                    r = r / (r*100);
                    i=(p*r*(Math.pow((1+r),t)))/(Math.pow((1+r),t)-1);
                    emi=Double.toString(i);
                    ti=Double.toString(i*t);
                    tp=Double.toString((i*t)+p);
                }

                EditText et4 = (EditText) findViewById(R.id.et4);
                et4.setText(emi);
                EditText et5 = (EditText) findViewById(R.id.et5);
                et5.setText(ti);
                EditText et6 = (EditText) findViewById(R.id.et6);
                et6.setText(tp);
            }
        });

        Button b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                EditText et1 = (EditText) findViewById(R.id.et1);
                et1.setText("");
                EditText et2 = (EditText) findViewById(R.id.et2);
                et2.setText("");
                EditText et3 = (EditText) findViewById(R.id.et3);
                et3.setText("");
                EditText et4 = (EditText) findViewById(R.id.et4);
                et4.setText("");
                EditText et5 = (EditText) findViewById(R.id.et5);
                et5.setText("");
                EditText et6 = (EditText) findViewById(R.id.et6);
                et6.setText("");
            }
        });
    }
}
