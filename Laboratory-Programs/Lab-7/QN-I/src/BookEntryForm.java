import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class BookEntryForm extends JFrame {
    private JTextField idField, nameField, authorField, publicationField, priceField;
    private JButton insertButton, updateButton, deleteButton, viewButton;

    private Connection connection;
    private Statement statement;

    public BookEntryForm() {
        initializeUI();
        initializeDatabase();
    }

    private void initializeUI() {
        setTitle("Book Entry Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        idField = new JTextField(10);
        nameField = new JTextField(20);
        authorField = new JTextField(20);
        publicationField = new JTextField(20);
        priceField = new JTextField(10);

        insertButton = new JButton("Insert");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        viewButton = new JButton("View");

        JPanel panel = new JPanel();
        panel.add(new JLabel("ID:"));
        panel.add(idField);
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Author:"));
        panel.add(authorField);
        panel.add(new JLabel("Publication:"));
        panel.add(publicationField);
        panel.add(new JLabel("Price:"));
        panel.add(priceField);
        panel.add(insertButton);
        panel.add(updateButton);
        panel.add(deleteButton);
        panel.add(viewButton);

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertRecord();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateRecord();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteRecord();
            }
        });

        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewRecords();
            }
        });

        add(panel);
        setVisible(true);
    }

    private void initializeDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/bookdetails";
            String user = "root";
            String password = "";

            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private void insertRecord() {
        try {
            String id = idField.getText();
            String name = nameField.getText();
            String author = authorField.getText();
            String publication = publicationField.getText();
            double price = Double.parseDouble(priceField.getText());

            String query = "INSERT INTO books VALUES ('" + id + "', '" + name + "', '" + author + "', '" + publication
                    + "', " + price + ")";
            statement.executeUpdate(query);

            JOptionPane.showMessageDialog(this, "Record inserted successfully!");

        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting record!");
        }
    }

    private void updateRecord() {
        try {
            String id = idField.getText();
            String name = nameField.getText();
            String author = authorField.getText();
            String publication = publicationField.getText();
            double price = Double.parseDouble(priceField.getText());

            String query = "UPDATE books SET name='" + name + "', author='" + author + "', publication='" + publication
                    + "', price=" + price + " WHERE ID='" + id + "'";
            statement.executeUpdate(query);

            JOptionPane.showMessageDialog(this, "Record updated successfully!");

        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating record!");
        }
    }

    private void deleteRecord() {
        try {
            String id = idField.getText();
            String query = "DELETE FROM books WHERE id='" + id + "'";
            statement.executeUpdate(query);

            JOptionPane.showMessageDialog(this, "Record deleted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting record!");
        }
    }

    private void viewRecords() {
        try {
            String query = "SELECT * FROM books";
            ResultSet resultSet = statement.executeQuery(query);

            StringBuilder result = new StringBuilder("ID\tName\tAuthor\tPublication\tPrice\n");
            while (resultSet.next()) {
                result.append(resultSet.getString("id")).append("\t\t")
                        .append(resultSet.getString("name")).append("\t\t")
                        .append(resultSet.getString("author")).append("\t\t")
                        .append(resultSet.getString("publication")).append("\t\t")
                        .append(resultSet.getDouble("price")).append("\n");
            }

            JOptionPane.showMessageDialog(this, result.toString(), "Book Records", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error viewing records!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookEntryForm();
            }
        });
    }
}
