import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener{
    private JLabel lb1 = new JLabel("Colsius: ");
    private JTextField text1 = new JTextField("0",20);
    private JLabel lb2 = new JLabel("Fahrenheit: ");
    private JTextField text2 = new JTextField("0",20);
    
    public TemperatureConverter (){
        
        
        setTitle("Temperature Converter");
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  

         Container c = getContentPane();
        setSize(300,100);
        c.setLayout(new GridLayout(2,2));
        c.add(lb1);
        c.add(text1);
        text1.addActionListener(this);
        c.add(lb2);
        c.add(text2);
        text2.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e){
    try {
        if (e.getSource()==text1){
            Double f = Double.parseDouble(text1.getText());
            f = 9.0/5.0*f + 32;
            String t2 = String.valueOf(f);
            text2.setText(t2);
        }
    else if (e.getSource()==text2){
            Double c = Double.parseDouble(text2.getText());
            c = (c-32)*(5.0/9.0);
            String t1 = String.valueOf(c);
            text1.setText(t1);
        }
    }
    catch(NumberFormatException nfe){
        JOptionPane.showMessageDialog(null, "You must number", "Warning", JOptionPane.WARNING_MESSAGE);
    }
    
    }
    public static void main(String[] args) {
            new TemperatureConverter();
    }
} 