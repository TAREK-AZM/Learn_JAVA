package collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add('c');
        list.add('b');
        list.add('d');
        list.add('t');
        list.add('h');
        list.add('a');


//        #### add multiple elelents
        ArrayList list2 = new ArrayList();
        list2.addAll(list);
//     #### Sort ...........collections
        Collections.sort(list2);
        System.out.println("the sorten elements are:"+list2);

//        #### shufling the elements
          Collections.shuffle(list2);
        System.out.println("the shuflen  elements are:"+list2);
//        #### converting the array into ArrayList
        String words[] = {"tarek","mourad","wissam"};
        ArrayList list3 = new ArrayList<String>(Arrays.asList(words));
        System.out.println("this the converted array to ArrayList : "+list3);

    }
}
