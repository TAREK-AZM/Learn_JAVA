package TP3;


public class MaListe<T> {

    Noud premier = null;
    public MaListe() {
    }

    public Boolean estVide(){
        return premier == null;
    }

    public void insert(T element){
        if(estVide()){
            premier = new Noud(element);
        }else {
            premier = new Noud(element, premier);
        }
    }
    public String ToString(){
        String ret = "";
        if(estVide()){
            ret = "Vide";
        }
        Noud temp = premier;
        while(temp != null){
            ret += temp.toString() + "\n";
        }
        return ret;
    }
}
