public class Dice {
    private int face;
    public  Dice(){
        this.face = 1;
    }
    public  Dice (int f){
         this.face = f;
    }
    public int getDice(){
        return this.face;
    }
    public void setDice(int ff){
        this.face = ff;
    }
    public void roll(){
        this.face =  (int)((Math.random()*6)+1);
    }
    public String toString( ){//return string: stCode name gpa of Student
        String s = "face" + " : " + face;
        return s;
    }
}