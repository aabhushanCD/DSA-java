import java.awt.*;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practice4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing NavBar Example!");
        frame.setSize(800, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        JPanel navBarPanel = new JPanel();
        navBarPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        navBarPanel.setBackground(new Color(60, 62, 34));

        JButton logoButton = new JButton("Logo");
        JButton homeButton = new JButton("Home");
        JButton aboutButton = new JButton("About");
        JButton contacButton = new JButton("Contact");
        JButton loginButton = new JButton("Login/SignUp");

        JButton[] buttons = { logoButton, homeButton, aboutButton, contacButton, loginButton };

        for (JButton btn : buttons) {
            btn.setForeground(Color.white);
            btn.setBackground(new Color(89, 2, 23));
            btn.setFocusPainted(false);
        }

        navBarPanel.add(logoButton);
        navBarPanel.add(homeButton);
        navBarPanel.add(aboutButton);
        navBarPanel.add(contacButton);
        navBarPanel.add(loginButton);

        frame.add(navBarPanel, BorderLayout.NORTH);
        frame.setVisible(true);
    }
}