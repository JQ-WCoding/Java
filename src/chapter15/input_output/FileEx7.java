package chapter15.input_output;

import java.io.File;

public class FileEx7 {
    public static void main( String[] args ) {
        if (args.length != 1) { // 인자값이 하나가 아니거나 하나도 없다면 출력되는 문구
            System.out.println( "USAGE : java FileEx7 pattern" );
        }
        // 현재 디렉토리 위치값 초기화
        String currDir = System.getProperty( "user.dir" );

        File dir = new File( currDir );
        final String PATTERN = args[0];

        // new FilenameFilter 인터페이스 선언 및 정의까지 한꺼번에
        String[] files = dir.list( ( dir1, name ) -> {
            // pattern 이 파일명(?) 이름에 포팜되어 있지 않은지?
            return !name.contains( PATTERN );
        } );

        // 해당 파일들 파일명 출력하기
        assert files != null;
        for (String file : files) {
            System.out.println( file );
        }
    }
}
