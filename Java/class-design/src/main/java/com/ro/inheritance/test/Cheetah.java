package com.ro.inheritance.test;

class Speedster {
    int numSpots;

    protected int getNumberOfSpots() {
        return numSpots;
    }
}

public class Cheetah extends Speedster {
    int numSpots;

    public Cheetah(int numSpots) {
        this.numSpots = numSpots;
    }

    @Override
    public int getNumberOfSpots() {
        return numSpots + 2;
    }

    public static void main(String[] args) {
        Speedster s = new Cheetah(50);
        System.out.println(s.numSpots);
        System.out.println(s.getNumberOfSpots());
    }
}
