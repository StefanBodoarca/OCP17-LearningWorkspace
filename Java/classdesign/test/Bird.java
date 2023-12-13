package classdesign.test;

public class Bird {
    int feathers = 0;
}

class Parrot extends Bird {
    int feathers = 2;
    Parrot() {
        System.out.println("this.feathers = " + this.feathers);
        System.out.println("super feather =  " + super.feathers);
    }

    public static void main(String[] args) {
        new Parrot();
    }
}
