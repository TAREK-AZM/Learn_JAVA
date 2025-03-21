package interface_Fonctionelle;

public interface IHello {
    void hello (String name);
    default void salut() {
        System.out.println("Aprendre Java!!!");
    }
}
