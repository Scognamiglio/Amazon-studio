package com.example.norabbit.tp2e2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button BT=(Button)findViewById(R.id.BT);
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1=((EditText)findViewById(R.id.ET)).getText().toString();
                String v2=((EditText)findViewById(R.id.ET1)).getText().toString();
                String v3=((EditText)findViewById(R.id.ET2)).getText().toString();

                if(!v1.equals("")){
                    ((EditText)findViewById(R.id.ET1)).setText(Double.toString(Double.parseDouble(v1)*0.88));
                    ((EditText)findViewById(R.id.ET2)).setText(Double.toString(Double.parseDouble(v1)*6.93));
                }else if(!v2.equals("")){
                    ((EditText)findViewById(R.id.ET)).setText(Double.toString(Double.parseDouble(v2)*1.14));
                    ((EditText)findViewById(R.id.ET2)).setText(Double.toString(Double.parseDouble(v2)*7.9));
                }else if(!v3.equals("")){
                    ((EditText)findViewById(R.id.ET)).setText(Double.toString(Double.parseDouble(v3)*0.14));
                    ((EditText)findViewById(R.id.ET1)).setText(Double.toString(Double.parseDouble(v3)*0.13));
                }

            }
        });
    }
}