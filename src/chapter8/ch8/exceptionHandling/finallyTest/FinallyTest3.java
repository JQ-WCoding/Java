package chapter8.ch8.exceptionHandling.finallyTest;

public class FinallyTest3 {
    public static void main(String[] args) {
        // 어떤 클래스의 메소드인지 표현하기 위해
        FinallyTest3.method();
        // main 의 가장 마지막 순서로 종료문구 출력 -> finally 문구를 출력한 후 method()가 종료되고 "end method()" 출력
        System.out.println("end method()");
    }

    static void method() {
        try {
            // method() 문자열을 실행하면서 예외사항이 발생하면 catch 문으로 이동
            System.out.println("method()");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch block");
        } finally {
            // 항상 finally 블록을 실행
            System.out.println("finally block");
        }
    }
}
