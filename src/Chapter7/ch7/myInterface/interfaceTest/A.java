package Chapter7.ch7.myInterface.interfaceTest;

public class A {
    // 매개변수로 받은 B 클래스의 methodB() 호출
    public void methodA(I i) {
        i.methodB();
    }
}
