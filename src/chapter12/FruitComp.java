package chapter12;

import java.util.Comparator;

public class FruitComp implements Comparator<NewFruit> {
    @Override
    public int compare(NewFruit f1, NewFruit f2) {
        return f2.weight - f1.weight;
    }
}
