package collections_and_generics.sortingdata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortRabbits {
    record Rabbit(int id) {}

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit(3));
        rabbits.add(new Rabbit(1));

        Collections.sort(rabbits, Comparator.comparingInt(Rabbit::id));
        System.out.println(rabbits);

        Collections.reverse(rabbits);
        System.out.println(rabbits);

    }
}

public class SortingExamples {
    Comparator byWeight = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    };
}
