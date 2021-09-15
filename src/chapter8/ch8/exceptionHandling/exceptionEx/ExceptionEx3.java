package chapter8.ch8.exceptionHandling.exceptionEx;

public class ExceptionEx3 {
    public static void main(String[] args) {
        int num = 20; // 20 번 안에 0 한번은 나와주세요!
        int result = 0;
        for (int i = 0; i < num; i++) {
            try {
                result = num / (int) (Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException ae) {
                /*
                 ArithmeticException 이 발생할 경우 매개변수 ae 를 이용하여 해당 에러를 확인하고
                 문자열 0을 출력한다
                 해당 오류가 발생하지 않으면 try 문만 실행되고 종료된다.
                 */
                System.out.println("0");
            }
        }
    }
}
