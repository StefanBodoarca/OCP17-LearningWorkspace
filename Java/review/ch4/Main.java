package review.ch4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("line 1");

        System.out.println("\t".length());

        q19();
    }

    public static void q19() {
        String s1[] = {"Camel", "Peacock", "Llama"};
        String s2[] = {"Camel", "Llama", "Peacock"};
        System.out.println("<s1, s2> = " + Arrays.compare(s1, s2));


        String s3[] = {"Peacock"};
        String s4[] = {"Llama"};
        System.out.println("<s3, s4> = " + Arrays.compare(s3, s4));

        String s5[] = {"P"};
        String s6[] = {"L"};
        System.out.println("<s5, s6> = " + Arrays.compare(s5, s6));

        Arrays.sort(s1);
        System.out.println("s1 sorted = ");
        Arrays.asList(s1).forEach(System.out::println);

    }
}
