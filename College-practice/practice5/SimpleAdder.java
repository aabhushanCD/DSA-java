import javax.swing.*;
import java.awt.event.*;

public class SimpleAdder {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Simple Adder");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // First number label and field
        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(20, 20, 80, 25);
        JTextField field1 = new JTextField();
        field1.setBounds(100, 20, 150, 25);

        // Second number label and field
        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(20, 60, 80, 25);
        JTextField field2 = new JTextField();
        field2.setBounds(100, 60, 150, 25);

        // Result label and field
        JLabel resultLabel = new JLabel("Sum:");
        resultLabel.setBounds(20, 100, 80, 25);

        JTextField resultField = new JTextField();
        resultField.setBounds(100, 100, 150, 25);
        resultField.setEditable(false);

        // Button to calculate sum
        JButton sumButton = new JButton("Add");
        sumButton.setBounds(100, 140, 80, 25);

        // Add button action
        sumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(field1.getText());
                    int num2 = Integer.parseInt(field2.getText());
                    int sum = num1 + num2;
                    resultField.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        // Add components to frame
        frame.add(label1);
        frame.add(field1);
        frame.add(label2);
        frame.add(field2);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(sumButton);

        // Show the frame
        frame.setVisible(true);
    }
}
