package ch14_io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TestQuestions {
    public static void main(String[] args) throws IOException {
        q8(Path.of("Java/ch14_io/fox/food-schedule.csv"));
    }

    public static void q8(Path path) throws IOException {
        Files.lines(path)
                .flatMap(p -> Stream.of(p.split(",")))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static void q14() throws IOException {
        var p1 = Path.of("/zoo/./bear", "");
        p1.toRealPath();
    }

}
