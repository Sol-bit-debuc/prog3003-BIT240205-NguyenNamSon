package ExSix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int sum = Arrays.asList(1, 2, 3, 4, 5, 6).stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(sum); 
    }
}
