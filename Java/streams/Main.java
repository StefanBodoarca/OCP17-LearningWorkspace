package streams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Frog frog = new Frog();
        //frog.hop(null, 1);

        Locale l1 = new Locale.Builder()
                .setLanguage("kx")
                .setRegion("XP")
                .build();


        System.out.println(Locale.getDefault());
        Locale.setDefault(l1);
        System.out.println(Locale.getDefault());

        int attendeesPerMonth = 3_200_000 / 12;
        System.out.println(attendeesPerMonth);

        var huey = (String) null;

        q14();
    }

    void rollOut() throws ClassCastException {}

    public void transform(String c) {
        try {
            rollOut();
        } catch (IllegalArgumentException | NullPointerException e) {}
    }

    public static void q14() {
        var huey = (String)null;
        Integer dewey = null;
        Object louie = null;
        if(louie == huey.substring(dewey.intValue())) {
            System.out.println("Quack!"); }
    }

}

class Frog {
    public void hop(String name, Integer jump) {
        System.out.println(name.toLowerCase() + " " + jump.intValue());
    }

}

