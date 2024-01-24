import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcome extends JFrame {

    public welcome() {
        setTitle("Index Welcome Page");
        setSize(400, 200);

        // Create a JPanel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create a JLabel for the welcome message
        JLabel welcomeLabel = new JLabel("Welcome to My Next Page!");
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // Create a JButton to start the application
        JButton startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your code here to start the main part of your application
                JOptionPane.showMessageDialog(null, "Starting the application...");
            }
        });

        // Add the components to the panel
        panel.add(welcomeLabel, BorderLayout.CENTER);
        panel.add(startButton, BorderLayout.SOUTH);

        // Add the panel to the frame
        add(panel);

        // Center the frame on the screen
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                welcome welcomePage = new welcome();
                welcomePage.setVisible(true);
            }
        });
    }
}
