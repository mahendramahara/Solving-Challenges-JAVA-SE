import javax.swing.*;
import java.awt.*;

public class QN_A extends JFrame {
    public QN_A() {
        setTitle("Layout Manager Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panels and components
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("East"), BorderLayout.EAST);
        borderPanel.add(new JButton("West"), BorderLayout.WEST);
        borderPanel.add(new JButton("Center"), BorderLayout.CENTER);

        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));

        JPanel gridPanel = new JPanel(new GridLayout(2, 2));
        gridPanel.add(new JButton("Button 1"));
        gridPanel.add(new JButton("Button 2"));
        gridPanel.add(new JButton("Button 3"));
        gridPanel.add(new JButton("Button 4"));

        JPanel cardPanel = new JPanel(new CardLayout());
        cardPanel.add(new JButton("Card 1"), "Card1");
        cardPanel.add(new JButton("Card 2"), "Card2");

        JPanel gridBagPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        gridBagPanel.add(new JButton("Button 1"), c);
        gridBagPanel.add(new JButton("Button 2"), c);

        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        boxPanel.add(new JButton("Button 1"));
        boxPanel.add(new JButton("Button 2"));

        // Add panels to the frame
        add(borderPanel, BorderLayout.NORTH);
        add(flowPanel, BorderLayout.CENTER);
        add(gridPanel, BorderLayout.SOUTH);
        add(cardPanel, BorderLayout.EAST);
        add(gridBagPanel, BorderLayout.WEST);
        add(boxPanel, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new QN_A();
    }
}
