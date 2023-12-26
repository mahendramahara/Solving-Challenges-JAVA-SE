// Title: Demonstration of Different Layouts in Java GUI

import javax.swing.*;
import java.awt.*;

public class LayoutsDemo4 {
    public static void main(String[] args) {
        // Creating a JFrame
        JFrame frame = new JFrame("Layouts Demo");

        // Creating a JPanel
        JPanel panel = new JPanel();

        // Setting BoxLayout
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));

        // Adding panel to the frame
        frame.add(panel);

        // Setting frame properties
        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// © Mahendra Mahara 2023
