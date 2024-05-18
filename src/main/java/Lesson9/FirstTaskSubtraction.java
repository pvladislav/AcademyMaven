package Lesson9;

import java.util.Scanner;

/**
 * Subtraction.
 * Two integers are given. How many times can the second number be subtracted from the first number?
 */

public class FirstTaskSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNmbr = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNmbr = scanner.nextInt();

        System.out.println("Subtraction result = " + (firstNmbr / secondNmbr));
    }
}