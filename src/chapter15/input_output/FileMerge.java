package chapter15.input_output;

import java.io.*;

public class FileMerge {
    public static void main( String[] args ) {
        if (args.length != 1) {
            System.out.println( "USAGE : java FileMerge fileName" );
            System.exit( 0 );
        }

        // 병합한 파일 이름
        String mergeFileName = args[0];

        try {
            // 임시 파일 생성시 -> ~merged 를 포함한다
            File tempFile = File.createTempFile( "~merged", ".tmp" );
            tempFile.deleteOnExit();

            FileOutputStream fos = new FileOutputStream( tempFile );
            BufferedOutputStream bos = new BufferedOutputStream( fos );

            BufferedInputStream bis;

            // 병합 파일의 번호는 1부터 시작
            int num = 1;

            File file = new File( mergeFileName + "_." + num );

            while (file.exists()) {
                file.setReadOnly(); // 읽기 전용으로 변환
                bis = new BufferedInputStream( new FileInputStream( file ) );

                int data = 0;

                // BufferedInputStream 클래스가 read() 메소드를 통해 읽어들이는 값이 계속 존재한다면
                while (( data = bis.read() ) != -1) {
                    // BufferedOutputStream 에 값을 입력한다
                    bos.write( data );
                }

                bis.close();
                // 파일을 새로 인스턴화 하여 해당 파일명을 인자값으로 설정
                file = new File( mergeFileName + "_." + ++num );
            }

            bos.close();
            // 이전 파일 생성
            File oldFile = new File( mergeFileName );
            // 이전 파일이 존재한다면
            if (oldFile.exists()) {
                // 이전 파일은 삭제한다
                oldFile.delete();
            }
            // 임시 파일 이름을 oldFile 로 초기화하여 사용한다
            tempFile.renameTo( oldFile );


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
