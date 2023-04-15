package beyondclasses.records;

public record Crane(int numberEggs, String name, Object o) {

    public Crane {
        if(numberEggs < 0) {
            throw new IllegalArgumentException();
        }
        name = name.toUpperCase();
    }

    @Override
    public int numberEggs() {
        return 10;
    }

    public String toString() {
        return this.name;
    }
}
