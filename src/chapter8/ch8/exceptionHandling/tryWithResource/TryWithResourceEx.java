package chapter8.ch8.exceptionHandling.tryWithResource;

public class TryWithResourceEx {
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false);
        }
        // 멀티 catch 문으로 줄여서 사용가능
        catch (WorkException | CloseException e) {
            e.printStackTrace();
        }

        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true);
        } catch (WorkException we) {
            we.printStackTrace();
        } catch (CloseException ce) {
            ce.printStackTrace();
        }

        /*
        상단의 try catch 문은 false 를 인자값으로 넘겼기 때문에 workException 이 인스턴스화 되지 않아 close()로 이동
        하지만, 하단의 문구는 true 를 인자값을 넘겼기 떄문에 workException 이 인스턴스화 되고 해당 예외문구를 출력 후 (WorkException!) close() 로 이동
         */
    }
}
