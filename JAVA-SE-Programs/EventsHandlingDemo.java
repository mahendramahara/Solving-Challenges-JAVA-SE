// Title: Events Handling (Keyboard, Mouse) using Null Layout in Java GUI

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventsHandlingDemo {
    public static void main(String[] args) {
        // Creating a JFrame
        JFrame frame = new JFrame("Events Handling Demo");

        // Creating a JPanel with null layout
        JPanel panel = new JPanel(null);

        // Creating a JLabel to display keyboard events
        JLabel keyboardLabel = new JLabel("Press a key");

        // Setting position for the keyboardLabel
        keyboardLabel.setBounds(50, 50, 150, 30);

        // Adding keyboardLabel to the panel
        panel.add(keyboardLabel);

        // Adding KeyListener to the panel
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                keyboardLabel.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                keyboardLabel.setText("Press a key");
            }
        });

        // Making panel focusable to receive key events
        panel.setFocusable(true);
        panel.requestFocusInWindow();

        // Creating a JLabel to display mouse events
        JLabel mouseLabel = new JLabel("Move the mouse");

        // Setting position for the mouseLabel
        mouseLabel.setBounds(50, 100, 150, 30);

        // Adding mouseLabel to the panel
        panel.add(mouseLabel);

        // Adding MouseListener to the panel
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseLabel.setText("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseLabel.setText("Move the mouse");
            }
        });

        // Adding panel to the frame
        frame.add(panel);

        // Setting frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// © Mahendra Mahara 2023
