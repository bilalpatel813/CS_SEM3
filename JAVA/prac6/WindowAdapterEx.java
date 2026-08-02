
import javax.swing.*;
import java.awt.event.*;

public class WindowAdapterEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame("WindowAdapter Demo");
        frame.setSize(300,200);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(frame, 
                    "Are you sure you want to exit?",
                    "Confirm Exit",
                    JOptionPane.YES_NO_OPTION
                );

                if (confirm == JOptionPane.YES_OPTION){
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }

            }            
            public void windowOpened(WindowEvent e){
                System.out.println("Window opened!");
            }
        });

        frame.setVisible(true);
    }
}
