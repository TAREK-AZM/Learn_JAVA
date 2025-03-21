package TD3_V2;


public class Stylo extends Article{
    String color;
   public Stylo(Integer ref, String name,float prix,String color) {
       super(ref,name,prix);
       this.color = color;
   }
    public boolean equals(Article A) {
       if(this == A) return true;
       if(A == null || getClass() != A.getClass()) {
           return false;
       }
       Stylo stylo = (Stylo) A;
       return getRef() == stylo.getRef();
    }
    @Override
    public int compareTo(Article o) {

        return Integer.compare(getRef(), o.getRef());
    }

    @Override
    public String toString() {
        return "Stylo [Ref: " + getRef() + ", Label: " + getLabel() + ", Prix: " + getPrix() + ", Color: " + color + "]";
    }




}
