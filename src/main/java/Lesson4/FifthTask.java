package Lesson4;

//5.Write a Java program to search for a specific element in an array and return its index.

import java.util.Arrays;
import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer firstArray[] = {1, 2, 3, 4};

        System.out.println("You array is: " + Arrays.toString(firstArray));
        System.out.print("Enter index nr: ");
        int n = scanner.nextInt();

        System.out.println();

        System.out.println("Index of you element in an array is: " + Arrays.asList(firstArray).indexOf(n));
    }
}
