package ExTwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    static final String URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root";
    static final String PASSWORD = "Bhaocket!123";

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ID cần xóa: ");
        int id = sc.nextInt();

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            stmt = conn.createStatement();

            String sql = "DELETE FROM users WHERE id = " + id;

            int rows = stmt.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("Xóa user thành công!");
            } else {
                System.out.println("Không tìm thấy user để xóa");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}