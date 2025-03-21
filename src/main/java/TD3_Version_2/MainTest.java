package TD3_Version_2;

import java.util.*;

public class MainTest
{
    public static void main(String[] args) {
        // Stylos
        Stylo s1 = new Stylo(4, "Stylo", 10, "Color");
        Stylo s2 = new Stylo(3, "Stylo", 10, "red");
        Stylo s3 = new Stylo(2, "Stylo", 10, "blue");
        Stylo s4 = new Stylo(1, "Stylo", 10, "blue");

        // Rametes
        Stylo r1 = new Stylo(4, "Ramete", 10, "GLUS");
        Stylo r2 = new Stylo(3, "Ramete", 10, "DTG");
        Stylo r3 = new Stylo(2, "Ramete", 10, "ZWX");
        Stylo r4 = new Stylo(1, "Ramete", 10, "YFDH");
// Ramete
        Stylo r11 = new Stylo(5, "Ramete", 10, "GLUS");
        Stylo r22 = new Stylo(6, "Ramete", 10, "DTG");
        Stylo r33 = new Stylo(7, "Ramete", 10, "ZWX");
        Stylo r44 = new Stylo(8, "Ramete", 10, "YFDH");

        // Catalogue
        // Ajouter des stylos
        Catalogue catalogue = new Catalogue(2020);
        catalogue.AjouterArticle(s1);
        catalogue.AjouterArticle(s4);
        catalogue.AjouterArticle(s3);
        catalogue.AjouterArticle(s2);
        // Ajouter des Rametes

        // Comande
        // Ajouter des stylos
        Comande comandeAhmad = new Comande(1, "Ahmad");
        comandeAhmad.AjouterCamande(s1, 1);
        comandeAhmad.AjouterCamande(s2, 2);
        comandeAhmad.AjouterCamande(s3, 3);
        comandeAhmad.AjouterCamande(s4, 4);
        // Ajouter des stylos
        comandeAhmad.AjouterCamande(r1, 1);
        comandeAhmad.AjouterCamande(r2, 2);
        comandeAhmad.AjouterCamande(r3, 3);
        comandeAhmad.AjouterCamande(r4, 4);

//        System.out.println("Le prix Totale est : " + comandeAhmad.MontantTotal() + "Dh");

        //Lots
        Lot l1 = new Lot(1);
        l1.AjouterArticle(s1)
                .AjouterArticle(s2)
                .AjouterArticle(s3)
                .AjouterArticle(s4)
                .AjouterArticle(r11)
                .AjouterArticle(r22)
                .AjouterArticle(r33)
                .AjouterArticle(r44)
        ;
        System.out.println(l1.MantantTotalLot());
        // ajouter Lots to Comands
        comandeAhmad.AjouterCamande(l1, 2);
        System.out.println("Le prix Totale est : " + comandeAhmad.MontantTotal() + "Dh");
        System.out.println("===================================================================================");
        System.out.println(" application the concept from the oracle books here in this example ArrayList:\n ");
        // ways to declare an List of Objects:
        List<Article> List1= new ArrayList<>();//no-args constractur create inicial capacity for 10 elements
        List<Article> List2= new ArrayList<>(20);// create inicial capacity for 20 elements
        List<Article> List3= new ArrayList<>(l1.Articles);//create initial elements from another collection
        List<Article> List4= Arrays.asList(s1,s2,s3);//fixed size
        List<Article> List5= List.of(s1,s2,s3);//
        // ways to declare a Set of Objects:
        Set<Article> Set1= new HashSet<>();//no-args constractur create inicial capacity for 10 elements
        Set<Article> Set2= new HashSet<>(20, 0.85F);// create inicial capacity for 20 elements
        Set<Article> Set3= new HashSet<>(l1.Articles);//create initial elements from another collection
        Set<Article> Set4= new HashSet<>(List1);//
        Set<Article> Set5= Set.of(s1,s2,s3);//fixed size
        // ways to declare a Set of Objects:
        Deque<Article> deq1= new ArrayDeque<>();//no-args constractur create inicial capacity for 10 elements
        Deque<Article> deq2= new ArrayDeque(20);// create inicial capacity for 20 elements
        Deque<Article> deq3= new ArrayDeque(l1.Articles);//create initial elements from another collection
        // syncronized
        List<Article> syncList = Collections.synchronizedList(List1);
//        Comande.CmdLine test=new Comande.CmdLine();// why i need to make it static

    // inner classes
        Article ar1 = new Article() {
            @Override
            public int compareTo(Article o) {

                return 0;
            }
        };
        System.out.println("this the inner class inline "+ar1.toString());
        // anonymous class that implement functional interface
        Collections.sort(syncList,new Comparator<Article>() {
            public int compare(Article A1,Article A2){
                return A1.getPrix().compareTo(A2.getPrix());
            }
        });
    }
    }
