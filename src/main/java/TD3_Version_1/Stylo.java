package TD3_Version_1;

import java.util.Comparator;

public class Stylo extends Article {
    private String couleur;

    public Stylo(String reference, String libelle, double prixUnitaire, String couleur) {
        super(reference, libelle, prixUnitaire);
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        return super.toString() + ", Couleur: " + couleur;
    }

    public static Comparator<Stylo> CompareReference=(s1,s2) -> s1.getReference().compareTo(s2.getReference());
    public static Comparator<Stylo> CompareColeur=(s1,s2) -> s1.getCouleur().compareTo(s2.getCouleur());


}

// Classe Ramette
