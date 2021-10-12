package chapter12;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        // 오브젝트에서 <>안의 내용은 생략가능 -> 참조변수에서 선언했기에 1.7 이상부터
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Toy> toyBox = new Box<>();
        // 타입을 다르게 하면 불일치하기에 에러 발생
//        Box<Grape> grapeBox = new Box<Apple>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Grape()); // Fruit 형으로 선언되어 있기에 -> 상속받은 Grape 와 Apple 오브젝트 모두 사용가능

        appleBox.add(new Apple());
//        appleBox.add(new Toy()); // 타입이 드르기에 에러

        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }
}
