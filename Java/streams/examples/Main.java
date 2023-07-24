package streams.examples;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        maxInStream();
    }

    public static void maxInStream() {
        Stream.of(1, 20, 7, 18, -9, 28)
                .max(Integer::compareTo)
                .ifPresent(System.out::println);
    }
}
