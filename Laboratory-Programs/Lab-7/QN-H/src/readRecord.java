import java.sql.*;

public class readRecord {
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
            String selectTable = "SELECT * FROM employee;";
            ResultSet rs = stmt.executeQuery(selectTable);
            // Step 6. Process for check the executed or not
            if (rs.next()) {
                System.out.println("SN: \t      Employee ID: \tEmployee Name: \t        Salary: \t    Department:");
                do {
                    int SN = rs.getInt(1);
                    String eID = rs.getString(2);
                    String eName = rs.getString(3);
                    Double salary = rs.getDouble(4);
                    String department = rs.getString(5);
                    System.out.println(SN + "\t\t" + eID + "\t\t" + eName + "\t\t" + salary + "\t\t" + department);
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
