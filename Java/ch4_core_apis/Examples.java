package ch4_core_apis;

import java.util.Arrays;

public class Examples {
    public static void main(String[] args) {
        //pg182ObjectReference();
        //pg167TranslateEscapes();
        arrays();

    }

    public static void pg182ObjectReference() {
        String[] strings = {"stringValue0", "val1"};

        Object o = strings;

        System.out.println(o);

        Object[] oArr = strings;
        System.out.println(Arrays.toString(oArr));
    }

    public static void pg167TranslateEscapes() {
        var str = "ewe\nsheep\\t";
        System.out.println(str + ": length = " + str.length());
        var indentedStr = str.indent(2);
        System.out.println(indentedStr + ": length = " + indentedStr.length());
        var translatedStr = str.translateEscapes();
        System.out.println(translatedStr + ": length = " + translatedStr.length());
    }

    public static void checkSwitchExpression() {
        int measurement = 10;
        final int z = 7;
        int size = switch (measurement) {
            case 5 -> 1;
            case 6, 10 -> 2;
            case z -> 8;
            default -> throw new IllegalStateException("Unexpected value: " + measurement);
        };
        measurement = 0;
    }

    public static void arrays() {
        int[][][] arr = new int[3][0][2];

        arr[0][0][0] = 7;
        arr[0][0][1] = 9;
        arr[0][0][1] = 8;

        System.out.println(Arrays.toString(arr));
    }

}
