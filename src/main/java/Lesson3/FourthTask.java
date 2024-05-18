package Lesson3;

/*
Write a Java program that calculates the factorial of a given non-negative integer using a while loop.
The factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n.
        Example: For input n = 5, the factorial is calculated as 5! = 5 * 4 * 3 * 2 * 1 = 120.
*/

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Factorial calculator app launched!!!");
        System.out.print("Enter the number: ");
        int n = Math.abs(scanner.nextInt());
        int factorial = 1, i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}