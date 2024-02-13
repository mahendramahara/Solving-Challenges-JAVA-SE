import java.sql.*;

public class updateRecord {
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
            String updateTable = "update employee set Eid='hi123', Ename='Mahendra Mahara' where SN=4";
            int result = stmt.executeUpdate(updateTable);
            // Step 6. Process for check the executed or not
            if (result > 0) {
                System.out.println("Record Updated successfully....");
            } else {
                System.out.println("Error while Updating database....");
                System.out.println("Or Database already Updated");
            }
            // Step 7. Closing connection and other resources
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
