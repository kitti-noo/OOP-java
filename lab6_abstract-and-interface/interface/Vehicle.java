public interface Vehicle {

// all are the abstract methods.
void changeGear (int toGear);
void speedUp(int increaseSpeed);
void applyBrakes(int decreaseSpeed);

    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        b1.changeGear(4); //change GEAR
        b1.speedUp(60); // SPEED UP
       // b1.speedUp(60);
        b1.applyBrakes(20); //SPEED DOWN
        System.out.println(b1.toString());
    }
}