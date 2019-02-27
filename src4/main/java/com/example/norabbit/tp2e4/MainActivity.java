package com.example.norabbit.tp2e4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    etudiant e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e=new etudiant();

        Button BT=(Button)findViewById(R.id.BT);
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setPrenom(((EditText)(findViewById(R.id.ET))).getText().toString());
                e.setNom(((EditText)(findViewById(R.id.ET1))).getText().toString());
                e.setMail(((EditText)(findViewById(R.id.ET2))).getText().toString());
                e.setMatiere(((EditText)(findViewById(R.id.ET3))).getText().toString());
                e.setAnnee(Integer.parseInt(((EditText)(findViewById(R.id.ET4))).getText().toString()));
                e.setMoyenne(Double.parseDouble(((EditText)(findViewById(R.id.ET5))).getText().toString()));



                //Toast toast = Toast.makeText(getApplicationContext(), e.getPrenom(), Toast.LENGTH_SHORT);
                //toast.show();
            }
        });


        Button BT1=(Button)findViewById(R.id.BT1);
        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text="<table><tr><td>Prenom</td><td>"+e.getPrenom()+"</td></tr>";
                text+="<tr><td>nom</td><td>"+e.getNom()+"</td></tr>";
                text+="<tr><td>Mail</td><td>"+e.getMail()+"</td></tr>";
                text+="<tr><td>Matière</td><td>"+e.getMatiere()+"</td></tr>";
                text+="<tr><td>annee</td><td>"+e.getAnnee()+"</td></tr>";
                text+="<tr><td>moyene</td><td>"+e.getmoyenne()+"</td></tr></table>";



                Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}