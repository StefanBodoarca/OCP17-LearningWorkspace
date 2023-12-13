package review.ch10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ch10 {
    public static void main(String[] args) {
        List.of(1, 2, 3).forEach((value) -> System.out.print(value + " "));
        Runnable reverseOrder = Comparator::reverseOrder;
        Stream.of(4, 2, 1, 3).sorted(Comparator.reverseOrder()); //you call the method and return a Comparator
        //Stream.of(4, 2, 1, 3).sorted(Comparator::reverseOrder); //you just refer the method, not returning a comparator

        IntSummaryStatistics intSummaryStatistics = IntStream.range(1, 100).summaryStatistics();
        System.out.println(intSummaryStatistics);

        IntStream s = Stream.of("ab", "cccc", "d").mapToInt(String::length);

        Optional.of(4)
                .map(String::valueOf)
                .filter(n -> n.length() == 3)
                .ifPresent(System.out::println);


        System.out.println(Stream.of(1, 2, 3)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}

class ReviewQuestions {
    public static void main(String[] args) {
        q16();
    }

    public static void q1() {
        var stream = Stream.iterate("", (s) -> s + "1");
        stream.limit(4).map(x -> x + "2").forEach(System.out::print);
    }

    public static void q5() {
        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
    }

    public static void q8() {
        var is = IntStream.empty().findAny();
        
        class Calculator {
            public int increment(int x) {
                x++;
                return x;
            }
        }

        var t = new Calculator();
        var x = t.increment(10);
        System.out.println(x);

    }

    public static void q13() {
        List<Integer> x1 = List.of(1, 2, 3);
        List<Integer> x2 = List.of(4, 5, 6);
        List<Integer> x3 = List.of();
        Stream.of(x1, x2, x3)
                .flatMap(Collection::stream)
                .map(x -> x + 1)
                .forEach(System.out::print);
    }

    public static void q15() {
        Stream<String> stream = Stream.of("aa", "bbb", "ccc");
        Map<?, ?> map = stream.collect(
                Collectors.groupingBy(String::length, Collectors.toList())
        );

        map.forEach((k, v) -> System.out.println("k = " + k + " v = " + v));
    }

    public static void q16() {

        var result = Stream.generate(() -> "")
                .limit(10)
                .filter((s) -> !s.isEmpty())
                .collect(Collectors.groupingBy(k -> k))
                .entrySet()
                .stream()        //here should be an empty Stream
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(s->s));

        System.out.println(result);

    }
}

class E {

    int a = 5;
    public static void main(String[] args) {
        new E().checkList();
    }

    public static void e1() {
        final List<String> zero = List.of();
        final List<String> one = List.of("one");
        final List<String> two = List.of("two", "three");
        final Stream<List<String>> lists = Stream.of(zero, one, two);

        lists.flatMap(Collection::stream).limit(2).forEach(System.out::print);
    }

    private void redeclareA(int b) { int a = 7; }

    void checkList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(42));
        List objects = numbers; // DOES NOT COMPILE 7:
        objects.add("forty two");
        for(Integer o : numbers) {
            System.out.println(o);
        }

        List<Exception> exceptions = new ArrayList<>();
        exceptions.add(new Exception());
    }

}

class Wheel {}
class CartWheel extends Wheel {}

class Roller<E extends Wheel> {
    public void roll(E e) {}
}

class MyThread {
    public static void main(String[] args) {
        var t = new Thread(System.out::println);
        t.start();
        t.interrupt();
    }
}

class Watch {
    private String getType() {
        return "watch";
    }

    public String getName(String suffix) {
        return getType() + " " + suffix;
    }

    public static void main(String[] args) {
        Watch watch = new Watch();
        Watch smartWatch = new SmartWatch();
        System.out.println(watch.getName(","));
        System.out.println(smartWatch.getName(""));

        System.out.println(~3);
    }
}

/**
 *
 */
class SmartWatch extends Watch {
    short p = 10;
    private String getType() {
        return "smart watch";
    }

    public String getName() {
        return getType() + " ";
    }
}
