package ExThree;
import java.util.*;
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
public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("1", "ABC", 3.5));
        students.add(new Student("2", "foasdj", 3.2));
        students.add(new Student("3", "Cug", 2.8));
        students.add(new Student("4", "fsakf",2.4));
        students.add(new Student("5","asdghgas",3.3));

        students.stream()
                .filter(x -> x.getGpa() >= 3.2)
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .forEach(System.out::println);
    }
}