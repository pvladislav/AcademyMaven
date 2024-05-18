package Udemy;

public class UdemyExercice {

    public static void main(String[] args) {
        getDaysInMonth(-1   , 2018);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            System.out.println("-1");
        }
           return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> isLeapYear(year) ? 29 : 28;
                case 4, 6, 9, 11 -> 30;
                default -> -1;
            };
        }
    }
