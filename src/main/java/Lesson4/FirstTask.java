package Lesson4;

//1.Write a Java program to reverse an array of integers.

import java.util.Arrays;

public class FirstTask {
    public static void main(String[] args) {
        int firstArray[] = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("1.Write a Java program to reverse an array of integers.");
        System.out.println();

        //print array using toString method
        System.out.println("a) You array is -> " + Arrays.toString(firstArray));

        //print array using for each
        System.out.print("b) You array is -> ");
        for (int i: firstArray) {
            System.out.print(i + " ");
        }

        //print array using for
        System.out.println();
        System.out.print("c) You array is -> ");
        for (int j = 0; j < firstArray.length; j++) {
            System.out.print(firstArray[j] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.print("Reserved array is -> ");
        // printing array starting from last element (length - 1)
        for (int z = firstArray.length - 1; z >= 0; z--) {
            System.out.print(firstArray[z] + " ");
        }

        System.out.println();
        int counter = 0;
        int secondArray[] = new int[firstArray.length];
        //array sorting from last element (length - 1)
        for (int z = firstArray.length - 1; z >= 0; z--) {
            secondArray[counter] = firstArray[z];
            counter++;
        }
        System.out.println(Arrays.toString(secondArray));
    }
}
