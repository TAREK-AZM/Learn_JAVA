package TD3_Version_1;


import java.util.Comparator;

// Classe Ramete
public class Ramete extends Article {
    private int grammage;

    public Ramete(String reference, String libelle, double prixUnitaire, int grammage) {
        super(reference, libelle, prixUnitaire);
        this.grammage = grammage;
    }

    public int getGrammage() {
        return grammage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grammage: " + grammage + "g/m²";
    }
    public Comparator<Stylo> CompareReference=(r1, r2) -> r1.getReference().compareTo(r2.getReference());
    public static Comparator<Stylo> CompareGame=(s1,s2) -> s1.getCouleur().compareTo(s2.getCouleur());

}

