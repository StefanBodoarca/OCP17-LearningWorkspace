package ch14_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {
        readInputLine();

        Files.delete(Path.of("Java/ch14_io"));
    }

    public static void io() {
        var file = new File("Java/ch14_io/data");
        if(file.exists()) {
            System.out.println("here");

            if(file.isDirectory()) {
                Arrays.stream(Objects.requireNonNull(file.listFiles())).forEach((f) -> System.out.println(f.getName()));
            }
        }
    }

    public static void readInputLine() {
        try {
            var reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("You entered: " + reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("second finally");
        }

        var inputStreamReader = new InputStreamReader(System.in);
        try {
            System.out.println("+" + inputStreamReader.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void nio() {

    }

    public static void tTest() {
        Test t = new Test();
        System.out.println(t.shape);
    }


}

class Test {
    public static final String shape = "shape";

    public Test() {
        System.out.println(this.shape);
    }
}



