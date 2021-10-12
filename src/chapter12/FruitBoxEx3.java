package chapter12;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
//        appleBox.add(new Grape()); 안되용~

        System.out.println(Juicer.makeJuicer(fruitBox));
        System.out.println(Juicer.makeJuicer(appleBox));
    }
}
