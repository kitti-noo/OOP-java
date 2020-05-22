import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LuckyNumber extends JFrame {
    private JTextField numfill = new JTextField("0",10);
    private JTextField scorefill = new JTextField("0",10);
    private JTextField num10fill = new JTextField(30);
    private JLabel inputnum = new JLabel("Input number:");
    private JLabel scorelabel = new JLabel("Score:");
    private JLabel luckynum = new JLabel("10 Lucky Numbers:");
    private JButton butran = new JButton("Random");
    private JButton butreset = new JButton("Reset");
    private String numstr = "";
    private int count = 0;
    private Integer numberinput;


    public LuckyNumber(){
        
        //GUI
        Container c = getContentPane();
        JPanel pa1 = new JPanel(new FlowLayout());
        pa1.add(luckynum);
        pa1.add(num10fill);

        JPanel pa2 = new JPanel(new FlowLayout());
        pa2.add(butran);
        pa2.add(butreset);

        JPanel pa3 = new JPanel(new FlowLayout());
        pa3.add(inputnum);
        pa3.add(numfill);
        pa3.add(scorelabel);
        pa3.add(scorefill);
        c.setLayout(new BorderLayout());
        c.add(pa1,BorderLayout.NORTH);
        c.add(pa2,BorderLayout.CENTER);
        c.add(pa3,BorderLayout.SOUTH);
        setTitle("LuckyNumber");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setSize(350,250);
        pack();

        //Event
        butran.addActionListener(new ActionListener(){
                
                @Override
                
                public void actionPerformed(ActionEvent e) {
                    
                   try{
                        Inputfill();
                        int n;
                        numberinput = Integer.parseInt(numfill.getText());
                        for (int i=0;i<10;i++){
                            n =  (int)((Math.random()*100));
                            numstr = numstr+" "+String.valueOf(n);
                            
                            if (numberinput == n){
                                 count += 1;
                            }   
                        }
                        num10fill.setText(numstr);
                        numstr = "";
                        scorefill.setText(String.valueOf(count));
                    } 
                    catch (NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null, "You must enter integer", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                    catch (InputException ie){
                        JOptionPane.showMessageDialog(null, "Input missing", "Warning", JOptionPane.WARNING_MESSAGE);
                    }   
                }
            
        });
        
        butreset.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                numfill.setText("0");
                scorefill.setText("0");
                num10fill.setText("");
                count = 0;
            }
        });
        

    }

    //ExceptionClass
    public class InputException extends ArithmeticException {
        public InputException (){
            super("Warning Input missing");
        }
    }

    //Field missing
    public void Inputfill() throws InputException {
        if (numfill.getText().length() == 0) {
            throw new InputException();
        }
    }
    public static void main(String[] args) {
        new LuckyNumber();
    }
}