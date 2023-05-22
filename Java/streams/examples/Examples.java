package streams.examples;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Examples {
    static Stream<Double> fromArray = Stream.generate(Math::random);

    public static void main(String[] args) {
//        fromArray.limit(100).forEach(System.out::println);
//        Optional<Object> minEmpty = Stream.empty().min((s1, s2) -> 0);
//        System.out.println(minEmpty.isEmpty());
//        collectStrings();
//        ex1();
//        ex3();
        ex4();
    }

    private static void collectStrings() {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::equals
        );
        System.out.println(word);
    }

    private static void ex1() {
        Stream.of("Toby", "Anna", "Leroy", "Alex")
                .filter(s -> s.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::print);
    }

    private static void ex3() {
        var ohMy = Stream.of("lions", "tigers", "bears", "12345");
        var map = ohMy.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2)
        );

        System.out.println(map);
    }

    private static void ex4() {
        System.out.print(
                Stream.iterate(1, x -> ++x)
                        .limit(5)
                        .map(x -> "" + x)
                        .collect(Collectors.joining())
        );
    }

    private static void ex5() {
        Stream<Integer> s = Stream.of(1);
//        IntStream is = s.boxed(); - compiler error ()
        DoubleStream ds = s.mapToDouble(x -> x);
        IntStream s2 = ds.mapToInt(x -> (int) x);
    }
}
