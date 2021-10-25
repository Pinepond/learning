package xyz.learning.java.common;

import java.util.Arrays;
import java.util.Comparator;

public class Collections {

    private static void array() {
        String[] arr = new String[5];
        int[] strings = {5, 2, 3, 1, 2};
        System.out.println("Sort --------------------------------");
        Arrays.sort(strings);
        printArr(strings);

        System.out.println("Distinct by stream --------------------------------");
        strings = Arrays.stream(strings).distinct().toArray();
        printArr(strings);

        System.out.println("Print Stream --------------------------------");
        Arrays.stream(strings).distinct().forEach(System.out::println);

        System.out.println("Sort Stream --------------------------------");
        Arrays.stream(strings).distinct().sorted().forEachOrdered(System.out::println);

        System.out.println("Sort Reverse Stream --------------------------------");
        // boxed 를 통해 int 를 Integer 로 변경한 후에 reverseOrder 를 사용할 수 있다.
        Arrays.stream(strings).distinct().boxed().sorted(Comparator.reverseOrder()).forEachOrdered(System.out::println);
    }

    private static void printArr(int[] arr) {
        for (int val : arr) {
            System.out.println(val);
        }
    }

    public static void main(String[] args) {
        array();

    }
}


