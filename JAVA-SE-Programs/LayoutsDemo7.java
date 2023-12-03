// Title: Demonstration of Different Layouts in Java GUI

import javax.swing.*;
import java.awt.*;

public class LayoutsDemo7 {
    public static void main(String[] args) {
        // Creating a JFrame
        JFrame frame = new JFrame("Layouts Demo");

        // Creating a JPanel
        JPanel panel = new JPanel();

        // Setting SpringLayout
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);

        // Creating buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Adding buttons to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Set constraints for button1
        layout.putConstraint(SpringLayout.WEST, button1, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, button1, 5, SpringLayout.NORTH, panel);

        // Set constraints for button2
        layout.putConstraint(SpringLayout.WEST, button2, 5, SpringLayout.EAST, button1);
        layout.putConstraint(SpringLayout.NORTH, button2, 5, SpringLayout.NORTH, panel);

        // Set constraints for button3
        layout.putConstraint(SpringLayout.WEST, button3, 5, SpringLayout.EAST, button2);
        layout.putConstraint(SpringLayout.NORTH, button3, 5, SpringLayout.NORTH, panel);

        // Adding panel to the frame
        frame.add(panel);

        // Setting frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// © Mahendra Mahara 2023
