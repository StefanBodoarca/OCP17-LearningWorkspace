package practice_tests.ch8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Television {

    private static final Lock myTurn = new ReentrantLock();
    public void watch() {
        if(myTurn.tryLock()) {
            System.out.println("TV Time");
            myTurn.unlock();
        }
    }
    public static void main(String[] args) throws Exception {
        var newTv = new Television();
        for (int i = 0; i < 3; i++) {
            new Thread(newTv::watch).start();
        }
        Thread.sleep(10 * 1000);
    }
}

class Main {
    public static void main(String[] args) {
        ex1();
    }

    public static void ex1() {
        var map = Stream.of("Sree", "Ken", "Kumar", "Ye", "Dan")
                .collect(
                        Collectors.groupingBy(
                                s -> s.length() >= 4
                        )
                );

        System.out.println(map);
    }

    public static void ex2() {
        var map = Stream.of("Sree", "Ken", "Kumar", "Ye", "Dan")
                .collect(
                        Collectors.groupingBy(
                                s -> s.length() >= 4
                        )
                );

        System.out.println(map);
    }

    public static void m1() {
        class Jacket {
            int insulate() {
                return 5;
            }
        }

        Jacket outfit = new Jacket() {

        };

    }
}

record Bee(boolean g, String s) {
    Bee {
        g = false;
        s = "" + 1;
    }
}

class X {
    static {
        System.out.println("static block");
        class InnerClass {

        }
    }
    static int P = 7;
    static class Y {
        private void checkAccess() {
            System.out.println(P);
        }
    }
    public static void main(String[] args) {
        String[] x1 = new String[] {"aa", "bb", "cc"};

        System.out.println("""
                   lol
                """);
    }
}

enum MyEnum {
    WINTER, SUMMER;

    static final MyEnum val = WINTER;


}

record TestRecord(int a) {

    @Override
    public int a() {
        return 17;
    }


    public int getA() {
        return 15;
    }
}



class Wrapper {
    public static void main(String[] args) {

        var map = new TreeMap<Integer, String>();
        map.put(1, null);
        map.put(2, "abc");

        System.out.println(map);
        map.put(1, "ret");
        map.put(4, "3");

        System.out.println(map);

        map.merge(4, "5", (k, v) -> null);

        System.out.println(map);

    }

    public static void check(boolean check) {
        final int answer;
        if(check) {
            answer = 1;
        } else {
            answer = 2;
        }

        int p = switch (answer) {
            case 1 -> {
                yield 5;
            }
            default -> throw new IllegalStateException("Unexpected value: " + answer);
        };

        for(int i = 0, j = 1; i < 9; i++);
    }

    public static void m() {
        var date = LocalDate.of(2022, 1, 20);
        var time = LocalTime.of(6, 15);
        var dateTime = LocalDateTime.of(date, time);
        var period = Period.ofMonths(1);
        System.out.println(date.plus(period)); // 2022–02–20
        System.out.println(dateTime.plus(period)); // 2022–02–20T06:15 9: System.out.println(time.plus(period));
    }

}

interface DoubleBass {
    default int getVolume() {
        return 0;
    }
}

interface BassGuitar {
    default int getVolume() {
        return -1;
    }
}

abstract class ElectricBass implements DoubleBass, BassGuitar {

    public int getVolume() {
        return 0;
    }
}

interface Instrument extends DoubleBass, BassGuitar {
     int getVolume();
}

interface TestParent {
    public static int p = 1;

    static void m1() {}

}

class TestInit implements TestParent{
    final int i;

    TestInit() {
        i = 1;
        System.out.println(this.p);
    }

    TestInit(int o) {
        this();
    }
}

interface TestI {
    private static void m1() {

    }

    private void m2() {

    }
}