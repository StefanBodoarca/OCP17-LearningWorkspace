package beyondclasses.enums;

public enum Season {
    WINTER("low"), SPRING("medium"), SUMMER("high"), FALL("medium");
    private final String expectedVisitors;
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
    public static void main(String[] args) {
        for (var season: Season.values()
             ) {
            System.out.println(season.name() + " " + season.ordinal() + " " + season.printExpectedVisitors());
        }
    }
}
