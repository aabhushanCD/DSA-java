import javax.swing.*;
import java.awt.*;

public class Login {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login");

        JTextField userName, email, password;
        JLabel labelUser, labelEmail, labelPassword;
        JPanel panel = new JPanel();
        labelUser = new JLabel("Username:");
        labelUser.setBounds(50, 30, 100, 25);
        userName = new JTextField();
        userName.setBounds(120, 30, 100, 25);

        labelEmail = new JLabel("Email:");
        labelEmail.setBounds(50, 70, 100, 25);
        email = new JTextField();
        email.setBounds(120, 70, 100, 25);

        labelPassword = new JLabel("Password:");
        labelPassword.setBounds(50, 100, 100, 25);
        password = new JPasswordField(10);
        password.setBounds(120, 100, 100, 25);

        JButton submit = new JButton("Login");
        submit.setBounds(110, 150, 100, 25);
        String[] country = { "Nepal", "India", "China" };
        JComboBox<String> box = new JComboBox<>(country);
        box.setBounds(150, 150, 150, 25);
        submit.setBounds(150, 200, 100, 30);
        panel.add(labelUser);
        panel.add(userName);
        panel.add(labelEmail);
        panel.add(email);
        panel.add(labelPassword);
        panel.add(password);
        panel.add(submit);
        panel.add(box);
        panel.setLayout(null);

        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
