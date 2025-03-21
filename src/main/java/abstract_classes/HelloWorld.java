package abstract_classes;

class HelloWorld extends Parent {
    private final String name;
    private final String lastname;

    // Constructor to initialize name and lastname
    public HelloWorld(String n, String l) {
        this.name = n;
        this.lastname = l;
    }

    // Override the hello method
    @Override
    public void hello() {
        System.out.println(toString());
    }

    // Override the toString method to return name and lastname
    @Override
    public String toString() {
        return name + " " + lastname;
    }

    public static void main(String[] args) {
        Parent h = new HelloWorld("mourad", "al azami");
        h.hello(); // Calls the hello method, which prints the name and lastname
    }
}

