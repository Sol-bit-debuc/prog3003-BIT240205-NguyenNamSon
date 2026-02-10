package ExThree;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(4)); 
        System.out.println(isEven.test(7));
    }
}