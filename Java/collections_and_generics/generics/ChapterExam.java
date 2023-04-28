package collections_and_generics.generics;

import java.util.*;

public class ChapterExam {

    private static void ex2() {
        var v = List.of("mouse", "parrot");
        List<?> q = List.of("mouse", "parrot");

        //q.removeIf(String::isEmpty); //Non-static method cannot be referenced from a static context
        //q.removeIf(s -> s.length() == 4); //Cannot resolve method 'length' in 'Object'
        v.removeIf(String::isEmpty);
        v.removeIf(s -> s.length() == 4);
    }

    private void ex4() {

    }

    private static void ex5() {
        record Hello<T>(T t) {
            public Hello(T t) {
                this.t = t;
            }

            private <T> void println(T message) {
                System.out.print(t + "-" + message);
            }
        }

        new Hello<String>("hi").println(1);
        new Hello("hola").println(true);
    }

    private static void ex6() {
        record Platypus(String name, int beakLength) {
            @Override
            public String toString() {
                return "" + Platypus.this.beakLength;
            }
        }

        Platypus p1 = new Platypus("Paula", 3);
        Platypus p2 = new Platypus("Peter", 5);
        Platypus p3 = new Platypus("Peter", 7);

        List<Platypus> list = Arrays.asList(p1, p2, p3);

        Collections.sort(list, Comparator.comparing(Platypus::name).thenComparing(Comparator.comparing(Platypus::beakLength).reversed()));

        List<Platypus> listCopy = new ArrayList<>(List.copyOf(list));
        Collections.sort(listCopy, Comparator.comparing(Platypus::name).thenComparingInt(Platypus::beakLength).reversed());

        System.out.println("first list");
        System.out.println(list);

        System.out.println("copy of list");
        System.out.println(listCopy);
    }

    private static void ex8() {
        class MyComparator implements Comparator<String> {

            @Override
            public int compare(String o1, String o2) {
                return o2.toLowerCase().compareTo(o1.toLowerCase());
            }
        }

        String[] values = {"123", "Abb", "aab"};
        Arrays.sort(values, new MyComparator());
        List.of(values).forEach(System.out::print);
    }
    private static void ex17() {
        var map = Map.of(1, 2, 3, 6);
        var list = List.copyOf(map.entrySet());
        //list.replaceAll(x -> x * 2); //Operator '*' cannot be applied to 'java.util.Map.Entry<java.lang.Integer,java.lang.Integer>', 'int'
    }
    public static void main(String[] args) {
        //ex2();
        //ex5();
        //ex6();
        ex8();
    }


}
