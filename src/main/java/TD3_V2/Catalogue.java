package TD3_V2;

import java.util.SortedSet;
import java.util.TreeSet;

public class Catalogue {
    private int annee;
    SortedSet<Article> articles = new TreeSet<Article>();
    public Catalogue(int annee) {
        this.annee = annee;
    }
    public int getAnnee() {return annee;}
    public void AjouterArticle(Article article) {
        articles.add(article);
    }
    public void SuprimerArticle(Article article){
        articles.remove(article);
    }
    public String  toString() {
        StringBuilder chaine= new StringBuilder();
        chaine.append("articles de :"+annee +" \n");
        for(Article article : articles){
            chaine.append(article.toString()).append("\n");
        }
        return chaine.toString();
    }

}
