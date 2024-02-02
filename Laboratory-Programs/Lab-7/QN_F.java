import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QN_F extends JFrame {

    private JTextField inputField;
    private JLabel outputLabel;

    public QN_F() {
        setTitle("Factorial and Cube Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new FlowLayout());

        inputField = new JTextField(10);
        JButton resultButton = new JButton("Result");

        outputLabel = new JLabel("Result will be displayed here");

        resultButton.addMouseListener(new CustomMouseAdapter());

        panel.add(new JLabel("Enter a number:"));
        panel.add(inputField);
        panel.add(resultButton);
        panel.add(outputLabel);

        add(panel);
    }

    private class CustomMouseAdapter extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            int number = Integer.parseInt(inputField.getText());
            if (e.getButton() == MouseEvent.BUTTON1) { // Left mouse button (Click)
                long factorialResult = calculateFactorial(number);
                outputLabel.setText("Factorial: " + factorialResult);
            } else if (e.getButton() == MouseEvent.BUTTON3) { // Right mouse button (Release)
                long cubeResult = calculateCube(number);
                outputLabel.setText("Cube: " + cubeResult);
            }
        }
    }

    private long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    private long calculateCube(int n) {
        return (long) Math.pow(n, 3);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new QN_F().setVisible(true);
        });
    }
}
