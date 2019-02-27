package com.example.norabbit.tp2e4;

/**
 * Created by norabbit on 21/11/2018.
 */

public class etudiant extends personne {

    private String matiere;
    private int annee;
    private double moyenne;

    etudiant(){
        matiere="";
        annee=0;
        moyenne=0;

    }
    etudiant(String a,String b,String c,String d,int e,double f){
        setPrenom(a);
        setNom(b);
        setMail(c);
        matiere=d;
        annee=e;
        moyenne=f;
    }

    public String getMatiere(){return matiere;}
    public int getAnnee(){return annee;}
    public Double getmoyenne(){return moyenne;}
    public void setMatiere(String a){matiere=a;}
    public void setAnnee(int a){annee=a;}
    public void setMoyenne(Double a){moyenne=a;}

}
