package chapter8.ch8.exceptionHandling.exceptionEx;

import java.io.File;

public class ExceptionEx15 {
    public static void main(String[] args) { // String args[] 는 터미널에서 파일 실행 시,
        // 입력하는 문자들을 String 배열로 매개변수로 입력받는다
        File file = createFile(args[0]);
        System.out.println(file.getName() + "파일 생성");
    }

    // 파일 생성 메소드 -> static 접근제어자로 전역에서 사용가능하고 File 객체를 반환값으로 받는다
    static File createFile(String fileName) {
        try {
            // 파일명이 없거나 빈값일 때
            if (fileName == null || fileName.equals("")) {
                // 강제로 예외를 던진다
                throw new Exception();
            }
        } catch (Exception e) {
            // 예외사항의 경우 noname.txt 를 문자열로 입력받아 텍스트를 생성한다
            fileName = "chapter8/ch8/exceptionHandling/noname.txt";
        } finally {
            // 최종 실행되는 예외사항
            File file = new File(fileName);
            createNewFile(file);
            return file;
        }
    }

    static void createNewFile(File file) {
        try {
            // 파일 생성
            file.createNewFile();
        } catch (Exception e) {

        }
    }
}
