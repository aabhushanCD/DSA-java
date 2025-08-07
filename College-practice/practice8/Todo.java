import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Todo extends JFrame implements ActionListener {

    JButton Add, Delete;
    JTextField text;
    JTextArea textArea;
    GridBagConstraints c = new GridBagConstraints();

    public Todo() {

        setLayout(new GridBagLayout());
        setSize(1080, 720);

        text = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;

        add(text, c);

        Add = new JButton("Add");
        Add.addActionListener(this);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        add(Add, c);

        textArea = new JTextArea();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;
        add(textArea, c);

        Delete = new JButton("Delete");
        Delete.addActionListener(this);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;

        add(Delete, c);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 1));

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == Add) {
            String input = text.getText();

            if (!input.isEmpty()) {
                textArea.append(" - " + input + "\n");
                text.setText("");
            }
        }
        if (event.getSource() == Delete) {
            textArea.setText("");
        }
    }

    public static void main(String[] args) {
        new Todo();
    }
}