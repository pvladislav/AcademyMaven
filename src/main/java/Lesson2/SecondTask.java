package Lesson2;

//2)	Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne, numberTwo, numberThree;

        System.out.print("Please enter first number: ");
        numberOne = scanner.nextInt();

        System.out.print("Please enter second number: ");
        numberTwo = scanner.nextInt();

        System.out.print("Please enter third number: ");
        numberThree = scanner.nextInt();

        System.out.println(); // Empty line
        System.out.println("The greatest number is -> " + Math.max(numberOne, Math.max(numberTwo, numberThree)));
    }
}
