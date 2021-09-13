package Chpater7.ch7.polymorphism;

public class Product {
    int price, bonusPoint;

    // 생성자를 통해 초기화
    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

}
