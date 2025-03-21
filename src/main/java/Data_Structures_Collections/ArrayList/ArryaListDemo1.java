package Data_Structures_Collections.ArrayList;
import java.util.*;
public class ArryaListDemo1 {
    public static void main(String[] parameters){
        // Declare ArrayList
        // ArrayList <Integer> al = new ArrayList<Integer>(); //this is homogenise integers
        // ArrayList <String> al = new ArrayList<String>(); //this is homogenise Strings
        // ArrayList al = new ArrayList(); // this is heterogines we can stock any kind of data in the same array
        ArrayList list = new ArrayList();
        list.add("tarek");
        list.add(200);
        list.add(10.5);
        list.add(true);
        list.add(false);
        list.add('a');

        System.out.println(list.size());
//        list.remove(0);
//        list.remove(list.get(1));
//        System.out.println(list.size());
        list.set(1,"al azami");//apdate the positon element index 1 by "al azami" string
        System.out.println(list);
        System.out.println(list.contains("al azami"));

//     #########   ways to read the data  ########
//        System.out.println("Reading the data using the for loop.........................");
//        for(int i=0 ;i< list.size();i++){
//            System.out.println(list.get(i));
//        }
//        System.out.println("Reading the data using the forEach loop.........................");
//        for(Object o : list){
//            System.out.println(o);
//        }
//        System.out.println("Reading the data using the Iterator .........................");
//        Iterator it = list.iterator();
//
//        while(it.hasNext()){
//            System.out.println(it.next());// print the element and move to the next.
//        }

//        #### add multiple elelents
        ArrayList list2 = new ArrayList();
        list2.addAll(list);
//     #### Sort ...........Data_Structures_Collections
        Collections.sort(list2);
        System.out.println("the sorten elements are:"+list2);
    }
}
