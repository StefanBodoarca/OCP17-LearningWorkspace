package ch4_core_apis;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        q19();
    }

    public static void q9() {
        int[] numbers = new int[]{0, 1, 2};
        System.out.println(numbers[1]);
        numbers[1] = 5;
        System.out.println(numbers[1]);
    }

    public static void q10() {
        System.out.println(Math.floor(6.6));
    }

    public static void q12() {
        System.out.println("12345".indent(2).stripLeading());
    }

    public static void q15() {
        var arr = new String[] {"PIG", "pig", "123"};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, "123"));
    }

    public static void q18() {
        String s2 = "";
        s2 += 2;
        s2 += 'c';
        s2 += false;

        if(s2 != "2cfalse") {
            System.out.println(true);
        }
    }

    public static void q19() {
        String s1[] = {"Camel", "Peacock", "Llama"};
        String[] s2 = {"Camel", "Llama", "Peacock"};

        System.out.println(Arrays.compare(s1, s2));
    }


}
