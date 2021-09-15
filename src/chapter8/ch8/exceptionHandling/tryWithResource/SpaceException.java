package chapter8.ch8.exceptionHandling.tryWithResource;

public class SpaceException extends Exception{
    // 생성자 -> Exception 클래스에 매개변수로 받은 msg 값 초기화
    SpaceException(String msg){
        super(msg);
    }
}
