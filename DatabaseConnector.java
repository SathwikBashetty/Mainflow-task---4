import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/test"; // Change 'test' to your actual database name
    private static final String USER = "root"; // Your MySQL username
    private static final String PASSWORD = "Sathwik@7"; // Your MySQL password

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load the MySQL JDBC driver
            connection = DriverManager.getConnection(URL, USER, PASSWORD); // Establish connection
            System.out.println("Connected to MySQL database successfully!");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Database connection error: " + e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        getConnection(); // Test connection
    }
}
