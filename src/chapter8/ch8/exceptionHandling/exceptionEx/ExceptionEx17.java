package chapter8.ch8.exceptionHandling.exceptionEx;

public class ExceptionEx17 {
    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            // 반환 받은 method()의 Exception 으로 인하여 catch 블록에 진입, main 예외처리를 한다
            System.out.println("main 예외처리");
        }
    }

    // method() 에 예외처리
    static void method() throws Exception {
        /*
         method() 호출 시, try 블록에서 Exception 을 던지고 catch 에서 받는 순서로 진행
         하지만 출력문 하단 throw 를 통해 다시 매개변수로 Exception 으로 예외를 발생시킨다
         따라서 메인문에 예외 상태로 반환된다
         */
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method() 예외처리");
            throw e;
        }
    }
}
