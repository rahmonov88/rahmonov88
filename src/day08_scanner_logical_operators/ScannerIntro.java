package day08_scanner_logical_operators;

import java.util.Scanner;
//java.lang;

public class ScannerIntro {
    public static void main(String[] args) {

        String name = "Tom";
        System.out.println("Hello " + name);
        System.out.println("-----------------------");

        Scanner input = new Scanner(System.in); // I create a Scanner object
        System.out.println("Please enter a number: ");
        int num = input.nextInt();  // 78
        System.out.println("If I add 3 to your number, it will be: " + (num + 3));




    }
}