package chapter8.ch8.exceptionHandling.finallyTest;

public class FinallyTest {
    public static void main(String[] args) {
        try {
            /*
             설치를 시작해서 파일을 설치하고 설치에 사용한 파일을 제거하는 작업
             해당 작업 도중 예외가 발생한다면 -> 설치에 사용하던 파일을 제거하는 작업인 catch 문으로 즉시 이동한다 (추가적으로 오류 내용도 출력)
             */
            startInstall();
            installFiles();
            deleteInstallFiles();
        } catch (Exception e) {
            e.printStackTrace();
            deleteInstallFiles();
        }
    }

    static void startInstall() {
        // 설치 시작
    }

    static void installFiles() {
        // 파일 설치
    }

    static void deleteInstallFiles() {
        // 설치에 사용된 파일 제거
    }
}

