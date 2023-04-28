package collections_and_generics.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergeExample {
    static BiFunction<String, String, String> mapper1 = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
    static BiFunction<String, String, String> mapper2 = (v1, v2) -> null;
    public static void main(String[] args) {
        Map<String, String> favorites1 = new HashMap();
        favorites1.put("Sam", null);
        favorites1.put("Jenny", "Tram");
        favorites1.merge("Tom", "Skyride", mapper1); //mapper not called
        favorites1.merge("Sam", "Skyride", mapper1); //mapper not called
        favorites1.merge("Jenny", "Bus Tour", mapper1); //mapper called
        System.out.println(favorites1); //{Tom=Skyride, Jenny=Bus Tour, Sam=Skyride}

        Map<String,String> users = new HashMap<>();
        users.put("Jenny", "Bus Tour");
        users.put("Tom", "Bus Tour"); //not touched
        users.merge("Jenny", "Skyride", mapper2); //mapper2 -> null => key removed
        users.merge("Sam", "Skyride", mapper2); //mapper2 not called => key added
        System.out.println(users); //{Tom=Bus Tour, Sam=Skyride}



    }
}
