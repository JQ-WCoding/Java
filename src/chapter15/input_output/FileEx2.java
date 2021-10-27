package chapter15.input_output;

import java.io.File;

public class FileEx2 {
    public static void main( String[] args ) {
        if (args.length != 1) {
            System.out.println( "USAGE : java FileEx2 DIRECTORY" );
            System.exit( 0 );
        }

        File file = new File( args[0] );

        if (!file.exists() || !file.isDirectory()) {
            System.out.println( "Not available dir" );
            System.exit( 0 ); // VM 종료 -> 인자값
            // 0 => 다 괜찮아
            // + => 내가 잘못했을 가능성이있는 것으로 잘못 예상 됨 (잘못된 명령 줄, 파일을 찾을 수 없음, 서버에 연결할 수 없음)
            // - => 내가 전혀 예상하지 못한 것이 잘못되었습니다 (예 : 시스템 오류-예상치 못한 예외-외부 강제 종료 kill -9)
        }

        File[] files = file.listFiles();

        String fileName;
        for (File value : files) {
            fileName = value.getName(); // getName() 가져오기
            // -> directory 이면 [파일명] , 아닌 경우 기본 파일명 -> 디렉토리 폴더에 포함된 파일명과 폴더명을 출력
            System.out.println( value.isDirectory() ? "[" + fileName + "]" : fileName );
        }
    }
}
