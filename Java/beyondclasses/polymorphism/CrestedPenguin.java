package beyondclasses.polymorphism;

class Penguin {
    public static int getHeight() {
        return 3;
    }

    public void printInfo() {
        System.out.println(this.getHeight());
    }
}

public class CrestedPenguin extends Penguin {
    public static int getHeight() {
        return 8;
    }

    public static void main(String[] args) {
        CrestedPenguin crestedPenguin = new CrestedPenguin();
    }
}
