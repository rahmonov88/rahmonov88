package day39_a_polymorphism.book;

public abstract class EBook extends Book implements Downloadable {

    double size; //mg

    public abstract void open();


}