package classdesign.inheritance;

import java.io.IOException;

public class StaticTest {
    public static void main(String[] args) {
        new Car().ex1();
    }

}

abstract class Vehicle {
    public static void printState() {
        System.out.println("this is a vehicle");
    }

    protected CharSequence readFile(String path) throws Exception {
        return null;
    }
}

class Car extends Vehicle {
    public static void printState()  {
        System.out.println("this is a car");
    }

    @Override
    public String readFile(String path) throws IOException {
        return null;
    }

    public void ex1() {
        printState();
        super.printState();
    }
}


