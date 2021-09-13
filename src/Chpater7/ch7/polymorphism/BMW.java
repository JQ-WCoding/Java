package Chpater7.ch7.polymorphism;

public class BMW extends Automobile {
    BMW() {
        super(1000);
    }

    @Override
    public String toString() {
        return "BMW";
    }
}