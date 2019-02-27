package com.example.norabbit.tp2e1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BT=(Button)findViewById(R.id.BT);
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double value=Double.parseDouble(((EditText)findViewById(R.id.ET)).getText().toString());
                Double.toString(value*3.14*2);
                CharSequence text ="le périmètre du cercle est "+Double.toString(value*3.14*2);
                Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
                toast.show();

            }
        });
    }
}
