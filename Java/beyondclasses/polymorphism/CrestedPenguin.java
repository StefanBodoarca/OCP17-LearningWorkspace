package beyondclasses.polymorphism;

class Penguin {
    public static int getHeight() {
        return 3;
    }

    public void printInfo() {
        System.out.println(getHeight());
    }
}

public class CrestedPenguin extends Penguin {
    public static int getHeight() {
        return 8;
    }

    /*
    public void printInfo() {
        System.out.println(getHeight());
    }
     */

    public static void main(String[] args) {
        new CrestedPenguin().printInfo();
    }
}
