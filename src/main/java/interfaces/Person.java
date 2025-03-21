package interfaces;


public class Person implements Comparable<Person> {

    private String Name;
    private int Age;
    private double Salaire;

    public String getName() {
        return Name;
    }

    @Override
    public int compareTo(Person o) {

        return (int) (this.Salaire - o.Salaire);
    }

    public Person(String name, int age, double salaire) {
        Name = name;
        Age = age;
        Salaire = salaire;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Salaire=" + Salaire +
                '}';
    }
}