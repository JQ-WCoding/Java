package Chapter7.ch7.polymorphism;

public class Automobile2 {
    int price, bonusPoint;

    Automobile2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    // 기본 생성자
    Automobile2() {

    }
}
