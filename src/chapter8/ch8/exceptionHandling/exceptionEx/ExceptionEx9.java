package chapter8.ch8.exceptionHandling.exceptionEx;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            // String 형 매개변수를 받아 super() 부모의 message 변수에 인자값으로 넘긴 문자열을 초기화
            Exception exception = new Exception("고의 발생");
            // throw exception -> 예외 고의 유발
            throw exception;
        } catch (Exception e) {
            // 에러 메세지 및 생성자 확인
            System.out.println("error : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("End!");
    }
}
