package Lesson3;

/*
Write a program where the user enters any positive integer. The program then calculates the sum of all numbers from 1 to the number entered by the user.
For example: if the user enters the
number 3. The program should calculate the sum of numbers from 1 to 3, which is
1+2+3, and output the answer 6.
 */

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter any positive integer: ");
        int number = scanner.nextInt();
        int result = 0;
        int i = number;

        do {
            result += i;
            i--;
        } while(i >= 1);

        System.out.println("The sum of all numbers from 1 to " + number + " = " + result);
    }
}