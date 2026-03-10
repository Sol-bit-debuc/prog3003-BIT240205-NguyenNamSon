import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();

        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        System.out.println("Danh sách sau khi sắp xếp");
        for(String name : names){
            System.out.println(name);
        }

        System.out.println("\nPhần tử nhỏ nhất: " + names.first());
        System.out.println("Phần tử lớn nhất: " + names.last());
    }
}