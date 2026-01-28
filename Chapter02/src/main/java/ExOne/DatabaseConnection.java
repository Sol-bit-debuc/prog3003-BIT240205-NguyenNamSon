package ExOne;

public class DatabaseConnection {

    // 2. Biến static lưu instance duy nhất
    private static DatabaseConnection instance;

    // 1. Constructor private
    private DatabaseConnection() {
        System.out.println("Kết nối CSDL được tạo!");
    }

    // 3. Hàm trả về instance duy nhất
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Đang sử dụng kết nối database...");
    }
}
