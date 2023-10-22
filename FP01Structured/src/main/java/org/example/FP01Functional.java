package org.example;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
    }

//    private static void print(int number) {
//        System.out.println(number);
//    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // What to do?
        numbers.stream()
                .forEach(System.out::println); // Method Reference
    }


    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        // How to loop the numbers?
        numbers.stream()
                .forEach(System.out::println); // Method Reference
    }
}
