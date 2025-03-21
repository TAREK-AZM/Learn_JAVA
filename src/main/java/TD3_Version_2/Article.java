package TD3_Version_2;

abstract public class Article implements Comparable<Article> {
    private Integer ref;
    private String labele;
    private Float prix;
     public Article(Integer ref, String labele, float prix) {
        this.ref = ref;
        this.labele = labele;
        this.prix = prix;
    }
    public Article() {

    }
     public String getLabel(){
         return labele;
    }
     public Float getPrix(){
         return prix;
     }
     public int getRef(){
         return this.ref;
     }

}
