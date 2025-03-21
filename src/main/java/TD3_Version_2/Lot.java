package TD3_Version_2;

import java.util.SortedSet;
import java.util.TreeSet;

public class Lot extends Article {
    private Integer ref;
    SortedSet<Article> Articles= new TreeSet<>();
    public Lot(Integer ref) {
        super(0,"lot",0);
        this.ref = ref;
    }
    public int getRef(){return ref;}

    public boolean equals(Article A){
        if(this == A) return true;
        if(A == null || getClass() != A.getClass()) return false;
        Lot l=(Lot)A;
        return ref == l.ref;
    }
    public Lot AjouterArticle(Article A){
        Articles.add(A);
        return this;
    }
    public Float MantantTotalLot(){
        Float TotalLot=0.0f;
        for(Article A : Articles){
            TotalLot += A.getPrix();
        }
        return TotalLot;
    }
    @Override
    public int hashCode() {
        return ref.hashCode();
    }
    @Override
    public int compareTo(Article o) {
        return getRef() - o.getRef();
    }
}
