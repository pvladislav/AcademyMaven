package Lesson3;

//The program should display the following sequence on the screen:7 14 21 28 35 42 49 56 63 70 77 84 91 98

import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the code severity level: ");
        System.out.println("1. Kinder-garden Automation lvl");
        System.out.println("1. Automation Academy lvl");
        System.out.print("Input \"1\" or \"2\" : ");
        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println();
                System.out.println("7 14 21 28 35 42 49 56 63 70 77 84 91 98"); // thats a joke =)
                break;
            case 2:
                System.out.println();
                for (int i = 7; i <= 100; i += 7) {
                    System.out.print(i + " ");
                } break;
        }


    }
}