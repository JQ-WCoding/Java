package chapter8.ch8.exceptionHandling;

public class ExceptionEx4 {
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("B");
        try {
            System.out.println("C");
        } catch (Exception e) {
            System.out.println("D");
        }
        System.out.println("E");
        System.out.println("F");

        /*
        A ~ F 까지 문자열을 출력하면서 catch 문은 try 문 중에 오류가 발생하지 않았기 때문에 실행되지
        않고 "D"를 건너뛰고 실행된다
         */
    }
}
