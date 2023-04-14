package classdesign.test;

abstract class Nocturnal {
    abstract boolean isBlind();
}

public class Owl extends Nocturnal {
    @Override
    public boolean isBlind() {
        return false;
    }

    public static void main(String[] args) {
        var nocturnal = new Owl();
        System.out.println(nocturnal.isBlind());
    }
}
