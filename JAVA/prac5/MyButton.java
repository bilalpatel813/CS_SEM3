package JAVA_practical.pract5;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButton Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click me");
        frame.add(button);
        frame.setVisible(true);
    }
}
