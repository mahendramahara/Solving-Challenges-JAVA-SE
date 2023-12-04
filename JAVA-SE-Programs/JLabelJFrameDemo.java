// Title: Demonstration of JLabel and JFrame in Java GUI

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelJFrameDemo {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JLabel and JFrame Demo");

        // Create a JLabel
        JLabel label = new JLabel("Hello, World!");
        
        // Add the label to the frame
        frame.add(label);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// © Mahendra Mahara 2023
