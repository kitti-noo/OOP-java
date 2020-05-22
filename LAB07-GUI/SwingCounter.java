import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCounter extends JFrame {
    private JLabel count = new JLabel("Counter ");
    private JTextField text = new JTextField("0",20);
    private JButton but = new JButton("Count");
    
    public SwingCounter (){
        Container c = getContentPane();
        setTitle("Swing Counter");
        setSize(500,250);
        setLayout(new FlowLayout());
        c.add(count);
        c.add(text);
        c.add(but);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);   
   }
        public static void main(String[] args) {
            new SwingCounter();
        }
} 
