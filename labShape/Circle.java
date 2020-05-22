public class Circle extends Shape{
    private double  radius ;
    public Circle(String name, double r){
        super (name);
        this.radius = r;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
}