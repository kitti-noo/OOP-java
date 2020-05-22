public class Bicycle implements Vehicle{
    private int speed;
    private int gear;
    public Bicycle (){
       this.speed = 0;
       this.gear = 0; 
    }
    public void changeGear(int toGear){
        this.gear = toGear;
    }
    public void speedUp (int increaseSpeed){
        this.speed += increaseSpeed;
    }
    public void applyBrakes(int decreseSpeed){
        this.speed -= decreseSpeed;
    }
    public String toString(){
        return "Bicycle => "+ "Gear : "+ this.gear +" Speed : " + this.speed;
    }
}