package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main (String [] args) {

        double num1 = 5;
        double num2 = 4;


        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double modules = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + modules);



        System.out.println(num1 + " + " + num2 + " = " + num1 + num2);  // How can I make the addition happen first.
        /*
            2 * 3 + 4 == > 10
            2 * (3 + 4) == > 2 * 7 == > 14
         */
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));  // Parenthesis have higher priority in action.



    }
}
