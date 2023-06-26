package chapter11_exceptions.resource_bundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        var us = new Locale("en", "US");
        var france = new Locale("fr", "FR");
        printWelcomeMessage(us);
        printWelcomeMessage(france);
    }

    public static void printWelcomeMessage(Locale locale) {
        var rb = ResourceBundle.getBundle("chapter11_exceptions/resource_bundles/Zoo", locale);
        System.out.println(
                rb.getString("hello") + ", " + rb.getString("open")
        );
    }

    public static void test2() {
        Locale.setDefault(new Locale("en", "US"));
        Locale locale = new Locale("en", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("chapter11_exceptions/resource_bundles/Zoo", locale);
        System.out.print(rb.getString("hello"));
        System.out.print(". ");
        System.out.print(rb.getString("name"));
        System.out.print(". ");
        System.out.print(rb.getString("open"));
        System.out.print(". ");
        System.out.print(rb.getString("visitors"));
    }
}
