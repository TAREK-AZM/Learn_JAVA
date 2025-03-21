package TD3_V2;

public class Ramete extends Article{
    private String gamme;
    public Ramete(Integer ref, String label, Float prix,String gamme){
        super(ref,label,prix);
        this.gamme=gamme;
    }
    public boolean equals(Article A){
        if(this == A) return true;
        if(A == null || getClass() != A.getClass()) return false;
        Ramete r = (Ramete) A;
        return getRef() == r.getRef();
    }
    public String getGamme() {return gamme;}

    public int compareTo(Article o) {
        return Integer.compare(this.getRef(),o.getRef());
    }

    public String toString(){
        return "Ramete [Ref: " + getRef() + ", Label: " + getLabel() + ", Prix: " + getPrix() + ", Gamme: " +gamme + "]";
    }
}
