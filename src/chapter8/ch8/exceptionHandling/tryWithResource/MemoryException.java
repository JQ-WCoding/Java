package chapter8.ch8.exceptionHandling.tryWithResource;

// 메모리 예외
public class MemoryException extends Exception {
    // 생성자 -> 매개변수 msg 를 부모 클래스 Exception 에 적용한다
    MemoryException(String msg) {
        super(msg);
    }
}
