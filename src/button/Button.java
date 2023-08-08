package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Button implements ActionListener{
    
    JCheckBox java,dsa,webtech;
    JRadioButton ljava, ldsa, lwebtech;
    JButton submit;

    public Button() {
        JFrame frame = new JFrame(" JFrame Example");

        JLabel title = new JLabel("First Swing Application");
        title.setBounds(200, 20, 150, 20);
        frame.add(title);

        JLabel like = new JLabel("Choose the subject you like:");
        like.setBounds(20, 50, 200, 20);
        frame.add(like);
        java = new JCheckBox("Java");
        java.setBounds(190, 50, 100, 20);
        frame.add(java);
        dsa = new JCheckBox("DSA");
        dsa.setBounds(290, 50, 100, 20);
        frame.add(dsa);
        webtech = new JCheckBox("Web Tech");
        webtech.setBounds(390, 50, 100, 20);
        frame.add(webtech);
        ButtonGroup b=new ButtonGroup();
        b.add(java);
        b.add(dsa);
        b.add(webtech);
        
        JLabel best= new JLabel("Choose your best subject:");
        best.setBounds(20,100,200,20);
        frame.add(best);
        ljava = new JRadioButton("Java");
        ljava.setBounds(190, 100, 100, 20);
        frame.add(ljava);
        ldsa = new JRadioButton("DSA");
        ldsa.setBounds(290, 100, 100, 20);
        frame.add(ldsa);
        lwebtech = new JRadioButton("Web Tech");
        lwebtech.setBounds(390, 100, 100, 20);
        frame.add(lwebtech);
        ButtonGroup g=new ButtonGroup();
        g.add(ljava);
        g.add(ldsa);
        g.add(lwebtech);
        
        JLabel in =new JLabel("Select your interest:");
        in.setBounds(50,140,150,20);
        frame.add(in);
        String[] list={"select one","programming","photography","sports"};
        JComboBox combo=new JComboBox(list);
        combo.setBounds(190, 140, 0150, 20);
        frame.add(combo);
        
        submit=new JButton("Submit");
        submit.setBounds(230, 180, 0150, 20);
        frame.add(submit);
        submit.addActionListener(this);
        
        

        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Button();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
