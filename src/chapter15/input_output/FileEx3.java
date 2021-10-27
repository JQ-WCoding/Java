package chapter15.input_output;

import java.io.File;
import java.util.ArrayList;

public class FileEx3 {
    static int totalFiles = 0;
    static int totalDirs = 0;

    public static void main( String[] args ) {
        // arguments 를 받지 못했을 경우
        if (args.length != 1) {
            System.out.println( "USAGE : java FileEx3 DIRECTORY" );
            System.exit( 0 );
        }

        File dir = new File( args[0] );

        // dir 이 존재하지 않거나 폴더가 아닌경우
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println( "Not available dir" );
            System.exit( 0 ); // -> 어떠한 상황에서도 종료
        }

        printFileList( dir );

        System.out.println();
        System.out.println( "totalFiles : " + totalFiles );
        System.out.println( "totalDirs : " + totalDirs );
    }

    private static void printFileList( File dir ) {
        System.out.println( dir.getAbsolutePath() + " dir" );
        // 인자값으로 받은 File 인스턴스의 파일들 File 배열에 저장
        File[] files = dir.listFiles();
        // ArrayList 문자열 형으로 값을 저장
        ArrayList<String> subDir = new ArrayList<>();

        for (int i = 0; i < files.length; i++) {
            // 파일명 가져오기
            String fileName = files[i].getName();
            // 해당 파일이 dir 이면
            if (files[i].isDirectory()) {
                // [] 를 추가
                fileName = "[" + fileName + "]";
                // 번호 추가
                subDir.add( i + "" );
            }
            System.out.println( fileName );
        }

        int dirNum = subDir.size();
        int fileNum = files.length - dirNum;

        totalFiles += fileNum;
        totalDirs += dirNum;

        // 총 파일 수와 총 폴더 수 출력
        System.out.println( fileNum + "개 파일, " + dirNum + "개 디렉토리" );
        System.out.println();

        for (String s : subDir) {
            // index 를 입력해서 -> files 이름 가져오기
            int index = Integer.parseInt( s );
            printFileList( files[index] );
        }
    }
}
