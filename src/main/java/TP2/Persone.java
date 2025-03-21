package TP2;

import java.util.Vector;

public class Persone {
    private static int count;
    private int code;
    private String nom;
    private  String prenom;
    private  Vector<Compte> comptes= new Vector<>();

    public Persone( String nom, String prenom) {
        this.code= count++;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String toString() {
        return nom + " " + prenom;
    }
    public void ajouterCompte(Compte c){
        // ajouter persone dans collection of persones int the compte class
        comptes.add(c);
        c.ajouterPersone(this);
    }

    public  void afficherComptes(){
        comptes.forEach(C-> System.out.println(C));
    }

}
