package inheritance_instanceOf_vs_getclassgetName;

public class test {
    public static void main(String[] args) {

        // Tea products
        Tea p1= new Tea("Tea",100.00,1);
        Tea p2= new Tea("Tea",100.00,1);
        // Coffee products
        Coffee c1= new Coffee("Tea",100.00,1);
        Coffee c2 = new Coffee("Tea",100.00,1);

        // comparaision using the instanceOf
        System.out.println(p1.equals(c2));
    }
}
