package functionalprogramming.java17;

public interface StringParameterChecker {
    boolean check(String text);

}

interface DoubleParameterChecker {
    boolean check(OpAdd a);

}

class OpAdd {
    double add(double a, double b) {
        return a + b;
    }

    boolean check(OpAdd a) {
        return true;
    }
}

interface MyBiFunction {
    double apply(double t, double u);
}

class Main {
    public static void main(String[] args) {
        StringParameterChecker methodRef = String::isEmpty;
        DoubleParameterChecker methodRef1 = a -> a.check(a);
    }
}
