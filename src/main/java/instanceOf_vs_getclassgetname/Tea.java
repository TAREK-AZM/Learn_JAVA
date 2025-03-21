package instanceOf_vs_getclassgetname;

public class Tea extends Product{
    private int Quantity;
    public Tea(String name, double price, int quantity) {
        super(name,price);
        this.Quantity = quantity;
    }
//    public boolean equals (Product o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()){
//            System.out.println("not form the same class Tea"+getClass().getName() + " vs " +o.getClass().getName());
//            return false;
//        }
//        Tea t=(Tea) o;
//        return t.getName().equals(o.getName());
//    }
    public boolean equals(Object o){
        if(this == o) return true;
        if(o instanceof Product t) {
            return this.getName().equals(t.getName());
        }
        return false;
    }
    public int getQuantity() {return Quantity;}
    public String toString() {return super.toString()+" Quantity: "+Quantity;}

    /////////////////////////////////////////




}
