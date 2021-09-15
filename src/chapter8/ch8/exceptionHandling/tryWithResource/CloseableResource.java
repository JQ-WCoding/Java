package chapter8.ch8.exceptionHandling.tryWithResource;

// AutoCloseable 인터페이스를 상속받아  Data I/O 등의 관련 클래스 사용시 close()가 유발할 수 잇는 예외를 처리하기 위함이다
public class CloseableResource implements AutoCloseable {
    // WorkException 상속 -> Exception 도 상속
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println(exception + "호출");
        // 매개변수 boolean 형 exception 으로 조건문을 판별하여 true 인 경우 새 WorkException 을 인스턴화하고 문자열을 인자값으로 오류 메세지를 초기화 한다
        if (exception) {
            throw new WorkException("WorkException!");
        }
    }

    public void close() throws CloseException {
        System.out.println("close() 호출");
        throw new CloseException("CloseException!");
    }
}
