package beyondclasses.enums;

public enum Season {
    WINTER("low"), SPRING("medium"), SUMMER("high"), FALL("medium");
    String expectedVisitors;
    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }
    public String printExpectedVisitors() {
        return expectedVisitors;
    }
}

abstract class TestEnum {
    public abstract int getSeasonOrdinal();
}

class Main {
    double d = 1_2.0_0;
    public static void main(String[] args) {
        printEnum();
        Season.WINTER.expectedVisitors = "myTestValue";
        printEnum();

    }

    private static void printEnum() {
        for (var season: Season.values()
        ) {
            System.out.println(season.name() + " " + season.ordinal() + " " + season.printExpectedVisitors());
        }
    }
}
