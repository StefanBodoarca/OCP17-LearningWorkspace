package ch13_concurrency;

import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {
        ex2();
    }

    public static void ex1() {
        System.out.println(
                List.of(1,2,3,4,5).parallelStream().skip(3).limit(2).findFirst().get()
        );
    }

    public static void ex2() {
        System.out.println(
                List.of('w', 'o', 'l', 'f').stream().unordered().parallel().reduce("", (s1, c) -> s1 + c, (s2, s3) -> s2 + s3)
        );
    }
}
