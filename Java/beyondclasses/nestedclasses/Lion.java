package beyondclasses.nestedclasses;

public class Lion {
    class Cub {}
    static class Den {}
    static void rest() {
        Lion.Den f = new Lion.Den();
        int age = new Primate().age;
    }
}

class Primate {
    protected int age = 2;
}

class Orangutan {
    //protected int age = 4;

    public static void main(String[] args) {
        Primate y = new Primate();
        System.out.println(y.age);
    }
}

sealed class Monkey {}

non-sealed class Mandrill extends Monkey {}

sealed class Friendly extends Mandrill permits Silly {}

final class Silly extends Friendly {}
