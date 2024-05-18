package Lesson5;

/*
2. Write a method that takes a string and determines whether it is a palindrome (reads the same forwards and backwards).
For example, "level" is palindrome.
 */

public class SecondTask {
    public static void main(String[] args) {
        forMethod("LeVEl");
        stringBufferMethod("LeVEl");
    }

    static void forMethod (String word) {
        String word2 = "";
        char temp;

        //Creating reverse of string 'word'
        for (int i = word.length()-1; i >= 0; i--) {
            temp = word.charAt(i);
            word2 += temp;
        }

        //Comparing word with word2
        if (word.toLowerCase().equals(word2.toLowerCase())) {
            System.out.println("The \"" + word + "\" word is palindrome.");
        }
        else {
            System.out.print("The \"" + word + "\" word is NOT palindrome.");
        }
    }
    static void stringBufferMethod (String word) {
        //Creating revers by using StringBuffer
        StringBuffer object = new StringBuffer(word);
        String word2 = String.valueOf(object.reverse());

        //Comparing word with word2
        if (word.toLowerCase().equals(word2.toLowerCase())) {
            System.out.println("The \"" + word + "\" word is palindrome.");
        }
        else {
            System.out.print("The \"" + word + "\" word is NOT palindrome.");
        }
    }
}