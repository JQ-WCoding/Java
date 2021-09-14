package chapter8.ch8.exceptionHandling;

public class ExceptionEx13 {
    public static void main(String[] args) {
        method(); // throw 상관없이 try catch 를 통해 체크를 하였기 때문에 throws 를 사용해 Exception 을 부여할 필요가 없다
    }

    static void method() {
        try { // 예외사항 강제로 던져주기
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method 예외처리 성공!"); // 문자열 출력
            e.printStackTrace(); // 예외사항 출력 -> 표시
        }
    }
}
