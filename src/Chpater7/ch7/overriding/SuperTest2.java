package Chpater7.ch7.overriding;

public class SuperTest2 {
    public static void main(String[] args) {
        Child2 child2 = new Child2();
        child2.printAll();
        /*
        출력문이 SuperTest와 달리 11111111, 1111111, 10이 나오는 이유:
        Child2 클래스에서 x는 인스턴스 변수로 선언된 int x = 1111111; 을 의미한다
        this.x 는 정확하게 자기 자신을 표현하여 child2의 x를 참조하려하는 것이고
        super.x 는 부모클래스의 x를 참조하기 때문에 x, this.x 두 값은 동일하며, super.x 부모클래스의 값은 변동되지 않아 그래도 10이다
         */
    }
}

class Child2 extends Parent {
    // Child2의 인스턴스 변수 x는 111111이다
    int x = 111111;

    void printAll() {
        /**
         * 전체 출력문
         */
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}