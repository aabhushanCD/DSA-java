import javax.swing.*;
import java.awt.*;

public class control {
    public static void main(String[] args) {

        JFrame frame = new JFrame("User Controls");

        frame.setLayout(new GridLayout());
        frame.add(new JButton("Button"));

        frame.setLayout(new GridLayout(8, 8));

        frame.setSize(720, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
