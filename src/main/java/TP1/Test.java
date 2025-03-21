package TP1;
import TP2.*;

public class Test {

    public static void main(String[] args) {

        Object p;
        p= new Point(40,40);
        Point pp=new Point(40,40);
//        p.afficher(); pas de methodes affivher dans object

        System.out.println("voila le point est :"+p);
        Point points[];
        points= new Point[4];
        for(int i=0;i<4;i++){
            points[i]= new Point(i,i);
        }
        for (int i=0;i<4;i++){
            System.out.println("voila le point est :"+points[i]);
        }
        System.out.println("===========teset point as opject and compare ============");
        System.out.println("le resultat est :"+pp.equals(p));


        Persone p1= new Persone("tarek","al azami");
        Compte c= new Compte(p1);
        System.out.println(p);

        Compte.afficherPersonnes();
    }
}
