package Lesson2;

//4)	Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne, numberTwo, numberThree, numberFour, numberFive;

        System.out.print("Please enter first number: ");
        numberOne = scanner.nextInt();

        System.out.print("Please enter second number: ");
        numberTwo = scanner.nextInt();

        System.out.print("Please enter third number: ");
        numberThree = scanner.nextInt();

        System.out.print("Please enter fourth number: ");
        numberFour = scanner.nextInt();

        System.out.print("Please enter fifth number: ");
        numberFive = scanner.nextInt();

        int sum = numberOne + numberTwo + numberThree + numberFour + numberFive;

        System.out.println("The sum of 5 no is : " + sum);

        double avg = (double) sum;
        System.out.println("The Average is : " + avg / 5);
    }
}
