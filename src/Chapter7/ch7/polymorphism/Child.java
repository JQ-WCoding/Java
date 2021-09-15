package Chapter7.ch7.polymorphism;

// 부모클래스를 상속받은 자식클래스
public class Child extends Parent {
    int x = 2;

    // 구분을 위해 확실하게 override 표시
    @Override
    void call() {
        System.out.println("Child Method");
    }
}