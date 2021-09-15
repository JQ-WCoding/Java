package chapter8.ch8.exceptionHandling.exceptionEx;

public class ExceptionEx12 {
    // 전체적으로 throws Exception 을 통해 예외처리가 필요하다
    public static void main(String[] args) throws Exception {
        // 현재 오류가 어디에서 발생하였는지 각 메소드가 실행되는 위치마다 Exception 의 위치를 표시해준다
        // try catch 문으로 처리를 하지 않아 오류가 발생하면 예외사항을 호출한 메소드로 넘기는 식으로 계속 진행되어 methodA()까지 도달
        methodA();
    }

    static void methodA() throws Exception {
        methodB();
    }

    /*
     throws Exception 을 상속받은 상태에서 Exception 예외를 발생시킨다
     이유 : throw new Exception() 시, 예외처리를 해주지 않으면 오류를 발생시킬 코드이기 때문에 컴파일이 되지 않는다
     */
    static void methodB() throws Exception {
        throw new Exception();
    }
}
