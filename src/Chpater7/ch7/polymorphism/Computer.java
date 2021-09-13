package Chpater7.ch7.polymorphism;


// Product 상속받고 있는 Computer
public class Computer extends Product {
    // 부모클래스 생성자에 인자값 2 부여
    Computer() {
        super(2);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}
