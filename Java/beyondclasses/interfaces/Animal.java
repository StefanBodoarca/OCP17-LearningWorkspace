package beyondclasses.interfaces;

interface Fly {
    void fly();
}

public abstract class Animal implements Fly {
    abstract int getType();
    static final void eat() {}
}

class Swan extends Animal {

    @Override
    public void fly() {

    }

    @Override
    int getType() {
        return 0;
    }
}