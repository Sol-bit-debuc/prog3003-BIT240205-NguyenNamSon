package ExThree;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        CompletableFuture.supplyAsync(() -> {
            return Arrays.asList(1, 2, 5, 3, 100);
        })
        .thenApply(list -> {
            return list.stream()
                    .filter(n -> n % 2 != 0)
                    .sorted()
                    .collect(Collectors.toList());
        })
        .thenApply(result -> {
            return "Kết quả là: " + result;
        })
        .thenAccept(System.out::println);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
