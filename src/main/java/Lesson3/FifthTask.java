package Lesson3;

//Display on the screen the multiplication table for 3.

public class FifthTask {
    public static void main(String[] args) {
        int number = 3;
        System.out.println("Multiplication table for " + number );

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}