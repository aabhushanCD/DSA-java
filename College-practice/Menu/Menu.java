
import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("A Menu");
        JMenuItem i = new JMenuItem("menu2");
        menu.add(i);
        menuBar.add(menu);

        JMenuItem menuItem = new JMenuItem("Both text and Icon", new ImageIcon("download.png"));
        menu.add(menuItem);

        frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setVisible(true);

    }

}
