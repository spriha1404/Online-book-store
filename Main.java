import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Online Book Store Management System");

        // Initialize database connection
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "user", "password")) {
            if (conn != null) {
                System.out.println("Connected to the database!");
            }
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database!");
            e.printStackTrace();
        }
    }
}
