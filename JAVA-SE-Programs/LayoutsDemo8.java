// Title: Demonstration of Null Layout in Java GUI

import javax.swing.*;
import java.awt.*;

public class LayoutsDemo8 {
    public static void main(String[] args) {
        // Creating a JFrame
        JFrame frame = new JFrame("Null Layout Demo");

        // Creating a JPanel with null layout
        JPanel panel = new JPanel(null);

        // Creating buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Setting positions and sizes manually for buttons
        button1.setBounds(50, 50, 100, 30);
        button2.setBounds(200, 50, 100, 30);
        button3.setBounds(120, 120, 100, 30);

        // Adding buttons to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Adding panel to the frame
        frame.add(panel);

        // Setting frame properties
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// © Mahendra Mahara 2023
