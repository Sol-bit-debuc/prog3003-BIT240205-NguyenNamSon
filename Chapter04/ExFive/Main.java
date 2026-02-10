package ExFive;

import java.util.function.Supplier;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Supplier<Double> randomSupplier =
                () -> Math.random() * 100;

        Consumer<Double> printConsumer =
                num -> System.out.println("Số may mắn: " + num);

        Double number = randomSupplier.get();
        printConsumer.accept(number);
    }
}
