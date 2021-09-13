package Chpater7.ch7.overriding;

public class Child2 extends Parent {
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
