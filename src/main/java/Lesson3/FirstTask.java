package Lesson3;

//Write a program to read gender(M/F) and print the corresponding gender using a switch statement

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cat names generator launched!");
        System.out.print("Enter the cat gender(M/F): ");
        char gender = scanner.next().toUpperCase().charAt(0);

        switch (gender){
            case 'M' :
                System.out.println("Here are five names for male cat:");
                System.out.println("- Oliver");
                System.out.println("- Simba");
                System.out.println("- Max");
                System.out.println("- Leo");
                System.out.println("- Charlie");
                break;
            case 'F' :
                System.out.println("Here are five names for female cat:");
                System.out.println("- Luna");
                System.out.println("- Bella");
                System.out.println("- Daisy");
                System.out.println("- Cleo");
                System.out.println("- Nala");
                break;
        }
    }
}