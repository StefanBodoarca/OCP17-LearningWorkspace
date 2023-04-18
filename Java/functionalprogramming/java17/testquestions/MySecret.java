package functionalprogramming.java17.testquestions;

import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

interface Secret {
    String magic(double d);
}
public class MySecret {
    public static void main(String[] args) {
        printSecret(e -> "Poof");

        StringBuilder s = new StringBuilder();
        System.out.println(s.isEmpty());

        //
        Set<?> set = Set.of("lion", "tiger", "bear");
        var sCopy = Set.copyOf(set);
        Consumer<Object> consumer = System.out::println;
        sCopy.forEach(consumer);

    }

    private static void printSecret(Secret secret) {
        System.out.println(secret.magic(1.1));
    }

    public void method() {
        x((var x) -> {}, (var x, var y) -> false);
    }

    public void x(Consumer<String> x, BinaryOperator<Boolean> y) {

    }

    public void remove(List<Character> chars) {
        char end = 'z';
        chars = null;
        Predicate<Character> predicate = c -> {
            char start = 'a';
            return start <= c && c <= end;
        };

        char start = 'a';
    }
}

