package review.ch3;

public class Main {
    public static void main(String[] args) {
    }

    public static int get3() {
        return 3;
    }

    public static void f1() {
        int a = 1;
        int p = switch (a) {
            case 1 -> {
                System.out.println("1");
                yield 1;
            }
            case 2 -> {
                System.out.println("case 2");
                throw new IllegalArgumentException();
            }
            case 3 -> get3();
            default -> {
                System.out.println("default case");
                yield 3;
            }
        };
    }
}
