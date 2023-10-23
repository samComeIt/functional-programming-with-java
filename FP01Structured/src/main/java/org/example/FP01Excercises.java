package org.example;

import java.util.List;

public class FP01Excercises {

    public static void main(String[] args) {
        printOddNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        // What to do?
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(System.out::println); // Method Reference
    }

}
