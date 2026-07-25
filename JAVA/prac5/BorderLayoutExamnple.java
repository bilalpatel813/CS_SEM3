import javax.swing.*;
import java.awt.*;

public class BorderLayoutExamnple {
    public static void main(String[] args) {
        //create JFrame
        JFrame frame = new JFrame("borderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Create JPanel with BorderLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10)); // Horizontal and vertical


        // Add components to all regions
        panel.add(new JButton("North (Top)"), BorderLayout.NORTH);
        panel.add(new JButton("South (Buttom)"), BorderLayout.SOUTH);
        panel.add(new JButton("West (Left)"), BorderLayout.WEST);
        panel.add(new JButton("East (Right)"), BorderLayout.EAST);
        panel.add(new JButton("Centre (Main Area)"), BorderLayout.CENTER);
        frame.add(panel);
        frame.setVisible(true);

    }
}