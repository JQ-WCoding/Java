package chapter12.generics;

import java.util.Comparator;

public class GrapeComp implements Comparator<NewGrape> {
    public int compare(NewGrape g1, NewGrape g2) {
        return g2.weight - g1.weight;
    }
}
