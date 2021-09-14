package chapter8.ch8.exceptionHandling;

public class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println("a");
        System.out.println("b");
        try {
            System.out.println("c");
            System.out.println(0 / 0);
            System.out.println("d");
        } catch (ArithmeticException ae) {
            // c 이후에 출려되지 않고 최하단에 표시되는지 잘 모르겠음

            /*
            System.out.println()과 System.err.println()은 서로 다른 버퍼를 사용합니다.

            이 때, 이 두개의 버퍼를 다루는 환경에 따라 출력 결과가 달라집니다.

            제가 사용하고 있는 툴인 IntelliJ에서는 다른 두개의 쓰레드가 각자 out버퍼와 err버퍼를 맡아

            동시에 출력해서 순서가 뒤죽박죽이 됩니다. 아마도…
            출처 : https://onsil-thegreenhouse.github.io/programming/java/2017/12/02/java_tutorial_1-14/
             */
            ae.printStackTrace(); // stack 에 있던 메소드 정보와 예외 메세지 화면(콘솔)에 출력
            System.out.println("Exception Message : " + ae.getMessage()); // getMessage()
            // 예외클래스의 인스턴스에 저장된 메세지 호출 메소드
        }
        System.out.println("e");

        /*
        catch(ExceptionA | ExceptionB)와 같은 표기를 통해 멀티 catch 블럭이 가능하다. 또한 내부에서 if 문과 instanceof 를 통해 구분 지을 수 있지만 코드 간략화를 위한 작업이고 멀티블럭을 자주 사용하진 않는다
         */
    }
}
