package Lesson1;

//2)Write a program to take two integer inputs from user and print sum and product of them.

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 2 ->> Write a program to take two integer inputs from user and print sum and product of them.");

        System.out.print("Input first number: ");
        int input1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int input2 = scanner.nextInt();

        int sum = input1 + input2;
        int products = input1 * input2;

        System.out.println("--------------------------");

        System.out.println("Sum of " + input1 + " & " + input2 + " = " + sum);
        System.out.println("Product of " + input1 + " & " + input2 + " = " + products);
    }
}
