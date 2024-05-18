package Lesson5;

/*
1. Write a method that takes an integer as an argument and returns its factorial.
The factorial of a number 𝑛n (denoted as 𝑛!n!) is the product of all integers from 1 to 𝑛.
 */

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        factorial(scanner.nextInt());
    }
    static void factorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println("Factorial of " + n + "! = " + sum);
    }
}

