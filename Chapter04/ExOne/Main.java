package ExOne;

public class Main{
    public static void main(String[] args) {
        CongThuc add = (a,b)-> a+b;
        CongThuc subtract = (a,b)-> a-b;
        CongThuc multiply= (a,b)->a*b;
        CongThuc divide= (a,b)-> a/b;
        
        System.out.println("3+6="+ add.compute(3,6));
        System.out.println("3-6="+ subtract.compute(3,6));
        System.out.println("3*6="+ multiply.compute(3,6));
        System.out.println("6/3="+ divide.compute(6,3));
        
    }
}