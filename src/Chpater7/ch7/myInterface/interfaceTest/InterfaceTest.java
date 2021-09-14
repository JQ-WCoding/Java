package Chpater7.ch7.myInterface.interfaceTest;

public class InterfaceTest {
    public static void main(String[] args) {
        // 참조변수 a를 통해 methodA() 실행 -> 인자값으로 객체 B를 넘긴다
        A a = new A();
        a.methodA(new B());
    }
}
