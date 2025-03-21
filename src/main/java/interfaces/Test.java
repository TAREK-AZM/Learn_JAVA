package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Person> Ginf2 = new ArrayList<Person>();
        Ginf2.add(new Person("BILAL", 18, 9800));
        Ginf2.add(new Person("SIHAM", 16, 12000));
        Ginf2.add(new Person("ABIR", 17, 11900));
        Collections.sort(Ginf2); // Tri naturel c à dire par salaire Collections.sort(Ginf2,new CompareName()); // Tri par CompareName
        for(Person person : Ginf2) {
        System.out.println(person);
        }
    }
}