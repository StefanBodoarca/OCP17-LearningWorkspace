package com.ro.functional.interfaces;

@FunctionalInterface
public interface Sprint {
    public void sprint(int speed);
}

class Tiger implements Sprint {

    @Override
    public void sprint(int speed) {
        System.out.println("Animal is sprinting fast! " + speed);
    }
}

@FunctionalInterface
interface Climb {
    void reach();
    default void fall() {}
    static int getBackUp() { return 100; }
    private static boolean checkHeight() { return true; }
}
