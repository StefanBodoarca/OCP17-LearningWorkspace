package functionalprogramming.java17.testquestions;

import java.util.List;

interface Yawn {
    String yawn(double d, List<Integer> time);
}

class Sloth implements Yawn {

    @Override
    public String yawn(double zzz, List<Integer> time) {
        return "Sleep: " + zzz;
    }
}
public class Vet {
    public static String takeNap(Yawn y) {
        return y.yawn(10, null);
    }

    public static void main(String[] args) {
        System.out.print(takeNap((a, b) -> "Sleep: " + (double)(b == null ? a : a)));
    }
}
