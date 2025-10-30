
import java.sql.*;
import java.util.Scanner;

public class BillManager {

    private static final String URL = "jdbc:postgresql://dpg-d41cqghr0fns73cb9h10-a.singapore-postgres.render.com:5432/theater_management_jnj5?sslmode=require";
    private static final String USER = "jimtrung";
    private static final String PASSWORD = "rYtBQcqdHeFrzGxo8XJXOMUQcVizOnd8";

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection conn = getConnection(); Scanner sc = new Scanner(System.in)) {
            System.out.println("✅ Kết nối PostgreSQL thành công!");

        } catch (SQLException e) {
            System.out.println("❌ Lỗi kết nối cơ sở dữ liệu!");
            e.printStackTrace();
        }
    }
}
