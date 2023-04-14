package interfacemembers.default_methods;

public interface IsWarmBlooded {

    boolean hasScales();

    /*
     - a default method may be overridden by a class implementing the interface
      (default = it is viewed as an abstract method with a default implementation)
     - a default method cannot be marked abstract, final, or static
     - if a class inherits two or more default methods with the same method signature, then the class
       must override the method.

     Purpose of default Methods:
     - backward compatibility
     - convenience: the Comparator interface includes a "default reversed()" method that returns
       a new Comparator in the order reversed
     */

    default double getTemperature() {
        return 10.0;
    }

    /*
     Both of these methods include the implicit public modifier,
     so overriding them with a different access modifier is not allowed!
     */
}
