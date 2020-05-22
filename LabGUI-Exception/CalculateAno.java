import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Anonymous Class
public class Calculate extends JFrame  {
    private JTextField num1 = new JTextField(10);
    private JTextField num2 = new JTextField(10);
    private JTextArea text = new JTextArea();
    private JButton butadd = new JButton("Add");
    private JButton butsub = new JButton("Subtract");
    private JButton butclr = new JButton("Clear");
    private Integer n1;
    private Integer n2;
    private int ans;

    public Calculate(){
        
        //GUI
        Container c = getContentPane();
        JPanel pa1 = new JPanel(new FlowLayout());
        pa1.add(num1);
        pa1.add(num2);

        JPanel pa2 = new JPanel(new FlowLayout());
        pa2.add(butadd);
        pa2.add(butsub);
        pa2.add(butclr);

        c.setLayout(new GridLayout(3,1));
        c.add(pa1);
        c.add(pa2);
        c.add(text);
        setTitle("Calculate");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setSize(350,250);
        pack();

        

        ActionListener cal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (num1.getText().length() == 0 || num2.getText().length() == 0) {
                        throw new Exception();
                    }
                    else {
                        n1 = Integer.parseInt(num1.getText());
                        n2 = Integer.parseInt(num2.getText());
                    }
                }
                catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "You must enter two integers", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Field missing", "Warning", JOptionPane.WARNING_MESSAGE);
                }

                if (e.getSource() == butadd){
                    ans = n1+n2;
                    String t1 = n1+" + "+n2+" = "+ String.valueOf(ans);
                    text.append(t1 +"\n");
                }
                else if (e.getSource() == butsub) {
                    ans = n1-n2;
                    String t2 = n1+" - " +n2+" = "+ String.valueOf(ans);
                    text.append(t2 +"\n");
                }
            }
        };
        butadd.addActionListener(cal);
        butsub.addActionListener(cal);
        butclr.addActionListener(new ActionListener(){
        
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setText("");  
                    num1.setText("");
                    num2.setText("");
    
                }
        });
    
    }

    public static void main(String[] args) {
        new Calculate();
}
}
