package Lesson9;

import java.util.Scanner;

/**
 * Write a Java program to check whether a given number is even or odd.
 */

public class ThirdTaskEvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        System.out.println("Enter 0 if you want to stop program");
    }
}
