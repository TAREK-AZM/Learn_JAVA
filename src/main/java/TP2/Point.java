package TP2;

public class Point {

    private int Abs;
    private int Ord;

    public Point(int Abs, int Ord) {
        this.Abs = Abs;
        this.Ord = Ord;
    }

    public Point(){
        this(10,20);
    }
    public void afficher(){
        System.out.println("["+Abs+", "+ Ord+"]");
    }
    // ici on overide the instances of the this class to be printable
    @Override
    public String toString(){
        return "["+Abs+", "+Ord+"]";
    }

    public boolean equals(Point p){
        return Abs == p.Abs && Ord == p.Ord;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Point){
            Point p = (Point)obj;
            return equals(p);
        }
        return false;
    }

}
