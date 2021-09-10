package Chpater7.ch7.overriding;

public class SuperTest {
    public static void main(String[] args) {
        // Child 를 인스턴스화하여 참조변수 child 선언
        Child child = new Child();
        /*
         해당 child를 선언하면 상속받은 Parent의 인스턴스변수 x가 10으로 초기화 된다
         Child 클래스의 printAll()메소드는 parent에서 상속받은 인스턴스 변수 (x) 와 this.x(child에서 참조하는), super.x(부모에서 참조하는)를 모두 출력한다
         */
        child.printAll();
    }
}

class Parent {
    int x = 10;
}

class Child extends Parent {
    /**
     * 전체 출력문
     */
    void printAll() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}