package Chapter7.ch7.polymorphism;

public class Audi extends Automobile {
    Audi() {
        super(4000);
    }

    @Override
    public String toString() {
        return "Audi";
    }
}
