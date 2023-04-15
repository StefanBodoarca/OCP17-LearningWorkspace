package beyondclasses.interfaces;

interface Fly {
    void fly();
    int x = 5;
}

public abstract class Animal implements Fly {
    abstract int getType();
    static final void eat() {
        System.out.println(x);
    }
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