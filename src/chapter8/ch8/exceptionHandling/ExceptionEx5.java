package chapter8.ch8.exceptionHandling;

public class ExceptionEx5 {
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("B");
        try {
            System.out.println(0 / 0);
            System.out.println("C");
        } catch (ArithmeticException ae) {
            System.out.println("D");
        }
        /*
         상단의 try catch 문의 경우, try 문의 첫번째 줄인 '0/0' 에서 ArithmeticException 이 발생한다
         따라서, try 문에서 오류가 난 line 이후의 코드는 실행되지 않고 즉시 catch 문의 코드가 실행된다
         따라서, 문자열 C는 출력되지 않고 문자열 D가 출력된다.
         */
        System.out.println("E");
        System.out.println("F");

    }
}
