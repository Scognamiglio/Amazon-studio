package com.example.norabbit.tp2e3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableLayout table=(TableLayout) findViewById(R.id.Tab);
        TableRow row;
        TextView tv1,tv2;

        int i;
        for(i=0;i<=25;i++){
            row=new TableRow(this);
            tv1=new TextView(this);
            tv2=new TextView(this);
            tv1.setGravity(Gravity.CENTER);
            tv2.setGravity(Gravity.CENTER);
            tv1.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT));
            tv2.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT));
            if (i==0){
                tv1.setText("Celsuis");
                tv2.setText("Fahrenheit");
            }else{
                tv1.setText(i*2+"°C");

                tv2.setText(((i*2)*9/5)+32+"°F");
            }
            row.addView(tv1);
            row.addView(tv2);

            table.addView(row);
        }
    }
}
