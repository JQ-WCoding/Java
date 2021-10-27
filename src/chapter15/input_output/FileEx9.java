package chapter15.input_output;

import java.io.File;

public class FileEx9 {
    public static void main( String[] args ) {
        if (args.length != 1) {
            System.out.println( "USAGE : java FileEx9 DIRECTORY" );
            System.exit( 0 );
        }

        File dir = new File( args[0] );

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println( "Not Available Dir" );
            System.exit( 0 );
        }

        File[] list = dir.listFiles();

        String fileName;
        String newFileName;
        for (File file : list) {
            // 파일명 가져오기 문자열로 반환
            fileName = file.getName();
            // 새 파일명 지정하기 -> 일반 파일명에 0000 붙이기
            newFileName = "0000" + fileName;
            // 새파일명의 길이 -7 의 인덱스만큼 나눠서 자른다
            newFileName = newFileName.substring( newFileName.length() - 7 );
            // 새 파일로 다시 선언
            file.renameTo( new File( dir, newFileName ) );
        }
    }
}
