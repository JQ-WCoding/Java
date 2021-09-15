package Chapter7.ch7.polymorphism;

public class Child3 extends Parent{
    int x = 2;

    // 부모 메소드 오버라이딩
    @Override
    void call(){
        System.out.println("x : " + x);
        System.out.println("super.x : " + super.x);
        System.out.println("this.x : " + this.x);
    }
}
