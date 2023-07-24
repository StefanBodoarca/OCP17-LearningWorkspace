package collections_and_generics.map;

import org.w3c.dom.ls.LSOutput;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class CustomHashMapTest {

    private static Map numbers = new HashMap<Key, Integer>();
    public static void main(String[] args) {
        numbers.put(new Key("Ana"), 10);
        numbers.put(new Key("Bna"), 10);
        numbers.put(new Key("Are"), 10);
        numbers.put(new Key("Cna"), 10);
    }
}

class Key {
    String key;
    Key(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        if(this.key == null) {
            return 0;
        }
        return key.charAt(0);
    }

    @Override
    public boolean equals(Object obj) {
        return key.equals(obj);
    }
}
