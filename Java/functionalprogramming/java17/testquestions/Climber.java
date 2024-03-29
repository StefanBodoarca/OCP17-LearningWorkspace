package functionalprogramming.java17.testquestions;

interface Climb {
    boolean isTooHigh(int height, int limit);
}
public class Climber {
    public static void main(String[] args) {
        check((h,m) -> h > m, 15);
    }

    private static void check(Climb climb, int height) {
        if(climb.isTooHigh(height, 10))
            System.out.println("too high");
        else
            System.out.println("ok");
    }
}
