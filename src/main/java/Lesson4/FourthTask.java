package Lesson4;

//4.Write a Java program to calculate the average of all elements in an integer array.

import java.util.Arrays;

public class FourthTask {
    public static void main(String[] args) {
        int firstArray[] = {1, 2, 3, 4, 5};

        System.out.print("4. Write a Java program to calculate the average of all elements in an integer array.");
        System.out.println();

        System.out.print("You array is: " + Arrays.toString(firstArray));

        System.out.println();
        int sum = 0;
        for (int i = 0; i < firstArray.length - 1; i++) {
            sum += firstArray[i];
        }
        System.out.println("The average of all array elements = " + (sum / firstArray.length));
    }
}
