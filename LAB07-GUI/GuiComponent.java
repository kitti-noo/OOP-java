import javax.swing.*;
import java.awt.*;

public class GuiComponent extends JFrame {
    private JLabel name = new JLabel("Name : ");
    private JTextField text = new JTextField(20);
    private JLabel sex = new JLabel("Sex : ");
    private JRadioButton male , female ;
    private String faculty[] = {
        "Department of Computer Engineering",
        "Faculty of Technology and Environment",
        "Faculty of Hospitality and Tourism",
        "Faculty of International Studies",
        "College of Computing"
    };
    private JLabel fac = new JLabel("Faculty : ");
    private JComboBox fa = new JComboBox<>(faculty);
    private JButton but = new JButton("SUBMIT");
    
    public GuiComponent (){
        setTitle("GUI Component");
        Container c = getContentPane();

        //NAME
        JPanel pa1 = new JPanel(new FlowLayout());
        pa1.add(name);
        pa1.add(text);
        
        //SEX
        JPanel pa2 = new JPanel(new FlowLayout());
        pa2.add(sex);
        male = new JRadioButton( "Male", false );
        female = new JRadioButton( "Female", false );
        ButtonGroup rg = new ButtonGroup();
        rg.add(male);
        rg.add(female);
        pa2.add(male);
        pa2.add(female);
        
        //Faculty
        JPanel pa3 = new JPanel(new FlowLayout());
        fa.setMaximumRowCount(5);
        pa3.add(fac);
        pa3.add(fa);

        //Button
        JPanel pa4 = new JPanel();
        pa4.add(but);
        
        //setLayout
        c.setLayout(new GridLayout(4,1));
        c.add(pa1);
        c.add(pa2);
        c.add(pa3);
        c.add(pa4);
        setSize(500,250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        pack(); 
    }
    public static void main(String[] args) {
        new GuiComponent();
    } 
}
