
import javax.swing.*;
import java.awt.event.*;

public class MouseAdapterEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseAdapter Demo");
        JLabel label = new JLabel("Click Me", SwingConstants.CENTER);

        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(frame, "Label Clicked!");
            }
            public void mouseEntered(MouseEvent e){
                label.setText("Mouse Inside");
            }
            public void mouseExited(MouseEvent e){
                label.setText("Mouse Outside");
            }
        });

        frame.add(label);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }    
}
