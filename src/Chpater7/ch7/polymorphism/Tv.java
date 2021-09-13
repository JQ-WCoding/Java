package Chpater7.ch7.polymorphism;

// Product 상속받고 있는 Tv
public class Tv extends Product {
    // 부모클래스 생성자에 인자값 1 부여
    Tv() {
        super(1);
    }

    // toString() 오버라이딩 하여 간단한 문자열만 반환
    @Override
    public String toString() {
        return "Tv";
    }
}