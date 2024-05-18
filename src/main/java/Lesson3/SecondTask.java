package Lesson3;

//Write a program to create simple calculator using switch Statement

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple calculator app is launched!!!");

        System.out.print("Add first number: ");
        double firstNmbr = scanner.nextDouble();
        System.out.print("Add second number: ");
        double secondNmbr = scanner.nextDouble();

        System.out.print("Select the operation (+, -, *, /, %): ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+' :
                System.out.println("The Addition between " + firstNmbr + " & " + secondNmbr + " = " + (firstNmbr + secondNmbr));
                break;
            case '-' :
                System.out.println("The Subtraction between " + firstNmbr + " & " + secondNmbr + " = " + (firstNmbr - secondNmbr));
                break;
            case '*' :
                System.out.println("The Multiplication between " + firstNmbr + " & " + secondNmbr + " = " + (firstNmbr * secondNmbr));
                break;
            case '/' :
                System.out.println("The Division between " + firstNmbr + " & " + secondNmbr + " = " + (firstNmbr / secondNmbr));
                break;
            case '%' :
                System.out.println("The Modulus between " + firstNmbr + " & " + secondNmbr + " = " + (firstNmbr % secondNmbr));
                break;
            default:
                System.out.println("Incorrect operation symbol was selected");
        }

    }
}