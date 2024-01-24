import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//step 1. Import sql pacakge
import java.sql.*;

public class login implements ActionListener {

    static JLabel usernameLabel, passwordLabel;
    static JTextField txtUsername, txtPassword;
    static JButton btnLogin, btnCancel;
    JFrame frame = null;

    public login() {
        frame = new JFrame("Simple Login Form");
        JPanel panel = new JPanel();
        frame.setLayout(new FlowLayout());
        panel.setLayout(new GridLayout(3, 2));
        frame.setSize(400, 150);

        // Declaring all the component line by line
        usernameLabel = new JLabel("Username: ");
        txtUsername = new JTextField();
        passwordLabel = new JLabel("Password: ");
        txtPassword = new JTextField();
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");

        // Adding all the above element to panel
        panel.add(usernameLabel);
        panel.add(txtUsername);
        panel.add(passwordLabel);
        panel.add(txtPassword);
        panel.add(btnLogin);
        panel.add(btnCancel);
        // Adding panel to frame
        frame.add(panel);

        // Adding event to login button
        btnLogin.addActionListener(this);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // Step 2. Load and Register MySQL Driver
            Class.forName("com.mysql.jdbc.Driver");
            // Step 3. Establish the connection
            String url = "jdbc:mysql://localhost:3306/logintriton";
            String username = "root";
            String password = "";
            conn = DriverManager.getConnection(url, username, password);
            // Step 4. Create the statement
            stmt = conn.createStatement();
            // Step 5. Create and Execute Query
            String user = txtUsername.getText();
            String pass = txtPassword.getText();

            String selectQuery = "SELECT * FROM logintbl where username='" + username + "' && password='" + password
                    + "' ";
            ResultSet rs = stmt.executeQuery(selectQuery);
            if (rs.next()) {
                btnLogin.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Create and show the second frame
                        frame.dispose();
                        welcome secondFrame = new welcome();
                        secondFrame.setVisible(true);
                    }
                });
            } else {
                JOptionPane.showMessageDialog(frame, "Wrong username or password...");
            }
            // Step 7. Closing the Connection
            stmt.close();
            conn.close();
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }

    public static void main(String[] args) {
        new login();
    }
}