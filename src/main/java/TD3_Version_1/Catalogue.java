package TD3_Version_1;

import java.util.SortedSet;
import java.util.TreeSet;

public class Catalogue {
    private int Anee;
    private SortedSet<Article> ArtList;
    public Catalogue(int Anee) {
        this.Anee = Anee;
        this.ArtList = new TreeSet<Article>();
    }
    public void ajouterArticle(Article article) {
        ArtList.add(article);
    }

    public void supprimerArticle(Article article) {
        ArtList.remove(article);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Catalogue " + Anee + " :\n");
        for (Article article : ArtList) {
            sb.append(article.toString()).append("\n");
        }
        return sb.toString();
    }
}
