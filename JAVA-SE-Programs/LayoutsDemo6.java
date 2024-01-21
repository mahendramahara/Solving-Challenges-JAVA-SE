// Title: Demonstration of Different Layouts in Java GUI

import javax.swing.*;
import java.awt.*;

public class LayoutsDemo6 {
    public static void main(String[] args) {
        // Creating a JFrame
        JFrame frame = new JFrame("Layouts Demo");

        // Creating a JPanel
        JPanel panel = new JPanel();

        // Setting GroupLayout
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        // Automatically create gaps between components
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Creating buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Adding components to GroupLayout
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addComponent(button1)
                .addComponent(button2)
                .addComponent(button3));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(button1)
                .addComponent(button2)
                .addComponent(button3));

        // Adding panel to the frame
        frame.add(panel);

        // Setting frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// © Mahendra Mahara 2023
