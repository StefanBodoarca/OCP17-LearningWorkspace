package TestsOCP2Java11.chapter1;

import java.util.List;
import java.util.function.Predicate;

public class Test {
}

class FlavorsEnum {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY;
        static final Flavors DEFAULT = STRAWBERRY;
    }

    public static void main(String[] args) {
        for (final var e : Flavors.values())
            System.out.print(e.ordinal() + " ");
    }
}

class Movie {
    private int butter = 5;

    private Movie() {
    }

    protected class Popcorn {
        private Popcorn() {
        }

        private void getSomething() {
        }

        public static final int butter = 10;

        public void startMovie() {
            System.out.println(butter);
        }
    }

    public static void main(String[] args) {
        var movie = new Movie();
        Movie.Popcorn in = new Movie().new Popcorn();
        in.startMovie();
    }
}

class IceCream {
    enum Flavors {
        CHOCOLATE, STRAWBERRY, VANILLA
    }

    public static void main(String[] args) {
        Flavors STRAWBERRY = Flavors.VANILLA;
        switch (STRAWBERRY) {
            case VANILLA:
                System.out.print("v");
            case CHOCOLATE:
                System.out.print("c");
            case STRAWBERRY:
                System.out.print("s");
                break;
            default:
                System.out.println("missing flavor");
        }
    }
}

class Ghost {
    public static void boo() {
        System.out.println("Not scared");
    }

    protected class Spirit {
        public void boo() {
            System.out.println("Booo!!!");
        }
    }

    public static void main(String... haunt) {
        var g = new Ghost().new Spirit() {
        };
        g.boo();
        new Ghost().boo();
        Ghost.boo();
    }
}

class Ostrich {
    private static int count;

    private interface Wild {
    }

    static class OstrichWrangler implements Wild {
        public int stampede() {
            return count;
        }
    }
}

interface CanWalk {
    default void walk() {
        System.out.print("Walking");
    }

    private void testWalk() {
    }
}

interface CanRun {
    abstract public void run();

    private void testWalk() {
    }

    default void walk() {
        System.out.print("Running");
    }
}

interface CanSprint extends CanWalk, CanRun {
    void sprint();

    default void walk(int speed) {
        System.out.print("Sprinting");
    }

    @Override
    default void run() {

    }

    @Override
    default void walk() {
        CanWalk.super.walk();
    }
}

interface Sing {
    boolean isTooLoud(int volume, int limit);
}

class OperaSinger {
    public static void main(String[] args) {
        check((h, l) -> true, 5); // m1
    }

    private static void check(Sing sing, int volume) {
        if (sing.isTooLoud(volume, 10)) // m2
            System.out.println("not so great");
        else System.out.println("great");
    }
}

interface Herbivore {
    int amount = 10;
    static boolean gather = true;

    static void eatGrass() {
    }

    default int findMore() {
        return 2;
    }

    default float rest() {
        return 2;
    }

    default int chew() {
        return 13;
    }

    private static void eatLeaves() {
    }
}

class Deer {
    enum Food {APPLES, BERRIES, GRASS}

    protected class Diet {
        private Food getFavorite() {
            return Food.BERRIES;
        }
    }

    public static void main(String[] seasons) {
        switch (new Deer().new Diet().getFavorite()) {
            case APPLES:
                System.out.print("a");
            case BERRIES:
                System.out.print("b");
            default:
                System.out.print("c");
        }
    }
}

class Hyena {
    private int age = 1;

    public static void main(String[] args) {
        var p = new Hyena();
        double height = 10;
        int age = 1;
        testLaugh(p, h -> h.age < 5);
        age = 2;
    }

    static void testLaugh(Hyena panda, Predicate<Hyena> joke) {
        var r = joke.test(panda) ? "hahaha" : "silence";
        System.out.print(r);
    }
}

interface Yawn {
    String yawn(double d, List<Integer> time);
}

class Sloth implements Yawn {
    public String yawn(double zzz, List<Integer> time) {
        return "Sleep: " + zzz;
    }
}

class Vet {
    public static String takeNap(Yawn y) {
        return y.yawn(10, null);
    }

    public static void main(String... unused) {
        System.out.print(takeNap((a, b) -> "Sleep: " + (double) (b == null ? a : a)));
    }
}

class Zebra {
    private int x = 24;

    public int hunt() {
        String message = "x is ";
        abstract class Stripes {
            private int x = 0;

            public void print() {
                System.out.print(message + Zebra.this.x);
            }
        }
        var s = new Stripes() {
        };
        s.print();
        return x;
    }

    public static void main(String[] args) {
        new Zebra().hunt();
    }
}

