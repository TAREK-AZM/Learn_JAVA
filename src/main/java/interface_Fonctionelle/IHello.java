package interface_Fonctionelle;

public interface IHello {
    // the functional interface has only one abstract method
    // the functional interface can has private, default methods implementation that used make internal logic
    void hello (String name);
    default void salut() {
        System.out.println("Aprendre Java!!!");
    }
}
