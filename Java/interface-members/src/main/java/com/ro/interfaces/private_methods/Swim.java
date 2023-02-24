package com.ro.interfaces.private_methods;

public interface Swim {
    void swim();
    private static void breathe(String type) {
        System.out.println("Inhale");
        System.out.println("Performing stroke: " + type);
        System.out.println("Exhale");
    }
    static void butterfly() { breathe("butterfly"); }
    public static void freestyle() { breathe("freestyle"); }
    default void backstroke() { breathe("backstroke"); }
    private void breaststroke() { breathe("breaststroke"); }
}

class Kid implements Swim {

    @Override
    public void swim() {
        System.out.println("The kid is swimming");
    }
}
