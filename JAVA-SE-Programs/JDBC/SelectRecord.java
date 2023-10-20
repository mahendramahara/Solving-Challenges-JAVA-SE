
//Step 1. Import Required Packages
import java.sql.*;

public class SelectRecord {
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
            String selectTable = "SELECT * FROM book;";
            ResultSet rs = stmt.executeQuery(selectTable);
            // Step 6. Process for check the executed or not
            if (rs.next()) {
                System.out.println("ID\tName\tPrice");
                do {
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    float price = rs.getFloat(3);
                    System.out.println(id + "\t" + name + "\t" + price);
                } while (rs.next());
            } else {
                System.out.println("Record Not Found....");
            }
            // Step 7. Closing connection and other resources
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
