package button;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {
    JMenuBar bar;
    JMenu file,tools;

    public Menu() {
        JFrame frame = new JFrame("Menu");

        bar = new JMenuBar();
        frame.setJMenuBar(bar);
        file= new JMenu("File");
        tools = new JMenu("Tools");
        bar.add(file);
        bar.add(tools);

        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem load = new JMenuItem("Load");
        file.add(open);
        file.add(save);
        file.add(exit);
        file.add(load);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Menu();
    }

}
