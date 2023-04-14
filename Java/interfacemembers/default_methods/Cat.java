package interfacemembers.default_methods;

public class Cat implements Walk, Run {
    @Override
    public int getSpeed() {
        return 1;
    }

    public int getWalkSpeed() {
        return Walk.super.getSpeed();
    }

    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}
