package review.ch14;

import java.io.Console;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

class InteractingWithNio2Paths {
    public static void main(String[] args) {

    }

    public static void testSubpath() {
        final String str = "1234";
        System.out.println(str.substring(1, 1));

        final Path path = Path.of("/part1/part2/part3");
        System.out.println(path.subpath(1, 2));
    }

    public static void testSwitchExpression() {
        final String str = "WINTER";
        var val = switch (str) {
            case "SUMMER" -> {yield 1.0f;}
            case "AUTUMN" -> { System.out.println("toamna"); yield 1234; }
            default -> { yield "4567"; }
        };
    }

    public static void checkIncrement() {
        System.out.println(1 / 2);
    }


}

public class Main {

    public static void checkConsole() {
        Console ioConsole = System.console();
        String line;
        if (ioConsole != null) {
            System.out.println("Console available.");
            PrintWriter writer = ioConsole.writer();
            if ((line = ioConsole.readLine()) !=  null) {
                writer.append(line);
                writer.flush();
            }
        }
    }

    public static void checkMap() {
        final Map<Integer, String>  map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(1, "d");
        System.out.println(map);
    }

    public static void main(String[] args) {
        Path p1 = FileSystems.getDefault().getPath("downloads");
        Path p2 = p1.toAbsolutePath();
        System.out.println(p2);

        checkMap();
    }
}
