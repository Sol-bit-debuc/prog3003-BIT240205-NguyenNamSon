package ExOne;

import java.util.ArrayList;
import java.util.Scanner;

class Student {

    private String mssv;
    private String name;
    private double gpa;

    public Student(String mssv, String name, double gpa) {
        this.mssv = mssv;
        this.name = name;
        this.gpa = gpa;
    }

    public String getMssv() {
        return mssv;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "MSSV: " + mssv + ", Tên: " + name + ", GPA: " + gpa;
    }
}

public class Main {

    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm theo tên");
            System.out.println("4. Xóa theo MSSV");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    searchByName();
                    break;
                case 4:
                    deleteByMssv();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    private static void addStudent() {
        System.out.print("Nhập MSSV: ");
        String mssv = sc.nextLine();
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập GPA: ");
        double gpa = sc.nextDouble();
        sc.nextLine();
        students.add(new Student(mssv, name, gpa));
    }

    private static void showStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private static void searchByName() {
        System.out.print("Nhập tên cần tìm: ");
        String name = sc.nextLine();
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println(s);
            }
        }
    }

    private static void deleteByMssv() {
        System.out.print("Nhập MSSV cần xóa: ");
        String mssv = sc.nextLine();
        students.removeIf(s -> s.getMssv().equals(mssv));
    }
}
