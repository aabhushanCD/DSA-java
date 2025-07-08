import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Field extends JFrame implements ActionListener {

    JButton button;
    JLabel l1, l2, l3, l4;
    JTextField f1, f2, f3, f4;

    public Field() {
        setTitle("User Form");
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Name
        l1 = new JLabel("Name:");
        l1.setBounds(20, 20, 80, 25);
        f1 = new JTextField();
        f1.setBounds(100, 20, 150, 25);

        // Email
        l2 = new JLabel("Email:");
        l2.setBounds(20, 60, 80, 25);
        f2 = new JTextField();
        f2.setBounds(100, 60, 150, 25);

        // Password
        l3 = new JLabel("Password:");
        l3.setBounds(20, 100, 80, 25);
        f3 = new JTextField();
        f3.setBounds(100, 100, 150, 25);

        // Phone
        l4 = new JLabel("Phone:");
        l4.setBounds(20, 140, 80, 25);
        f4 = new JTextField();
        f4.setBounds(100, 140, 150, 25);

        // Button
        button = new JButton("Submit");
        button.setBounds(100, 180, 100, 30);
        button.addActionListener(this);

        // Add components
        add(l1);
        add(f1);
        add(l2);
        add(f2);
        add(l3);
        add(f3);
        add(l4);
        add(f4);
        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = f1.getText();
        String email = f2.getText();
        String password = f3.getText();
        String phone = f4.getText();

        JOptionPane.showMessageDialog(this,
                "Name: " + name + "\nEmail: " + email + "\nPassword: " + password + "\nPhone: " + phone);
    }

    public static void main(String[] args) {
        new Field();
    }
}
