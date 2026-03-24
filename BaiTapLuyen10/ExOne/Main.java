package ExOne;

import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(11, "Ashley");
        employees.put(49, "Leon");
        employees.put(44, "Ada");

        System.out.println("Nhan vien ID 102: " + employees.get(102));

        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
        }

        System.out.println("Danh sach nhan vien: " + employees);
    }
}
