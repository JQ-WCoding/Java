package chapter8.ch8.exceptionHandling.tryWithResource;

// Exception 클래스 상속 -> 예외사항 적용
public class WorkException extends Exception {
    WorkException(String msg) {
        super(msg);
    }
}
