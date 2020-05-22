import java.util.ArrayList;
public class ShapeMain {
    public static void main(String args[]){
        Shape shapes[] = new Shape[3];
        shapes[0] = new Rectangular("A", 5.0, 10.0);
        shapes[1] = new Circle("B", 3.0);
        shapes[2] = new Circle("C", 4.0);
        for (int i = 0; i < 3; i++) {
            System.out.println("Area of Shape " + (i+1) +" : " +shapes[i].getArea());
        }
        System.out.println("Biggest = " + findBiggest(shapes).getArea()) ; 
    }
    private static Shape findBiggest(Shape[] shapes){
        Shape Max = shapes[0];
        for (int i = 0; i < 3; i++) {
            if (shapes[i].getArea() > Max.getArea()){
                 Max = shapes[i];
            }
        }
        return Max;
    }
}