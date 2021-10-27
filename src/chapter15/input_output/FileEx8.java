package chapter15.input_output;

import java.io.File;

public class FileEx8 {
    static int deletedFiles = 0;

    public static void main( String[] args ) {
        // 기본 패턴...
        if (args.length != 1) {
            System.out.println( "USAGE : java FileEx8 Extension" );
            System.exit( 0 );
        }

        String currentDir = System.getProperty( "user.dir" );

        File dir = new File( currentDir );
        String exit = "." + args[0];
    }

    private static void delete( File dir, String ext ) {
        File[] files = dir.listFiles();

        for (File file : files) {
            // 폴더인 경우
            if (file.isDirectory()) {
                // 재귀함수로 해당 폴더 내의 파일들로 삭제
                delete( file, ext );
            } else {
                String fileName = file.getAbsolutePath();

                // 확장자명
                if (fileName.endsWith( ext )) {
                    System.out.print( fileName );
                    // 파일이 삭제 성공하면
                    if (file.delete()) {
                        // 해당 문구 출력
                        System.out.println( "-Success Delete" );
                        // 삭제한 파일 값 +1 씩 상승
                        deletedFiles++;
                    } else {
                        // 삭제 실패 시, 출력문
                        System.out.println( "- Fail Delete" );
                    }
                }
            }
        }
    }
}
