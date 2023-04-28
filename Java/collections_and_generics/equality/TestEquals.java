package collections_and_generics.equality;

import java.util.List;
import java.util.Set;

public class TestEquals {
    public static void main(String[] args) {
        var list1 = List.of(1, 2);
        var list2 = List.of(2, 1);
        var set1 = Set.of(1, 2);
        var set2 = Set.of(2, 1);

        System.out.println(list1.equals(list2));
        System.out.println(set1.equals(set2));
        System.out.println(list1.equals(set1));
    }
}
