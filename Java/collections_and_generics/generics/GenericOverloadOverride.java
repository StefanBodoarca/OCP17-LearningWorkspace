package collections_and_generics.generics;

import java.util.ArrayList;
import java.util.List;

class LongTailAnimal {
    protected void chew(List<Object> input) {}
}

class Food<T> {
    T[] vegetables;
    List<?> a = new ArrayList<String>();

}
public class GenericOverloadOverride extends LongTailAnimal {
    public void chew(List<Object> input) {}
}

class LowerBound {
    static List<String> strings = new ArrayList<String>();

    static {
        strings.add("tweet");
    }

    static List<Object> objects = new ArrayList<Object>(strings);

    static void addSound(List<? super String> list) {
        list.add("quack");
    }

    static void printList(List list) {
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        addSound(strings);
        printList(strings);
        addSound(objects);
        printList(objects);
    }

}

class TestBounds {
    class A {}
    class B extends A {}
    class C extends B {}

    List<? super C> list5 = new ArrayList<A>();

    <B extends A> B third(List<B> list) {
        return (B) new C();
    }
}