package Chpater7.ch7.myInterface.defaultMethodTest;

public interface MyInterface2 {
    default void methodA() {
        System.out.println("methodA() <_ MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() <_ MyInterface2");
    }
}
