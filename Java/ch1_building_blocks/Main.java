package ch1_building_blocks;

public class Main {
    public static void main(String[] args) {
        String name = "name";

        System.out.println(name.length());

        q19();
    }

    public static void q19() {
        var num1 = Long.parseLong("100"); //long
        var num2 = Long.valueOf("100");   //Long

        System.out.println(Long.max(num1, num2));
    }

    public static void q8() {
    }
}

class WatterBottle {
    private String brand;
    private boolean empty;
    public static float code;

    public WatterBottle(){}

    public void WatterBottle() {}

    public static void main(String[] args) {
        WatterBottle wb = new WatterBottle();
        System.out.println("Empty=" + wb.empty);
        System.out.println("Brand=" + wb.brand);
        System.out.println("Code=" + code);

    }
}
