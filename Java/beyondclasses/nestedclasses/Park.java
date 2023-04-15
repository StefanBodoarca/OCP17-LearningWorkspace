package beyondclasses.nestedclasses;

public class Park {
    static class Ride {
        private int price = 6;
        public static int speed = 10;
    }

    public static void main(String[] args) {
        var ride = new Ride();
        System.out.println(ride.price);
        System.out.println(Ride.speed);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Park.Ride.speed);
    }
}
