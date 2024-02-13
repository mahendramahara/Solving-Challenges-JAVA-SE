import java.sql.*;

public class createRecord {
    public static void main(String[] args) {
        // For creating database
        try {
            // step 2. Load and Register MySQL Driver
            Class.forName("com.mysql.jdbc.Driver");
            // Step 3. Create and Establish the Connection to MySQL
            String url = "jdbc:mysql://localhost";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            // Step 4. Create statement
            Statement stmt = conn.createStatement();
            // Step 5. Create and Execute SQL Command
            String createDB = "CREATE DATABASE IF NOT EXISTS company;"; // Added IF NOT EXISTS
            int resultCD = stmt.executeUpdate(createDB);
            // Step 6. Process for check the executed or not
            if (resultCD > 0) {
                System.out.println("Database created successfully....");
            } else {
                System.out.println("Error while creating database....");
                System.out.println("Or Database already created");
            }
            // Step 7. Closing connection and other resources
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // For creating table
        try {
            // step 2. Load and Register MySQL Driver
            Class.forName("com.mysql.jdbc.Driver");
            // Step 3. Create and Establish the Connection to MySQL
            String url = "jdbc:mysql://localhost/company";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            // Step 4. Create statement
            Statement stmt = conn.createStatement();
            // Step 5. Create and Execute SQL Command
            String createTable = "CREATE TABLE IF NOT EXISTS employee (SN INT AUTO_INCREMENT UNIQUE, Eid VARCHAR(50) UNIQUE, Ename VARCHAR(100), Salary DECIMAL(10, 2), Department VARCHAR(255));";
            int resultCT = stmt.executeUpdate(createTable);
            // Step 6. Process for check the executed or not
            if (resultCT > 0) {
                System.out.println("Table created successfully....");
            } else {
                System.out.println("Error while creating table....");
                System.out.println("Or Table already created...");
            }
            // Step 7. Closing connection and other resources
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // For storing record in the database
        try {
            // step 2. Load and Register MySQL Driver
            Class.forName("com.mysql.jdbc.Driver");
            // Step 3. Create and Establish the Connection to MySQL
            String url = "jdbc:mysql://localhost/company";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            // Step 4. Create statement
            Statement stmt = conn.createStatement();
            // Step 5. Create and Execute SQL Command
            String insertTable = "INSERT INTO employee VALUES(4, 'dvdi37', 'Kamal Basnet',28000, 'IT'), (5, 'ashu41', 'Madhab Kharel', 21000, 'BSW'), (3, 'astl12', 'Bhim Tamang', 23000, 'BBA');";
            int resultID = stmt.executeUpdate(insertTable);
            // Step 6. Process for check the executed or not
            if (resultID > 0) {
                System.out.println("Record Inserted successfully....");
            } else {
                System.out.println("Error while inserting record....");
            }
            // Step 7. Closing connection and other resources
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
