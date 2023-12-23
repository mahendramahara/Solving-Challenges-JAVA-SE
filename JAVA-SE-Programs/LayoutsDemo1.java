// Title: Demonstration of Different Layouts in Java GUI

import javax.swing.*;
import java.awt.*;

public class LayoutsDemo1 {
    public static void main(String[] args) {
        // Creating a JFrame
        JFrame frame = new JFrame("Layouts Demo");

        // Creating a JPanel
        JPanel panel = new JPanel();

        // Setting BorderLayout
        panel.setLayout(new BorderLayout());
        panel.add(new JButton("North"), BorderLayout.NORTH);
        panel.add(new JButton("South"), BorderLayout.SOUTH);
        panel.add(new JButton("East"), BorderLayout.EAST);
        panel.add(new JButton("West"), BorderLayout.WEST);
        panel.add(new JButton("Center"), BorderLayout.CENTER);

        // Adding panel to the frame
        frame.add(panel);

        // Setting frame properties
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// © Mahendra Mahara 2023
