package TP2;

import java.util.Vector;

public class Compte {

    private static int NmCompte;
    private int compteId;
    private Double Salaire;
    private   Vector<Persone> persones = new Vector<>();

    public Compte(Persone p) {
        ajouterPersone(p);
        Compte.NmCompte++;
    }

    public  void ajouterPersone( Persone p ) {
        persones.add(p);
        p.ajouterCompte(this);
    }

    public static void afficherPersonnes(){

    }
    public void deposer(Double Salaire) {
        this.Salaire += Salaire;
    }
    public void retirer(Double Salaire){
        this.Salaire -= Salaire;
    }
    public String toString(){
        return "Compte ID: " + compteId + " Salaire: " + Salaire;
    }

}
