package collections.LinkedList;

import TD3_V2.Article;
import TD3_V2.Ramete;
import TD3_V2.Stylo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<Article> data= new LinkedList<>();// homogine store data
        data.add(new Stylo(12,"stylobik",10,"blue"));
        data.add(new Ramete(13,"mestara", 10F,"mestara"));
        data.add(new Stylo(14,"stylobik",10,"blue"));
        data.add(new Stylo(15,"stylobik",10,"blue"));
        Article l[] = {
                new Stylo(16,"stylobik",10,"blue"),
                new Stylo(117,"stylobik",10,"blue"),
                new Ramete(18,"mestara", 10F,"mestara"),
                new Stylo(18,"stylobik",10,"blue")
        };

        LinkedList<Article> data2 = new LinkedList<>();
        data2.addAll(data);
        data2.addAll(Arrays.asList(l));// addAll need Collection reference type not just 'l' array so we convert it
        System.out.println(data2);

        // sorting
        Collections.sort(data2);
        // reading the data
        for(Article a:data2){
            System.out.println(a.getRef());
        }

        // implement stack and queue
        data2.getFirst();
        data2.addFirst(new Ramete(19,"mestara", 10F,"mestara"));
        // implement queue
        data2.getLast();
        data2.addLast(new Stylo(20,"stylobik",10,"blue"));


    }
}
