package collections_and_generics.equality;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestListFactory {
    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "c"};
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);

        array[0] = "z";

        System.out.println(asList);
        System.out.println(of);
        System.out.println(copy);

        asList.set(0, "x");
        System.out.println(Arrays.toString(array));
        overloadedRemove();
        listToArray();
    }

    private static void overloadedRemove() {
        var list = new LinkedList<Integer>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.remove(2); //int index = 2 (primitive type) => [3, 2]
        list.remove(Integer.valueOf(2)); //Object of type Integer => [3]
        System.out.println(list);
    }

    private static void listToArray() {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();

        /*
            - the advantage of specifying a size 0 for the parameter is that Java will create a new array
              of the proper size for the return value.
            - if you like, you can suggest a larger array to be used instead. If the List fits that array, it will be returned.
              Otherwise, a new array will be created.
         */
        String[] stringArray = list.toArray(new String[0]);

        list.clear();

        System.out.println("Size: ");
        System.out.println(objectArray.length);
        System.out.println(stringArray.length);

        System.out.println("Content: ");
        System.out.println(Arrays.toString(objectArray));
        System.out.println(Arrays.toString(stringArray));
    }
}
