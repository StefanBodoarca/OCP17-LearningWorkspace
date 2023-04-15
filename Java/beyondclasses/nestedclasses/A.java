package beyondclasses.nestedclasses;

public class A {
    private int x = 10;

    class B {
        private int x = 20;

        class C {
            private int x = 30;

            public void allTheX() {
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(B.this.x); //we still want an instance variable but the one from B
                System.out.println(A.this.x);
            }
        }
    }

    public static void main(String[] args) {
        new A().new B().new C().allTheX();
        A a = new A();
        B b = a.new B();
        B.C c = b.new C();
    }
}
