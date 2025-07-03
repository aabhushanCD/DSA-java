import javax.swing.*;
import java.awt.*;

public class MyWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Adder");

        frame.setLayout(new GridLayout(3, 2));

        frame.add(new JLabel("Num1:"));
        frame.add(new JTextField());
        frame.add(new JLabel("Num2:"));
        frame.add(new JTextField());

        frame.add(new JLabel("Result:"));
        frame.add(new JButton("Add"));

        frame.setSize(250, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}