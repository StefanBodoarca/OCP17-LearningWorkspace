package classdesign.test;

public class BirdSeed {
    private int numberBags;
    boolean call;

    public BirdSeed() {
        new BirdSeed();
        call = false;
        new BirdSeed(2);
    }

    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }

    public static void main(String[] args) {
        var seed = new BirdSeed();
        System.out.println(seed.numberBags);
    }
}
