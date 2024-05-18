package Lesson2;

/*
5)There is a string "I love Java":
        a) Print the letter at index 4.
        b) Print the index of the letter 'J'.
        c) Add "and QA Automation" to this phrase (resulting in "I love Java and QA Automation").
        d)Check via boolean if the phrase "I love Java" is of type String.
 */

public class FifthTask {
    public static void main(String[] args) {
            String string = "I love Java";

    //         a) Print the letter at index 4.
            System.out.println("The letter at index 4 -> " + string.charAt(4)); // should be 'v'

    //         b) Print the index of the letter 'J'. )
            System.out.println("The index of the letter 'J' -> " + string.indexOf('J')); // should be 7

    //        c) Add "and QA Automation" to this phrase (resulting in "I love Java and QA Automation").
            System.out.println(string.concat(" and QA Automation"));

    //        d)Check via boolean if the phrase "I love Java" is of type String.
            boolean isString = string.equals("I love Java");

            if (isString) {
                System.out.println("The phrase \"I love Java\" is of type String");
            } else {
                System.out.println("The phrase \"I love Java\" isn't a String");
            }
    }
}