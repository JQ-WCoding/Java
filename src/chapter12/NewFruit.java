package chapter12;

public class NewFruit {
    String name;
    int weight;

    NewFruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "(" + weight + ")";
    }
}
