package practice_tests.ch3;

enum Color {
    BROWN, YELLOW, BLACK;
    public static Color DEFAULT = BROWN;


}

class PenguinQ35 {
    private enum Baby { EGG }
    private int x = 5;

    static class Chick {
        enum Baby { EGG }
    }

    public void check() {
        int x = 7;
    }

}

enum DayQ20 {
    MONDAY, TUESDAY
}

interface ParentInterface {

    default void someMethod() {
        // This method is implicitly final in any interface extending ParentInterface
    }
}

class Bottle {
    public class Ship {

    }

    public static void main(String[] args) {
        var bottle = new Bottle();
        Ship s = bottle.new Ship();
    }
}

enum Day {}

interface ChildInterface extends ParentInterface {
    // You can provide another default method with the same name here
    default void someMethod() {
        // This method is different from the one in ParentInterface
    }
}

public class Main {
    public static void main(String[] args) {
        //Q20 ();
        
    }

    public static void Q20() {
        switch(DayQ20.MONDAY) {
            default:
            case MONDAY:
                System.out.println("monday");
            case TUESDAY:
                System.out.println("tuesday");
        }
    }

}
