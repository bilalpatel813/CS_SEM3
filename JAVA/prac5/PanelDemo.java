package JAVA_practical.pract5;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JPanel panel = new JPanel();
        frame.add(panel);
        
        frame.setVisible(true);
    }
}
