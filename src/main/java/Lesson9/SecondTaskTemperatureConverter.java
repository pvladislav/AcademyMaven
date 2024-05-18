package Lesson9;

import java.util.Scanner;

/**
 * Temperature converter.
 * Create a program that converts temperature from Celsius to Fahrenheit.
 * Prompt the user to enter a temperature in Celsius, perform the conversion, and display the result.
 */

public class SecondTaskTemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        int celsiusTemperature = scanner.nextInt();

        int fahrenheitTemperature = ((celsiusTemperature * 9) / 5) + 32;

        System.out.println(celsiusTemperature + " Celsius = " + fahrenheitTemperature + " Fahrenheit");
    }
}
