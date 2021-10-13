package chapter12.generics;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
//        FruitBox<Grape> grapeFruitBox = new FruitBox<Apple>(); -> 타입 불일치로 인한 에러

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

//        fruitBox.add(new Toy()); -> Toy 는 타입 형이 다르기에 에러
        appleBox.add(new Apple());
//        grapeBox.add(new Apple());  -> Grape 는 Apple 을 상속받은 타입이 아니다
        grapeBox.add(new Grape());
//        grapeBox.add(new Fruit()); -> Grape 는 Fruit 에 상속받았지만 부모인 클래스는 사용 불가능 -> 더 넓은 범위의 값이기 때문에 형변환이 필요

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}
