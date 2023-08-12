package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calc implements ActionListener {

    JTextField num1, num2;
    JButton add, sub, mul, div;
    JLabel resultLabel;

    public Calc() {
        JFrame frame = new JFrame("Calculator");

        JLabel lnum1 = new JLabel("Enter first number: ");
        lnum1.setBounds(30, 30, 150, 20);
        frame.add(lnum1);
        num1 = new JTextField();
        num1.setBounds(200, 30, 150, 20);
        frame.add(num1);

        JLabel lnum2 = new JLabel("Enter second number: ");
        lnum2.setBounds(30, 60, 150, 20);
        frame.add(lnum2);
        num2 = new JTextField();
        num2.setBounds(200, 60, 150, 20);
        frame.add(num2);

        add = new JButton("Add");
        add.setBounds(75, 90, 100, 020);
        frame.add(add);
        add.addActionListener(this);

        sub = new JButton("Subtract");
        sub.setBounds(185, 90, 100, 020);
        frame.add(sub);
        sub.addActionListener(this);

        mul = new JButton("Multiply");
        mul.setBounds(75, 120, 100, 020);
        frame.add(mul);
        mul.addActionListener(this);

        div = new JButton("Division");
        div.setBounds(185, 120, 100, 020);
        frame.add(div);
        div.addActionListener(this);

        resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(30, 150, 300, 20);
        frame.add(resultLabel);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calc();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double number1 = Double.parseDouble(num1.getText());
        double number2 = Double.parseDouble(num2.getText());
        double result = 0.0;

        if (e.getSource() == add) {
            result = number1 + number2;
        } else if (e.getSource() == sub) {
            result = number1 - number2;
        } else if (e.getSource() == mul) {
            result = number1 * number2;
        } else if (e.getSource() == div) {
            if (number2 != 0) {
                result = number1 / number2;
            } else {
                // Handle division by zero error
                resultLabel.setText("Cannot divide by zero.");
                return;
            }
        }

        resultLabel.setText("Result: " + result);
    }
}
