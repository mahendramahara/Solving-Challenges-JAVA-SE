// Title: Demonstration of Adapter Classes in Java

import java.awt.event.*;

public class AdapterDemo {
    public static void main(String[] args) {
        // Creating a custom window
        CustomWindow window = new CustomWindow();
        window.addMouseListener(new CustomMouseAdapter());
        window.addKeyListener(new CustomKeyAdapter());
        window.display();
    }
}

class CustomWindow {
    public void addMouseListener(MouseAdapter adapter) {
        // Implementation to add MouseListener
        System.out.println("Mouse Adapter added to window");
    }

    public void addKeyListener(KeyAdapter adapter) {
        // Implementation to add KeyListener
        System.out.println("Key Adapter added to window");
    }

    public void display() {
        // Dummy method to display the window
        System.out.println("Window displayed");
    }
}

class CustomMouseAdapter extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }
}

class CustomKeyAdapter extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released");
    }
}

// © Mahendra Mahara 2023
