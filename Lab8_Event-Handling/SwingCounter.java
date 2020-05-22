import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCounter extends JFrame {
    private JLabel count = new JLabel("Counter ");
    private JTextField text = new JTextField("0",20);
    private JButton but1 = new JButton("Count");
    private JButton but2 = new JButton("Reset");
    private int numcount = 0;
    
    public SwingCounter (){
        Container c = getContentPane();
        setTitle("Swing Counter");
        setSize(500,250);
        setLayout(new FlowLayout());
        c.add(count);
        c.add(text);
        c.add(but1);
        but1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
               
                numcount +=1;
                text.setText(Integer.toString(numcount));
                System.out.println(numcount);

                
            }
        });
        c.add(but2);
        but2.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                numcount = 0;
                text.setText(Integer.toString(numcount));
                System.out.println(numcount);
            }
        });
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);   
   }
        public static void main(String[] args) {
            new SwingCounter();
        }
} 