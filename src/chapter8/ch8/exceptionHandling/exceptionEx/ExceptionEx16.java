package chapter8.ch8.exceptionHandling.exceptionEx;

import java.io.File;

public class ExceptionEx16 {
    public static void main(String[] args) {
        //
        try {
            File file = createFile(args[0]); // 빈칸이나 파일 명이 없을 경우 catch 문으로 이동
            System.out.println(file.getName() + "생성 완료");
        } catch (Exception e) {
            // 다시 입력해주세요 출력
            System.out.println(e.getMessage() + "다시 입력해주세요");
        }
    }

    static File createFile(String fileName) throws Exception {
        // 조건문에 의해 파일명이 없거나 빈문자열인 경우 -> 오류내용을 담은 Exception 이 인스턴스화 되어 처리된다
        if (fileName == null || fileName.equals("")) {
            throw new Exception("유효하지 않은 파일명");
        }

        // 조건문의 부합하지 않는 경우
        File file = new File(fileName);

        file.createNewFile();
        // 파일을 생성하고 해당 객체를 반환한다
        return file;
    }
}
