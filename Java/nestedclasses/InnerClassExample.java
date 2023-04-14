package nestedclasses;

public class InnerClassExample {
    private String greeting = "Hi";

    /*
    - this Inner class can be public, protected, package-private (default), private
    - can extend any class and implement interfaces
    - can be marked abstract or final
    - cannot declare static fields or methods, except for static final fields!
    - can access members of the outer class including private members!
     */
    protected class Inner {
        public int repeat = 3;
        public void go() {
            for (int i = 0; i  <repeat; i++) {
                //accessing private "greeting" of the outer class
                System.out.println(greeting);
            }
        }
    }

    private void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        InnerClassExample outer = new InnerClassExample();
        //since an inner class is not static, it has to be used with an instance of the outer class
        outer.callInner();

        //or
        Inner inner = outer.new Inner();
        inner.go();
    }
}

class A {
    private int x = 10;

    class B {
        private int x = 20;

        class C {
            private int x = 30;

            public void allTheX() {
                System.out.println(x); //30
                System.out.println(this.x); //30
                System.out.println(B.this.x); //20
                System.out.println(A.this.x); //10
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = a.new B();
        B.C c = b.new C();
        c.allTheX();
    }
}
