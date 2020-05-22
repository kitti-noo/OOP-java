public class Rectangular extends Shape{
    private double width;
    private double height;
    public Rectangular(String name, double w,double h){
        super (name);
        this.width = w;
        this.height = h;
    }
    @Override
    public double getArea(){
        return width*height;
    }
}