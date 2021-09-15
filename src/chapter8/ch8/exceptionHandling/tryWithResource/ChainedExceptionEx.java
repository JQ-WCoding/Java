package chapter8.ch8.exceptionHandling.tryWithResource;

public class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
            // install() 메소드가 끝나는 부분에 ie 반환
        } catch (InstallException ie) { // catch 구문 실행
            ie.printStackTrace();
        } catch (Exception e) { // 상단에서 ie를 반환했기에 도달할 일이 없음...
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {
        try {
            startInstall(); // 예외가 생기기 때문에 installFiles() 실행하지 않는다
            installFiles();
        } catch (SpaceException | MemoryException e) {
            /*
             멀치 catch 문을 이용해 해당 사항 중 하나의 예외 사항이 발생할 경우 해당 블록 실행
             참조변수 ie의 initCause() 메소드에 Throwable 형 인자값을 던져주어 (SpaceException 과 MemoryException 은 Exception 을 상속받았기 때문에 최상위 Throwable 도 가지고 있음
             Throwable -> Error, Exception 으로 나뉨
             */
            InstallException ie = new InstallException("설치 예외");
            ie.initCause(e);
            // 원인을 인자값으로 던진 참조변수 ie 반환
            throw ie;
        } finally {
            deleteFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치공간 부족");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리부족");
        }
    }

    static void installFiles() {

    }

    static void deleteFiles() {

    }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }
}
