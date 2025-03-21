package TD3_Version_2;

import java.util.HashMap;
import java.util.Map;

public class Comande {
    private Integer id;
    private String cliente;
    private Map<Integer,CmdLine> ListLinesCmd = new HashMap<>();
    public Comande(Integer id, String cliente) {
        this.id = id;
        this.cliente = cliente;
    }
    public Integer getId() {return id;}
    public String getCliente() {return cliente;}
    public void AjouterCamande(Article article, Integer Quantity){
        CmdLine cmd = ListLinesCmd.get(article.getRef());
        if(cmd != null){
            cmd.quantity += Quantity;
        }else{
            ListLinesCmd.put(article.getRef(),new CmdLine(article, Quantity));
        }
    }
    public void AjouterOneCamande(Article article){
        CmdLine cmd = ListLinesCmd.get(article.getRef());
        if(cmd != null){
            cmd.quantity++;
        }else{
            ListLinesCmd.put(article.getRef(),new CmdLine(article, 1));
        }
    }

    public float MontantTotal(){
        float total = 0;
        for(Map.Entry<Integer,CmdLine> entry : ListLinesCmd.entrySet()){
            if(entry.getValue().article instanceof Lot l){
                total += l.MantantTotalLot()*entry.getValue().article.getPrix();
            }else {
                total += entry.getValue().article.getPrix()*entry.getValue().quantity;
            }


        }
        return total;
    }

    public String toString(){
        String detailsComande="";
        for(Map.Entry<Integer,CmdLine> entry : ListLinesCmd.entrySet()){
            detailsComande += entry.getValue().article.toString()+" - "+entry.getValue().quantity+" Prix Total per Article = "+entry.getValue().article.getPrix()*entry.getValue().quantity+" Dh\n";
        }
        return detailsComande;
    }


    public  class CmdLine{
        Article article;
        Integer quantity;
        public CmdLine(Article article, Integer quantity){
            this.article = article;
            this.quantity = quantity;
        }
        public Article getArticle() {return article;}
        public Integer getQuantity() {return quantity;}

    }
}
