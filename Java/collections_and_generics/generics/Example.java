package collections_and_generics.generics;

public class Example<T extends Number> {
    private T value;

    public Example(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
