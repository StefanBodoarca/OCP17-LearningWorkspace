package review.ch1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface Test {
    boolean test(String str);
}

class Palindrom {
    public static int of(int number) {
        int n = 0;
        while(number / 10 != 0) {
            n = (n * 10) + number % 10;
            number /= 10;
        }
        return (n * 10) + number % 10;
    }

    public static List<String> of(int... numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .map(Palindrom::integerToStringReversed)
                .collect(Collectors.toList());
    }

    private static String integerToStringReversed(Integer n) {
        return new StringBuilder(String.valueOf(n)).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(Palindrom.of(765468976));

        System.out.println("second version");
        System.out.println(Palindrom.of(1234, 5436, 765432345, 31245));
    }
}

public class Main {

    public static void f1() {
        Test t = (var s) -> true;
        System.out.println(t.test("str"));

        int p = 5;
        int Public = 9;
    }
    public static void main(String[] args) {
        f1();
    }
}
