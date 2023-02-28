package com.ro.annotations;

class Bear {}
enum Size {SMALL, MEDIUM, LARGE}

public @interface Panda {
    //Integer height(); does NOT COMPILE - wrapper classes to primitive types are not supported
    //String[][] generalInfo(); - does NOT COMPILE - String[] is supported
    Size size() default Size.SMALL;
    //Bear friendlyBear(); - does NOT COMPILE - the type is Bear, not Class
    Exercise exercise() default @Exercise(hoursPerDay = 2);
}
