package day09_b__if_statements;

import java.util.Scanner;

public class Temperature {
    /*

    Task:
        ask the user to enter the temperature

        if the temperature is above or equal to 70  --->    '>='
            print: Its a nice day
                   Go outside, but with your laptop to code java
        if the temperature if less than 70
            print: Its too cold
                   Code more java
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int temp = key.nextInt();  // Here we are dynamically getting the value from user each time
        // int temp = 50;  // Here we are manually changing the value. It is kind of HARD CODED

        //boolean result = temp >= 70;
        //if (result) {

        if (temp >= 70) {
            System.out.println("It is a nice day");
            System.out.println("Go outside, but with your laptop to code java ");
        }else {
            System.out.println("It is too cold");
            System.out.println("Code more Java");
        }

    }
}
