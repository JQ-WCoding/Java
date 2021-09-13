package Chpater7.ch7.polymorphism;

public class Automobile {
    int price, bonusPoint;

    Automobile(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    // 기본 생성자
    Automobile() {

    }
}
