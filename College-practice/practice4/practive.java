import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class practive {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(2, 5));
        f.add(new JButton("Button"));

        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

}
