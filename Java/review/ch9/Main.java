package review.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.*;

class Duck {
    int weight;
    String name;

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}

class Alpaca {
    public List<String> hairy(List<String> list) { return null; }
}

class AO extends Alpaca {

    @Override
    public List<String> hairy(List<String> list) {
        return new ArrayList<>();
    }
}

public class Main {
    public static void main(String[] args) {
        List<? super IOException> exList = new ArrayList<Exception>();
        List<? super IOException> exListIo;
        exList.add(new IOException());
        exList.add(new FileNotFoundException());
        exListIo = exList;



        List<String> x1 = new ArrayList();
        var x2 = new ArrayList<>();

        List<Object> ref = x2;

        Queue<Integer> q = new LinkedList<>();

    }
    Comparator<Duck> byWeight = Comparator.comparing(Duck::getWeight);
}
