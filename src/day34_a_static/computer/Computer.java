package day34_a_static.computer;
/*
Computer - static

class name: computer:
    instance variables:
        price, brand, color, ...

    static variables: hasScreen, hasBattery, hasMemory

    make objects of the class in a main method and access both instance and static members from proper references

 */
public class Computer {

    // ACCESS MODIF for these 3 fields: default
    // DEFAULT VALUES: brand = null, price = 0.0, color = null
    String brand;
    double price;
    String color;


    //static boolean hasScreen, hasBattery, hasMemory;
    // ACCESS MODIF for these 3 static variables: default
    // DEFAULT VALUES: hasScreen = false, hasBattery = false, hasMemory = false;
    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;


    static {
        System.out.println("Static block run.");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
    }

    public Computer(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
}
