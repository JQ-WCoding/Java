package chapter8.ch8.exceptionHandling;

public class ExceptionEx2 {
    public static void main(String[] args) {
        int num = 10;
        int result = 0;

        for (int i = 0; i < num; i++) {
            result = num / (int) (Math.random() * 10);
            /*
            만약 랜덤 숫자로 0이 반환될 경우 ArithmeticException 에러가 발생한다
            해당 오류를 정상적으로 출력하기 위한 작업 -> ExceptionEx3 에서 작성
             */
            System.out.println(result);
        }
    }
}
