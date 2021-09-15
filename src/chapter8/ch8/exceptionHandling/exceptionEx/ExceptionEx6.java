package chapter8.ch8.exceptionHandling.exceptionEx;

public class ExceptionEx6 {
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("B");
        try {
            System.out.println("C");
            System.out.println(0 / 0);
            System.out.println("D");
        } catch (Exception e) {
            /*
             Exception 클래스는 모든 예외 클래스의 상위 부모 클래스이다
             따라서 어떤 종류의 예외사항이 발생하더라도 catch 문의 코드를 실행 할 수 있다
             -> 예외발생시 예외 클래스가 인스턴스화 된다 -> instanceof 를 통해 catch 문의 값이 true 인 경우를 확인하고
             true 인 경우 catch 문을 실행한다
             */
            System.out.println("E");
        }
        System.out.println("F");
    }
}
