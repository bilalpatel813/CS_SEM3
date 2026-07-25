package JAVA_practical.pract5;

import javax.swing.*;

public class MyWindow {
    public static void main(String[] args) {
        //Create a window
        JFrame frame = new JFrame("My first Window");
        

        frame.setSize(400, 300);
        
        //Close the app when X is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Show the window
        frame.setVisible(true
            
        );
    }
}
