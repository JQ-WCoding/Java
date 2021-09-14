package Chpater7.ch7.myInterface.interfaceTest;

public class B implements I {
    // B 클래스의 methodB()를 A에서 호출
    @Override
    public void methodB() {
        System.out.println("methodB() in B class");
    }
}
