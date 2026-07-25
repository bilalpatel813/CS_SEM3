package JAVA_practical.pract5;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Demo");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, SYCS!");
        label.setBounds(50,50,200,30);

        frame.setLayout(null);
        frame.add(label);

        frame.setVisible(true);
    }
}
