package chapter8.ch8.exceptionHandling.tryWithResource;

public class MyExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            // startInstall() 에서 예외가 발생하여 installFiles() 가 실행되지 않고 catch 블록으로 넘어간 것을 확인가능
            installFiles();
        } catch (SpaceException se) { // 저장공간 부족
            System.out.println(se.getMessage());
            se.printStackTrace();
            System.out.println("공간확보가 필요");
        } catch (MemoryException me) { // 메모리 부족
            System.out.println(me.getMessage());
            System.gc(); // gc() -> 가비지 콜렉터 호출 -> 정리를 통해 즉시 수행할 메모리를 늘려준다
            System.out.println("재시도");
        } finally {
            deleteFiles(); // 설치파일 삭제
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        System.out.println("start install");
        if (!enoughSpace()) {
            throw new SpaceException("저장공간 부족");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리 부족");
        }
    }

    static void installFiles() {
        System.out.println("install files");
    }

    static void deleteFiles() {
        System.out.println("delete files");
    }

    // 저장공간 확인 문구 -> false 반환
    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
        // 만약 둘다 false 이면? -> catch 문의 순서상 상단의 space 예외 사항이 먼저 확인 됨으로 space 관련 예외사항을 처리하고 finally 블록을 실행
    }
}
