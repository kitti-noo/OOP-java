

public abstract class Polygon {
    protected int n;
    protected double [] sides;
    protected double area;
    abstract public void calArea();
    public double getArea(){
        return area;
    }
    public Polygon(int nb){
        this.n = nb;
        sides = new double[n];
    }
    
    public static void main(String[] args) {
        Square s1 = new Square(4);
        s1.calArea();
        System.out.println("Square Side = " +s1.getSide());
        System.out.println("Area = " +s1.getArea());
    }
}
    