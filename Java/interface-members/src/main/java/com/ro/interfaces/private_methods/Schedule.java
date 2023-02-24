package com.ro.interfaces.private_methods;

public interface Schedule {
    default void wakeUp() { checkTime(7); }
    default void haveBreakfast() { checkTime(9); }
    default void haveLunch() { checkTime(12); }
    default void workOut() { checkTime(18); }

    /*
     - new to Java 9, interfaces may now include private interface methods
     - the private interface methods can be used to reduce code duplication
     - a private method may be called only by default and private (non-static) methods within the interface definition
     */
    private void checkTime(int hour) {
        if (hour > 17) {
            System.out.println("You're late!");
        } else {
            System.out.println(
                    "You have " + (17 - hour) + "hours left to make the appointment"
            );
        }
    }
}

