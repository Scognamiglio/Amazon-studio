package com.example.norabbit.tp2e4;

/**
 * Created by norabbit on 21/11/2018.
 */

public class personne {
    private String prenom,nom,eMail;

    personne(){
        prenom="";
        nom="";
        eMail="";
    }
    personne(String a,String b,String c){
        prenom=a;
        nom=b;
        eMail=c;
    }

    public String toString(){
        return "Prenom="+prenom+" Nom="+nom+" eMail="+eMail;
    }

    public String getPrenom(){return prenom;}
    public String getNom(){return nom;}
    public String getMail(){return eMail;}
    public void setPrenom(String a){prenom=a;}
    public void setNom(String a){nom=a;}
    public void setMail(String a){eMail=a;}

}
