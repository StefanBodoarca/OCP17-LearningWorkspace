package chapter11_exceptions;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ValuesFormatter {
    public static void main(String[] args) {
        double d = 1234.567;

        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        System.out.println(f1.format(d));
    }
}
