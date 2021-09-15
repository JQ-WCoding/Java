package chapter8.ch8.exceptionHandling.finallyTest;

public class FinallyTest2 {
    public static void main(String[] args) {
        // try 문을 통해 설치시작과 파일을 통해 설치하는 작업 중 오류가 발생하는 부분 설정
        try {
            startInstall();
            installFiles();
        } catch (Exception e) {
            // 예외가 발생할 경우 해당 오류 내용 출력
            e.printStackTrace();
        } finally {
            // finally 를 통해 -> try 문이 예외 없이 종료되거나 예외가 발생하여도 항상 해당 내부의 코드를 실행한다
            deleteInstallFiles(); // 예외 발생과 관련없이 항상 설치에 사용된 파일은 모두 삭제한다
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
