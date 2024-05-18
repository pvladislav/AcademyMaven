package Lesson2;

//3)	Write a Java program that takes a year from the user and prints whether it is a leap year or not.

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0)
            System.out.println("It's a leap year");
        else
            System.out.println("It's NOT a leap year");
    }
}
