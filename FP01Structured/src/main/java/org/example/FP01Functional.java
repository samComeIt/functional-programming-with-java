package org.example;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        //printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
        //printEvenNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
        //printSquaresEvenNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
        printCubesOddNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));

    }

//    private static void print(int number) {
//        System.out.println(number);
//    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // What to do?
        numbers.stream()
                .forEach(System.out::println); // Method Reference
    }


    private static boolean isEven(int number)
    {
        return number%2 == 0;
    }

    // number -> number%2 == 0
    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        // How to loop the numbers?
        numbers.stream()
                //Filter - Only allow even numbers
                //.filter(FP01Functional::isEven)
                .filter(number -> number%2 == 0)//Lamdba Expression
                .forEach(System.out::println); // Method Reference
    }

    private static void printSquaresEvenNumbersInListStructured(List<Integer> numbers)
    {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    private static void printCubesOddNumbersInListStructured(List<Integer> numbers)
    {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }
}
