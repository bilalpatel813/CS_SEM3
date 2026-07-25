package JAVA_practical.pract5;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;

public class Textfield {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,150);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(20);
        frame.add(textField);

        frame.setVisible(true);
    }
}
