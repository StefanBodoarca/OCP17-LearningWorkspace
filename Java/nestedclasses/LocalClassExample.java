package nestedclasses;

public class LocalClassExample {
    /*
    - local class = nested class defined within a method.
    - method scope
    - instances can be created only from within the method.
      Those instances can still be returned from the method.

      * local classes can also be declared inside constructors and initializers too

      Properties:
      - they do not have an access modifier
      - they cannot be declared static and cannot declare static fields or methods, except for static final fields!
      - they have access to all fields and methods of the enclosing class (when defined in an instance method)
      - they can access local variables if the variables are final or effectively final
     */

    private int length = 5;

    public void calculate() {
        final int width = 20;
        //class defined inside the method calculate()
        class MyLocalClass {
            public void multiply() {
                System.out.println(length * width);
            }
        }

        MyLocalClass localClass = new MyLocalClass();
        localClass.multiply();
    }

    public static void main(String[] args) {
        LocalClassExample outer = new LocalClassExample();
        outer.calculate();
    }
}
