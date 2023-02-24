package com.ro.interfaces.static_methods;

public interface Hop {

    /*
     - a static method cannot be marked abstract or final.
     - a static method is not inherited and cannot be accessed in a class implementing the
       interface without a reference to the interface name.
     */
    static int getJumpHeight() {
        return 8;
    }
}

class Bunny implements Hop {
    public void printDetails() {
        /*
         The static interface methods are not inherited by a class implementing the interface,
         as they would if the method were defined in a parent class.
         */
        System.out.println(Hop.getJumpHeight());
    }
}
