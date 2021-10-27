package chapter15.input_output;

import java.io.*;

public class FIleSplit {
    public static void main( String[] args ) {
        if (args.length < 2) { // 인자값이 두개 이상이어야 if 문을 지나감
            System.out.println( "USAGE : java FileSplit fileName SIZE_KB" );
            System.exit( 0 );
        }

        /*
        한 파일을 크기를 잘라서 다중 분할하는 과정
         */
        // 두번째 인자값은 정수형으로 변환해서 1000곱한 값을 VOLUME 변수에 저장한다
        final int VOLUME = Integer.parseInt( args[1] ) * 1000;

        try {
            // 파일명은 첫번째 인자값으로 받은 문자열 값이 파일명이다
            String fileName = args[0];
            FileInputStream fis = new FileInputStream( fileName );
            BufferedInputStream bis = new BufferedInputStream( fis );

            // fis, bos 의 값으로!
            FileOutputStream fos;
            BufferedOutputStream bos = null;

            int data;
            int i = 0;
            int number = 0;

            while (( data = bis.read() ) != -1) {
                // 나머지가 0이면
                if (i % VOLUME == 0) {
                    if (i != 0) {
                        bos.close();
                    }
                    // 파일명과 번호를 +1한값으로 초기화한다
                    fos = new FileOutputStream( fileName + "_." + ++number );
                    bos = new BufferedOutputStream( fos );
                }
                bos.write( data );
                i++;
            }
            bis.close();
            bos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
