package chapter9.langPackage;

public class Card2 {
    String kind;
    int num;

    Card2() {
        this("Clover", 7);
    }

    Card2(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Card2{" +
                "kind='" + kind + '\'' +
                ", num=" + num +
                '}';
    }
}
