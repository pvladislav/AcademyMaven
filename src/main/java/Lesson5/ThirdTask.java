package Lesson5;

/*
Write a method that takes an integer and returns the sum of its digits.
 For example, for the number 123, the sum of its digits would be 6 (1 + 2 + 3)
 */

public class ThirdTask {
    public static void main(String[] args) {
        digitesSum(105);
    }
    static void digitesSum (int nmbr) {
        int nmbr2 = nmbr;
        int sum = 0;
        int temp = 0;

        while (nmbr > 0) {
            temp = nmbr % 10;
            sum += temp;
            nmbr /= 10;
        }
        System.out.println("Number \"" + nmbr2 + "\"" + " digits sum = " + sum);
    }
}
