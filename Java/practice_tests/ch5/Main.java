package practice_tests.ch5;

import java.util.*;

record Magazine(String name) implements Comparable<Magazine> {
    public int compareTo(Magazine m) {
        return name.compareTo(m.name);
    }
}

class Newsstand {
    public static void main(String[] args) {
        var set = new TreeSet<Magazine>();
        set.add(new Magazine("highlights"));
        set.add(new Magazine("Newsweek"));
        set.add(new Magazine("highlights"));
        System.out.println(set.iterator().next());

        long l = Math.min(5, 2);
    }
}
public class Main {
}
