package TP3;

public class Noud <T>{
    private T element;
    private Noud suivent;

    public Noud(T element, Noud suivent) {
        this.element = element;
        this.suivent = suivent;
    }
    public Noud(T element) {
        this.element = element;
        this.suivent = null;
    }

    public Noud getSuivent() {
        return suivent;
    }
    public void setSuivent(Noud suivent) {
        this.suivent = suivent;
    }
    public String ToString() {
        return element.toString();
    }


}
