package Lesson3;

//Write a program to find the Maximum of Two Numbers using switch statement

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add first number: ");
        int firstNmbr = scanner.nextInt();

        System.out.print("Add second number: ");
        int secondNmbr = scanner.nextInt();
        int result;

        switch (Integer.compare(firstNmbr, secondNmbr)) {
            case -1:
                result = secondNmbr;
                System.out.println("Maximum between two numbers is: " + result);
                break;
            case 0:
                System.out.println("Both numbers are equal.");
                return;
            case 1:
                result = firstNmbr;
                System.out.println("Maximum between two numbers is: " + result);
                break;
            default:
                System.out.println("Invalid comparison.");
        }
    }


}