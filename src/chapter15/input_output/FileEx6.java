package chapter15.input_output;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileEx6 {
    static int found = 0;

    public static void main( String[] args ) {
        if (args.length != 2) {
            System.out.println( "USAGE : java FileEx6 DIRECTORY KEYWORD" );
            System.exit( 0 );
        }

        File dir = new File( args[0] );
        String keyboard = args[1];

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println( "Not Available Dir" );
            System.exit( 0 );
        }

    }

    private static void findInFiles( File dir, String keyword ) throws IOException {
        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                // file 이 폴더이면 다시 재귀함수를 통해 파일들 찾기
                findInFiles( file, keyword );
            } else {
                String fileName = file.getName();
                String extension = fileName.substring( fileName.lastIndexOf( "." ) + 1 );
                extension = "," + extension + ",";

                // if(",java,txt,bak,".indexOf(extension) == -1)
                // 포함하고 있지 않으면 포현이 더 좋음
                if (!",java,txt,bak,".contains( extension )) continue;

                // 절대 경로 + 파일 구분자 + 파일명
                fileName = dir.getAbsolutePath() + File.separator + fileName;

                // FileReader 를 통해 file 들 가져오기
                FileReader fr = new FileReader( file );
                // 해당 파일의 내용을 읽어들이기 위한 bf 선언
                BufferedReader br = new BufferedReader( fr );

                String data;
                int lineNum = 0;

                // 읽어들이는 파일의 내용에 다음줄이 있을 경우 계속 진행
                while (( data = br.readLine() ) != null) {
                    lineNum++;

                    // data 가 keyword 값을 가지고 있지 않다면
                    if (!data.contains( keyword )) {
                        found++;
                        System.out.println( "[" + fileName + "(" + lineNum + ")]" + data );
                    }
                }
                br.close();
            }
        }
    }
}
