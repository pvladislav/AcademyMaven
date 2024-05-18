package Lesson4;

//2.Write a Java program to sort an array of integers in ascending and descending order.

import java.util.Arrays;

public class SecondTask {
    public static void main(String[] args) {
        int firstArray[] = {1, 3, 5, 7, 2, 4, 6};

        //print array using toString method
        System.out.println("You array is -> " + Arrays.toString(firstArray));

        //using Sort method from Arrays class to print ascending order
        System.out.println();
        Arrays.sort(firstArray);
        System.out.println("You ASC sorted array is -> " + Arrays.toString(firstArray));

        System.out.println();

        //printing reverse of ascended array
        System.out.print("You DESC sorted array is -> ");
        for (int i = firstArray.length - 1; i >= 0; i--) {
            System.out.print(firstArray[i] + " ");
        }

        System.out.println();

        //Creating array with descending order
        System.out.print("You DESC sorted array is -> ");
        for (int x = 0; x < firstArray.length; x++) {
            for (int j = 0; j < firstArray.length; j++) {
                if (firstArray[x] > firstArray[j]) {
                    int temp = firstArray[x];
                    firstArray[x] = firstArray[j];
                    firstArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(firstArray));
    }
}