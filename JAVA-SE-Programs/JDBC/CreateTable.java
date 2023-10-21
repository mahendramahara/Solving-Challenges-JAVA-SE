
//Step 1. Import Required Packages
import java.sql.*;

public class CreateTable {
    public static void main(String[] args) {
        try {
            // step 2. Load and Register MySQL Driver
            Class.forName("com.mysql.jdbc.Driver");
            // Step 3. Create and Establish tyhe Connection to mySQL
            String url = "jdbc:mysql://localhost/bookdetails";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            // Step 4. Create statement
            Statement stmt = conn.createStatement();
            // Step 5. Create and Execute SQL Command
            String createTable = "CREATE TABLE book(bid int primary key, bname varchar(50), price float)";
            int result = stmt.executeUpdate(createTable);
            // Step 6. Process for check the executed or not
            if (result > 0) {
                System.out.println("Table created successfully....");
            } else {
                System.out.println("Error while creating database....");
                System.out.println("Or Database already created");
            }
            // Step 7. Closing connection and other resources
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
