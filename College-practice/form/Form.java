import javax.swing.*;
import java.awt.*;

public class Form {
    public static void main(String[] args) {
        JFrame frame = new JFrame("UserData");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // First Name
        JPanel row1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        row1.add(new JLabel("First Name:"));
        JTextField firstName = new JTextField(10);
        row1.add(firstName);

        // Last Name
        JPanel row2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        row2.add(new JLabel("Last Name:"));
        JTextField lastName = new JTextField(10);
        row2.add(lastName);

        // Number
        JPanel row3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        row3.add(new JLabel("Number:"));
        JTextField number = new JTextField(10);
        row3.add(number);

        // Gender
        JPanel row4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        row4.add(new JLabel("Gender:"));
        JTextField gender = new JTextField(10);
        row4.add(gender);

        // Submit
        JPanel row5 = new JPanel();
        row5.add(new JButton("Submit"));

        // Add rows to main panel
        panel.add(row1);
        panel.add(row2);
        panel.add(row3);
        panel.add(row4);
        panel.add(row5);

        frame.add(panel);
        frame.setVisible(true);
    }
}
