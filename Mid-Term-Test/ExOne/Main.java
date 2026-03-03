package ExOne;
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
class StudentManager<T> {
    private List<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public List<T> getAll() {
        return data;
    }
}
public class Main {
    public static void main(String[] args) {

        StudentManager<Student> manager = new StudentManager<>();

        manager.add(new Student("1", "ABC", 3.5));
        manager.add(new Student("2", "foasdj", 3.2));
        manager.add(new Student("3", "asdf", 2.8));

        for (Student hs : manager.getAll()) {
            System.out.println(hs);
        }
    }
}