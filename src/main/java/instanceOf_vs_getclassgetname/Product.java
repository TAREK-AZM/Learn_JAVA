package instanceOf_vs_getclassgetname;

public class Product {

    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj instanceof Product p){
            return name.equals(p.getName());
        }
        return false;
    }
     public String toString(){ return "product name : "+name + " , price: " + price; }

}
