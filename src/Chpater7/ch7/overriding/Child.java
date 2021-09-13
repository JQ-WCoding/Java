package Chpater7.ch7.overriding;

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
