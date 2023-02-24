package com.ro.nested.classes;

public class StaticNestedClassExample {

    /*
    - unlike an inner class, a static nested class can be instantiated without
      an instance of the enclosing class
    - a static nested class can't access instance variables or methods in the outer class directly
      (requires an explicit reference to an outer class variable)
     - for importing static classes a regular import or a static import can be used
     */
    static class Nested {
        private int price = 6;
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }
}
