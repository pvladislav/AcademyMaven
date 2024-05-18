package Lesson3;

import java.util.Scanner;

public class ClassLesson {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. If-else");
        System.out.println("2. While");
        System.out.println("3. Do-While");
        System.out.println("4. For");
        System.out.println("5. Switch");
        System.out.println();

        System.out.print("Select the statement number: ");
        int caseNr = scanner.nextInt();

        switch (caseNr) {
            case 1:
                System.out.println();
                System.out.println("You are in IF");
                int ifValue = 5;
                if (ifValue < 10)
                    System.out.println("ifValue = " + ifValue);
                else
                    System.out.println("Else");
                break;
            case 2:
                System.out.println();
                System.out.println("You are in WHILE");
                System.out.print("Select number 1 till 4: ");
                int whileValue = scanner.nextInt();
                while (whileValue < 4) {
                    System.out.println("whileValue = " + whileValue);
                    whileValue++;
                } break;
            case 3:
                System.out.println();
                System.out.println("You are in DO-WHILE");
                int doWhileValue = 5;
                do {
                    System.out.println("doWhileValue = " + doWhileValue);
                    doWhileValue++;
                } while (doWhileValue < 5);
                break;
            case 4:
                System.out.println();
                System.out.println("You are in FOR");
                for (int forValue = 0; forValue < 5; forValue++) {
                    System.out.println("forValue = " + forValue);
                }
                break;
            case 5:
                System.out.println();
                System.out.println("You are in SWITCH");
                switch (5){
                    case 1:
                        System.out.println("case 1");
                        break;
                    case 2:
                        System.out.println("case 2");
                        break;
                } break;
                default:
                System.out.println("Wrongly value was entered!");
        }
    }
}