package Chpater7.ch7.myInterface.interfaceTest;

public interface I {
    // Interface 를 통해 methodB() 미리 선언
    // 'A - B' -> 'A - I - B' 관계가 변경 (직접 -> 간접)의 관계로 변경
    public abstract void methodB();
}
