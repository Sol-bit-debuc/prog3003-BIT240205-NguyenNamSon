package ExTwo;
import java.util.*;
import java.util.concurrent.CompletableFuture;

class Student {
String id;
String name;
double gpa;
    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', gpa=" + gpa + "}";
    }
}
public class Main{
    public static double calculateAverageGpa(List<Student> students) {
        return students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("1", "ABC", 3.5));
        students.add(new Student("2", "foasdj", 3.2));
        students.add(new Student("3", "Cug", 2.8));
        CompletableFuture<Double> future =
                CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(1000);
                        return calculateAverageGpa(students);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });
        future.thenAccept(avg ->
                System.out.println("Điểm tbinh: " + avg)
        ).exceptionally(ex -> {
            System.out.println("lỗi " + ex.getMessage());
            return null;
        });
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
}
  


