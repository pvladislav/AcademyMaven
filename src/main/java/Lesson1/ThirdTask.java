package Lesson1;

//3)Take side of a square from user and print area and perimeter of it.

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task 3 ->> Take side of a square from user and print area and perimeter of it.");

        System.out.print("Enter square side size: ");

        int side = scanner.nextInt();

        System.out.println("Square area = " + side * side);
        System.out.println("Perimeter area = " + 4 * side);
    }
}
