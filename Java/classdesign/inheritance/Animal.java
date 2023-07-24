package classdesign.inheritance;

public class Animal {
    int speed = 0;
    final String name;

    static { System.out.print("A"); }

    public Animal() {
        name = "1234";
    }
}

class Reptile extends Animal {
    int speed = 10;

    int getSpeed() {
        return speed;
    }

    int getParentSpeed() {
        return super.speed;
    }
}

class Hippo extends Animal {
    public static void main(String[] args) {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }

    static { System.out.print("B"); }
}

class Main {
    public static void main(String[] args) {

        Reptile r = new Reptile();
        System.out.println(r.getParentSpeed());
        System.out.println(r.getSpeed());


//        System.out.print("C");
//        new Hippo();
//        new Hippo();
//        new Hippo();
    }
}


