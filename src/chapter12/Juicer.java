package chapter12;

public class Juicer {
    // FruitBox 는 Box 를 상속받고 있기에 Box 의 메소드를 사용하여 매개변수 FruitBox<? extends Fruit> box 를 처리한다
    static Juice makeJuicer(FruitBox<? extends Fruit> box) {
        String temp = "";
        for (Fruit fruit : box.getList()) {
            temp += fruit + " ";
        }

        return new Juice(temp);
    }
}
