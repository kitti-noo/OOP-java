public  class Square extends Polygon {
    public Square (double s){
        super(4);
        for (int i=0;i<sides.length;i++){
            sides[i] = s;
        }
        
    }
    public double getSide(){
        return sides[0];
    }
    @Override
    public void calArea(){

        area = sides[0]*sides[0];
    }
    public double getArea(){
        return area;
    }
   
}

