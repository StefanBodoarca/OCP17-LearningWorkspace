package udemy.test1;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

interface Animal {

    default String getName(){

        return "I'm animal";

    }

}


interface Cat extends Animal {

    default String getName(){

        return "I'm cat";

    }

}


class Lion implements Cat, Animal {  }

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Lion();  //1

        Cat animal2 = new Lion();  //2

        Lion animal3 = new Lion();

        System.out.println(animal1.getName()); //3

        System.out.println(animal2.getName()); //4

        System.out.println(animal3.getName());

        long l = Stream.of(1, 2, 3).filter(i -> i < 3).count();
        System.out.println(l);
    }
}

enum Decision {
    YES, NO;

    static String printYesDecision() {
        return YES.toString();
    }

    public static void main(String[] args) {
        System.out.println(Decision.printYesDecision());
    }
}

class Test extends Thread {

    public static void main(String[] args) throws Exception {

        for(int i=0; i<100; i++)  {
            new Test().start();
        }
    }

    private static int counter = 0;

    public void run() { synchronized (Test.class){ System.out.println(++counter);}  }

}

class Calculator {
    public static void main(String[] args) {
        System.out.println(Arrays.compare(new String[]{"ana"}, new String[]{"aaa"}));
    }

    public static long calculcator(int i){
        var s = (short)1.0;
        return (long) i/s*5;
    }
}
 class TestOptional {


    public static void main(String[] args) {

        Optional<String> optional = createOptional();

        String s = optional.orElse("ferrari");

        System.out.println(s);

        Object o = "1";
        System.out.println();

    }


    public static Optional<String> createOptional(){

        String s = new String();

        s = null;

        return Optional.ofNullable(s);

    }

}
