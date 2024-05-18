package Lesson2;

//1)	Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number, and I'll determine whether it's positive, negative, or neutral: ");
        double inputNumber = scanner.nextDouble();

        if (inputNumber > 0)
            System.out.println("The entered " + inputNumber + " number is positive one");
        else if (inputNumber < 0)
            System.out.println("The entered " + inputNumber + " number is negative one");
        else
            System.out.println(inputNumber + " number is considered neither positive nor negative one");
    }
}