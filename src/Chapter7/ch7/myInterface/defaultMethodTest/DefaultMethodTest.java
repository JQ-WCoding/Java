package Chapter7.ch7.myInterface.defaultMethodTest;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Child child = new Child();
        // 인스턴화를 통해 호출하면 child 에선 선언되지 않은 methodB()의 경우 Parent 를 상속받은 클래스이기에 Parent 로 부터 호출
        child.methodA();
        child.methodB();

        MyInterface.staticMethod(); // static 메소드이기에 인스턴화 없이 호출가능
        MyInterface2.staticMethod();
        /*
         상속의 개념은 항상 기준이 어디인지를 중점적으로 생각하는 것이 좋다.
         현재 내가 호출하는 기준에 따라 상속의 depth 를 확인하면서 해당 선언된 메소드를 어느 클래스 혹은 인터페이스에서 호출하는지 알 수 있다.
         상속의 범위를 중점적으로 고려하기!
         */
    }
}
