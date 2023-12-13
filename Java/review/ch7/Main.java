package review.ch7;

interface X {
    static void test(){}
    int p = 0;
}

class Y implements X {
    void checkTest() {
        X.test();
        System.out.println(p);
    }
}

record Z() {
    static int x = 7;

    static {
        x = 9;
    }

    static int getX() {
        return x;
    }

    interface NestedInterface {
        public abstract void method1();
    }

    class NestedClass implements NestedInterface {

        @Override
        public void method1() {
            System.out.println("method1");
        }
    }
}

abstract class AClass {}


class A1 {
    int x = 5;

    {
        class Calculator {
            void increment() {
                x++;
            }
        }

        AClass a = new AClass() {
            int p = 7;
            int y = x++;
        };


    }

    static {
        class Calculator {
            int a1 = new A1().x++;
        }
    }

    static void m1A1() {}
    void m2A1() {

    }

    static class A2 {
        int v1A2 = 0;
        static int v2A2 = 0;

        static void m2A2() {}

        public void m1A2() {
            m1A1();
        }
    }
}

class PrintNumbers {
    private int length = 5;

    public void calculate() {
        final int width = 20;

        class Calculator {
            int width = 15;
            public void multiply() {
                System.out.println(length * width);
            }
        }

        var calculator = new Calculator();
        calculator.multiply();
    }
}
public class Main {
    static Z.NestedClass nestedClass = new Z().new NestedClass();

    public static void main(String[] args) {
        nestedClass.method1();
    }
}
