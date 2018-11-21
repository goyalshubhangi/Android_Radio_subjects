package com.example.faisal.radio_college;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton R1,R2,R3,R4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final RadioGroup r=(RadioGroup)findViewById(R.id.radio);


        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Selectedid =r.getCheckedRadioButtonId();
                R1=(RadioButton)findViewById(R.id.r1);
                R2=(RadioButton)findViewById(R.id.r2);
                R3=(RadioButton)findViewById(R.id.r3);
                R4=(RadioButton)findViewById(R.id.r4);
                if(R1.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Vipin Sir",Toast.LENGTH_SHORT).show();
                } if(R2.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Sheetal ma'am",Toast.LENGTH_SHORT).show();
                } if(R3.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Nikhil Sir",Toast.LENGTH_SHORT).show();
                } if(R4.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Arun Sir",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
