import javax.accessibility.Accessible;
import javax.swing.*;

public class Options extends JComponent implements Accessible {

    Options() {

        JOptionPane.showMessageDialog(null, "Hello");

    }

    public static void main(String[] args) {
        new Options();

    }
}
