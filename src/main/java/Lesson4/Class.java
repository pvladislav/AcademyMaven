package Lesson4;

import java.util.Arrays;

public class Class {
    public static void main(String[] args) {
    /*    int firstArray[] = {1, 2, 31, 4, 5, 6};
        int secondArray[] = {2, 4, 1, 2, 8, 11};

        int sum = 0;

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println("-------");

        // Max of value from the same position in 2 arrays
        System.out.print("Max = ");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print((Math.max(firstArray[i], secondArray[i]) + ", "));
        }

        // Sum of value from the same position in 2 arrays
        System.out.println();
        System.out.print("Sum = ");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print((firstArray[i] + secondArray[i]) + ", ");
        }

        // Max first array value
        System.out.println();
        System.out.print("Max firstArrays value = ");

        int max = firstArray[0];
        for (int i = 0; i < firstArray.length; i++) {
            max = Math.max(max, firstArray[i]);
        }
        System.out.println(max);

        // array values entered as input

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array lenght: ");
        int n = scanner.nextInt();
        int thirdArray[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Array " + i + " value: ");
            thirdArray[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.print(Arrays.toString(thirdArray));
        System.out.println("----");
        System.out.println(thirdArray[0]);


        int matrice[][] = {
                {1, 2, 3},
                {1, 2, 3}
        };
        System.out.println(matrice.length);
        System.out.println("-----");


        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
*/
        // Compare sum of first 3 values of array with sum of last 3 values of array
        int secondMatrix[] = {1,2,3,1,2,3};

        System.out.println(Arrays.toString(secondMatrix));

        int lenght = secondMatrix.length - 1;
        int lenght2 = lenght;


//        int sumOflastThree = ((secondMatrix.length - 1) + secondMatrix.length - 2) + (secondMatrix.length - 3));

    }
}