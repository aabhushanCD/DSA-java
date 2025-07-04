import javax.swing.*;
import java.awt.*;

public class Practice3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Compound Border Example");
        JPanel panel = new JPanel();

        // Title + Padding
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("User Info"),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        // Add a sample button
        panel.add(new JLabel("Name:"));

        frame.add(panel);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
