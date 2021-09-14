package chapter8.ch8.exceptionHandling;

public class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            method();
            // 메인문의 try 에서 예외처리를 처리하여 -> catch 문을 실행한다
        } catch (Exception e) {
            System.out.println("main에서 예외처리 성공!");
            e.printStackTrace();
        }
    }

    static void method() throws Exception { // 예외 사항이 발생할 것이라는 것을 미리 확인하고 있어야함
        throw new Exception();
    }
}
