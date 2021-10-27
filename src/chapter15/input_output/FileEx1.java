package chapter15.input_output;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
    public static void main( String[] args ) throws IOException {
        File file = new File( "D:\\Code\\Java\\src\\chapter15\\input_output\\FileEx1.java" );
        String fileName = file.getName();

        int pos = fileName.lastIndexOf( "." ); // index 값 반환 -> 마지막 '.'의 인덱스 값 -> 확장자명

        System.out.println( "파일 이름 : " + file.getName() );
        System.out.println( "확장자를 제외한 파일이름 : " + fileName.substring( 0, pos ) );
        System.out.println( "확장자 : " + fileName.substring( pos + 1 ) );

        System.out.println( "경로를 포함한 파일이름 : " + file.getPath() );
        // 절대 경로 찾아오기
        System.out.println( "파일의 절대경로 : " + file.getAbsolutePath() );
        System.out.println( "파일 정식경로 : " + file.getCanonicalPath() );
        System.out.println( "파일이 속해 있는 디텍토리 : " + file.getParent() );
        System.out.println();

        // File 클래스 static 변수 값 -> 구분경로?
        System.out.println( "File.pathSeparator : " + File.pathSeparator );
        System.out.println( "File.separatorChar : " + File.separatorChar );
        System.out.println();
        // 인자값으로 문자열 user.dir -> 유저 경로 찾기 -> 기본 설정 루트 반환값
        System.out.println( "user.dir : " + System.getProperty( "user.dir" ) );
        // os의 시스템변수로 설정하는 sun.boot.class.path -> 시스템속성에 기본적인 classpath 가 있어서 기본적인 경로들은 이미 성정되어 있다
        System.out.println( "sun.boot.class.path : " + System.getProperty( "sun.boot.class.path" ) );
    }
}
