package functionalprogramming.java17.testquestions;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Fantasy {

    public static void main(String[] args) {
        scary("dino");
        scary("dragon");
        scary("unicorn");
    }

    public static void scary(String animal) {
        Predicate<String> dino = s -> "dino".equals(animal);
        Predicate<String> dragon = s -> "dragon".equals(animal);
        var combined = dino.or(dragon);
        System.out.println(combined.test(animal));
    }

    private static void testSupplier() {
        int length = 3;
        for(int i = 0; i < 3; i++) {
            if(i % 2 == 0) {
                Supplier<Integer> supplier = () -> length;
                System.out.println(supplier.get());
            } else {
                final int j = i;
                Supplier<Integer> supplier = () -> j;
                System.out.println(supplier.get());
            }
        }
    }
}
