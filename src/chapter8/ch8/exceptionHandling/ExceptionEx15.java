package chapter8.ch8.exceptionHandling;

import java.io.File;

public class ExceptionEx15 {
    public static void main(String[] args) { // String args[] 는 터미널에서 파일 실행 시,
        // 입력하는 문자들을 String 배열로 매개변수로 입력받는다
        File file = new File(args[0]);
        System.out.println(file.getName() + "파일 생성");
    }

    // 파일 생성 메소드 -> static 접근제어자로 전역에서 사용가능하고 File 객체를 반환값으로 받는다
    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception();
            }
        } catch (Exception e) {
            fileName = "noname.txt";
        } finally {
            // 최종 실행되는 예외사항
            File file = new File(fileName);
            createNewFile(file);
            return file;
        }
    }

    static void createNewFile(File file) {
        try {
            file.createNewFile();
        } catch (Exception e) {

        }
    }
}
