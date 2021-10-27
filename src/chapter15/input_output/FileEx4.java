package chapter15.input_output;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx4 {
    public static void main( String[] args ) {
        // 현재 디렉토리 경로 초기화
        String currDir = System.getProperty( "user.dir" );
        File dir = new File( currDir );

        File[] files = dir.listFiles();

        File file;
        String name;
        String attribute, size = "";
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH::mm a" );
        for (File value : files) {
            file = value;
            name = file.getName();

            if (value.isDirectory()) {
                // 폴더이면 -> DIR 값을 초기화
                attribute = "DIR";
            } else {
                // size 가 문자열이기 때문에 file.length int 형에 ""를 추가하여 문자열로 반환
                size = file.length() + "";
                // 읽을 수 있는 파일이면 R
                attribute = file.canRead() ? "R" : " ";
                // 작성이 가능한 파일이면 W
                attribute += file.canWrite() ? "W" : " ";
                // 숨겨진 파일이면 H 가 속성값으로 초기화
                attribute += file.isHidden() ? "H" : " ";
            }
            // lastModified() 가장 최근 변경된 날짜, 속성값, 크기, 파일명이 출력된다
            System.out.printf( "%s %3s %6s %s\n", sdf.format( new Date( file.lastModified() ) ), attribute, size, name );
        }
    }
}
