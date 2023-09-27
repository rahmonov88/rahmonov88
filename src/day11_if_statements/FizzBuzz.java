package day11_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    /*
           you will have a number

           if the number is divisible by 3 print -> Fizz
           if the number is divisible by 5 print -> Buzz
           if the number is divisible by both 3 and 5 -> FizzBuzz
           if the number is not divisible by any of those, print just the number
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String result = "";

        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result = "" + number;
        }

        System.out.println(result);


        System.out.println("-------");

        // This is made in this way just to explain else-if execution flow
        if (number % 3 == 0 ) {
            result = "Fizz";
        } else if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result = "" + number;
        }

        System.out.println(result);


    }


}
