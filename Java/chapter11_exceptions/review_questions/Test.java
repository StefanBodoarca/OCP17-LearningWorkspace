package chapter11_exceptions.review_questions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Test {
    public static void main(String[] args) throws IOException {
        q9();
    }

    public static void whatHappensNext() throws IOException {
        System.out.println("it's ok");
        throw new IllegalArgumentException();
    }

    public static void tryAgain(String s) throws FileNotFoundException {
        try(FileReader r = null; FileReader p = new FileReader("")) {
            System.out.println("x");
            throw new IllegalArgumentException();
        } catch(Exception x) {
            System.out.println("A");
            throw new FileNotFoundException();
        } finally {
            System.out.println("o");
        }
    }

    public static void throwPeach() {
        var huey = (String) null;
        Integer dewey = null;
        Object louie = null;
        if (louie == huey.substring(dewey.intValue())) {
            System.out.println("Quack");
        }
    }

    public static void q9() {
        String pattern = "#,###,000.0";
        var message = DoubleStream.of(5.21, 8.49, 1234)
                .mapToObj(v -> new DecimalFormat(pattern).format(v))
                .collect(Collectors.joining("> <"));
        System.out.println("<" + message + ">");
    }
}

class Peach extends Throwable {

}
