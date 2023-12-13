package blog.switch_example;

public class SwitchExample {

    public static void main(String[] args) {
        switch (getDay("1")) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
        };

        final int d = getDay("2");

        System.out.println(d);

    }
    public void printWeekDay(int day) {
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }
    }

    public void printWeekDaySwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid value");
        }
    }


    public static int getDay(String s) {
        return Integer.parseInt(s);
    }
}
