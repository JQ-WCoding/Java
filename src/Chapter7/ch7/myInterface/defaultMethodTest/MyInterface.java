package Chapter7.ch7.myInterface.defaultMethodTest;

public interface MyInterface {
    default void methodA() {
        System.out.println("methodA() <- MyInterface");
    }

    default void methodB() {
        System.out.println("methodB() <- MyInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() <- MyInterface");
    }
}
