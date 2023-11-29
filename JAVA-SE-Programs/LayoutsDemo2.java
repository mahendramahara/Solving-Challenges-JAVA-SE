// Title: Demonstration of Different Layouts in Java GUI

import javax.swing.*;
import java.awt.*;

public class LayoutsDemo2 {
    public static void main(String[] args) {
        // Creating a JFrame
        JFrame frame = new JFrame("Layouts Demo");

        // Creating a JPanel
        JPanel panel = new JPanel();

        // Setting GridLayout
        panel.setLayout(new GridLayout(3, 2));
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        panel.add(new JButton("Button 6"));

        // Adding panel to the frame
        frame.add(panel);

        // Setting frame properties
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// © Mahendra Mahara 2023
