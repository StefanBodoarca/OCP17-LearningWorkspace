package playground;

public class Main {
    public static void main(String[] args) {
        checkStringFormatWithObjects();
    }

    public static void checkStringFormatWithObjects() {
        Object str = "my_string";
        String template = "My string is %s";
        String formatted = template.formatted(str);
        String formatWithString = String.format(template, str);

        System.out.println("formatted = " + formatted);
        System.out.println("formattedWithString = " + formatWithString);


    }
}
