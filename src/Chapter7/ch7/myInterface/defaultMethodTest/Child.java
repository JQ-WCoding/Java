package Chapter7.ch7.myInterface.defaultMethodTest;

public class Child extends Parent implements MyInterface, MyInterface2 {
    // 상속받은 method를 그대로 사용하는 것도 가능하고 오버라이딩을 통해 사용도 가능한다
    // 하지만,
    @Override
    public void methodA() {
        System.out.println("methodA() <- Child");
    }
}
