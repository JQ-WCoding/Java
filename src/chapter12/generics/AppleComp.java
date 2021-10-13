package chapter12.generics;

import java.util.Comparator;

public class AppleComp implements Comparator<NewApple> {
    public int compare(NewApple a1, NewApple a2) {
        return a2.weight - a1.weight;
    }
}
