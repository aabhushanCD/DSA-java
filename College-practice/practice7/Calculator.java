import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JButton[] buttons = new JButton[9];
    JPanel panel;
    JTextField text;
    String value = new String();

    public Calculator() {
        // Frame setup
        setTitle("Calculator");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        text = new JTextField();
        text.setBounds(10, 10, 465, 75);
        add(text);
        // Panel setup

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 10, 10));
        panel.setBorder(BorderFactory.createDashedBorder(Color.GRAY, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(100, 20, 20, 20));
        // Button creation and addition

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            panel.add(buttons[i]); // Add button to panel
        }
        for (int i = 0; i < 9; i++) {
            buttons[i].addActionListener(this); // Single ActionListener
        }
        panel.add(new JButton("="));
        // Add panel to frame
        add(panel, BorderLayout.CENTER);
        setVisible(true);

    }

    public void function() {
        value = text.getText();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        text.setText(text.getText() + clickedButton.getText());
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
