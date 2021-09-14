package chapter8.ch8.exceptionHandling;

public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println("a");
        System.out.println("b");
        try {
            System.out.println("c");
            System.out.println(0 / 0);
            System.out.println("d");
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) { // true 이기 때문에 문자열 "true" 출력
                System.out.println("true");
            }
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("e");
        }
        System.out.println("f");
        /*
            catch문이 2개인 경우 상단의 catch 문부터 순차적으로 하단으로 내려가면 확인하고 가장 먼저 해당하는 예외사항을
            발견하면 첫번째 예외처리 catch 문을 실행하고 종료된다 -> 이후의 예외 사항에 대한 catch 문은 실행되지 않는다
         */

//        System.out.println("g");
//        try {
//
//        }catch (Exception e){
//
//        }catch (ArithmeticException ae){
//
//        }
        /*
         최상위 클래스인 Exception 을 catch 첫번째로 둘경우 하단의 자식 예외 클래스는 이미 상단에서 처리 하였다는
         문구와 함께 사용이 불가능하게 된다 -> 런타임 에러가 발생
         */
    }
}
