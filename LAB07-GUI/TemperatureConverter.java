import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame {
    private JLabel lb1 = new JLabel("Colsius: ");
    private JTextField text1 = new JTextField("0",20);
    private JLabel lb2 = new JLabel("Fahrenheit: ");
    private JTextField text2 = new JTextField("0",20);
    
    public TemperatureConverter (){
        setTitle("Temperature Converter");
         Container c = getContentPane();
        //setSize(500,250);
        // Panel pa1 = new Panel(new FlowLayout());
        // pa1.add(lb1);
        // pa1.add(text1);
        // Panel pa2 = new Panel(new FlowLayout());
        // pa2.add(lb2);
        // pa2.add(text2);
       // c.setLayout(new BorderLayout());
        // c.add(pa1,BorderLayout.NORTH);
        // c.add(pa2,BorderLayout.CENTER);
        setSize(400,250);
        c.setLayout(new GridLayout(2,2));
        c.add(lb1);
        c.add(text1);
        c.add(lb2);
        c.add(text2);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }
    public static void main(String[] args) {
            new TemperatureConverter();
    }
} 
