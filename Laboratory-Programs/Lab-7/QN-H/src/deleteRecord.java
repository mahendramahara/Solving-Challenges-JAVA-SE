import java.sql.*;

public class deleteRecord {
    public static void main(String[] args) {
        try {
            // step 2. Load and Register MySQL Driver
            Class.forName("com.mysql.jdbc.Driver");
            // Step 3. Create and Establish tyhe Connection to mySQL
            String url = "jdbc:mysql://localhost/company";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            // Step 4. Create statement
            Statement stmt = conn.createStatement();
            // Step 5. Create and Execute SQL Command
            String deleteTable = "DELETE FROM employee WHERE SN = 3 ";
            int result = stmt.executeUpdate(deleteTable);
            // Step 6. Process for check the executed or not
            if (result > 0) {
                System.out.println("Record Deleted successfully....");
            } else {
                System.out.println("Error while deleting database....");
                System.out.println("Or Database already deleted");
            }
            // Step 7. Closing connection and other resources
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
