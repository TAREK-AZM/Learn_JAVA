package TD3_Version_1;

// Classe mère Article
public abstract class Article implements Comparable<Article> {
    private String reference;
    private String libelle;
    private double prixUnitaire;

    public Article(String reference, String libelle, double prixUnitaire) {
        this.reference = reference;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
    }

    public String getReference() {
        return reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    @Override
    public String toString() {
        return "Référence: " + reference + ", Libellé: " + libelle + ", Prix: " + prixUnitaire;
    }

    @Override
    public int compareTo(Article autre) {
        return this.reference.compareTo(autre.getReference());
    }
}

// Classe Stylo
