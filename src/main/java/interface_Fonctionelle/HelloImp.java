package interface_Fonctionelle;

public class HelloImp implements IHello{

    @Override
    public void hello(String name) {
        System.out.println("Hello dear " + name);
    }

    public static void main(String[] args) {
        HelloImp h = new HelloImp();
        h.hello("Michael");
        h.salut();
    }

}
