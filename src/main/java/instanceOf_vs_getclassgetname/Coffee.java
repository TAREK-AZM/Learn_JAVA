package instanceOf_vs_getclassgetname;

public class Coffee extends Product {

    private int Quantity;
    public Coffee(String name, double price, int quantity) {
        super(name,price);
        this.Quantity = quantity;
    }
    //    public boolean equals (Product o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Tea t=(Tea) o;
//        return getName().equals(t.getName());
//    }
    public boolean equals(Object o){
        if(this == o) return true;
        if(o instanceof Product c) {
            return this.getName().equals(c.getName());
        }
        return false;
    }
    public int getQuantity() {return Quantity;}
    public String toString() {return super.toString()+" Quantity: "+Quantity;}

    /////////////////////////////////////////




}
