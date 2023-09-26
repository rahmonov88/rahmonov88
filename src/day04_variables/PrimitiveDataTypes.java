package day04_variables;

public class PrimitiveDataTypes {

    public static void main (String [] args) {

        byte age = 90; // I declared a variable called age which has int data type and number 50 is assigned to it.
        System.out.println("50");  // Hardcoded -- mean you have to change it manually
        System.out.println("age"); // here "age" is not a variable. It is just a word that we are printing
        System.out.println(age); // Dynamically - we are using age variable to make pur code dynamic.

        //byte age = 95;   // In Java, we canNOT declare SAME variable name more than ONCE
        age = 100; // Since we are NOT DECLARATION it again, we can use the same variable name. It will REASSIGN the value.

        //byte age2 = 950;  // primitive data type byte canNOT hold 950 because it is out or the range that byte can hold


        short year;  //  In this line, we JUST DECLARED the variable
        year = 2023;  // In this line, we ASSIGNED a value to year variable;


        int addressNumber = 234235453;


        long bigNumber;
        bigNumber = 9345345876876876L;


        //long year;  //Even if you have a DIFFERENT Data type, you can not use the SAME variable name more than ONCE in the same BLOCK OF CODE



    }
}
