package chapter12.annotation;

// 함수형 인터페이스 -> 추상메서드가 하나뿐이어야한다는 제약을 둘때
@FunctionalInterface
public interface Runnable {
    void run();
}
