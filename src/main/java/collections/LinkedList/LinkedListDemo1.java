package collections.LinkedList;
import java.util.*;
// import all the classes from this package
import TD3_Version_2.*;
public class LinkedListDemo1 {
    public static void main(String[] args) {
//      LinkedList data= new LinkedList();// heterogines store data
        LinkedList<Article> data= new LinkedList();// homogine store data
        data.add(new Stylo(12,"stylobik",10,"blue"));
        data.add(new Ramete(12,"mestara", 10F,"mestara"));
        data.add(new Stylo(12,"stylobik",10,"blue"));
        data.add(new Stylo(12,"stylobik",10,"blue"));

        System.out.println(data);
        System.out.println("------------------read data using the ForEach--------------");
        for(Object o:data){
            System.out.println(o.toString().toUpperCase());
            if(o instanceof Ramete r){
                System.out.println("Rammete--------"+r.toString()+"ramete--------");
            }
        }

        // reading using the iterator
        System.out.println("------------------read data using the iterator--------------");
        Iterator<Article> it = data.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
            if(it.next() instanceof Ramete r){
                System.out.println("Rammete-------"+r.toString()+"ramete-------");
            }
        }


    }
}
