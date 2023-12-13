package classdesign.inheritance;

interface Test {
    static void interfaceTest() {
        System.out.println("test interface method");
    }

    int MAX = 5;
}

public class Animal implements Test {
    int speed = 0;
    final String name;

    static { System.out.print("A"); }

    int getSpeed() {
        Test.interfaceTest();
        int x = MAX;
        return speed;
    }

    static void test() {
        System.out.println("test");
    }


    public Animal() {
        name = "1234";
    }
}

class Reptile extends Animal {
    int speed = 10;
    static void test(int i) {
        System.out.println("child test");
    }

    int getSpeed() throws RuntimeException {
        test();
        return speed;
    }

    int getParentSpeed() {
        return super.speed;
    }
}

class Hippo extends Animal {

    int speed = 2;

    int getSpeed() {
        return speed;
    }
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

//        Reptile r = new Reptile();
//        System.out.println(r.getParentSpeed());
//        System.out.println(r.getSpeed());


//        System.out.print("C");
//        new Hippo();
//        new Hippo();
//        new Hippo();


        printAnimalSpeed(new Hippo());
        printAnimalSpeed(new Reptile());
        printAnimalSpeed(new Animal());

    }

    private static void printAnimalSpeed(Animal a) {
        System.out.println("child: " + a.getSpeed() + " base :" +
                a.speed);
    }

}


