package chapter8.ch8.exceptionHandling.exceptionEx;

public class ExceptionEx11 {
    public static void main(String[] args) {
        System.out.println("hi");
        throw new RuntimeException(); // 고의 런타임 에러 발생
        // -> 컴파일은 되나
//        System.out.println("bye");
        // 상단의 hi 문자열은 출력되나 이후 bye 는 출력되지 않는다 -> 런타임 에러를 발생시키 때문에 이후 코드는 실행되지 않기 때문이다
        // 런타임 오류는 프로그래머가 실수로 발생하는 것들이기 때문에 강제로 예외처리를 요구하지 않아 컴파일은 가능한 것
    }
}
