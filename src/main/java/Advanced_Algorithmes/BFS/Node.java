package Advanced_Algorithmes.BFS;

import java.util.ArrayList;
import java.util.List;

public class Node {

   private String value;
   private List<Node> Childrens = new ArrayList<>();

   public Node(String value){
       this.value =value;
   }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Node> getChildrens() {
        return Childrens;
    }

    public void setChildrens(List<Node> childrens) {
        Childrens = childrens;
    }


}
