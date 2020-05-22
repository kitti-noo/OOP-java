import java.util.ArrayList;
import java.io.*;
public class DiceBox {
    private ArrayList<Dice> Ds;

    public DiceBox(){
        Ds = new ArrayList<Dice>();
    }
    public void add(Dice Fa){
        Ds.add(Fa);
    }
    public void shake(){
        for (int i=0;i<Ds.size();i++){
            Ds.get(i).roll();
        }
    }
    public int getTotal(){
        int Total = 0;
        for (int i=0;i<Ds.size();i++){
           Total += Ds.get(i).getDice(); 
        }
        return Total;
    }
    public void printDices(){
        for (Dice d : Ds) {
            System.out.println(d);
        }
    }
}