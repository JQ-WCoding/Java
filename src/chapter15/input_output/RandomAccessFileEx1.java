package chapter15.input_output;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx1 {
    public static void main( String[] args ) {
        String root = "src\\chapter15\\input_output\\";
        try {
            // RandomAccessFile
            RandomAccessFile raf = new RandomAccessFile( root + "test.dat", "rw" ); // -> mode "rw" 입력 시, read write 를 의미함으로 읽고 쓰기 모두 사용가능하다
            // 파일이 없으면 새로운 파일을 생성
            // test.dat 파일이 새로 생성되어 해당 파일에 저장
            System.out.println( "파일 포인터 위치 : " + raf.getFilePointer() );
            raf.writeInt( 10 ); // int 4byte 크기이기에 다음 포인터는 4에 위치해있다.
            raf.seek( 10L ); // 파일 포인터 이동 -> 10으로 이동
            System.out.println( "파일 포인터 위치 : " + raf.getFilePointer() );
            raf.writeLong( 10L ); // long 은 2배 크기인 8byte 크기이기에 그 다음 포인터는 12
            // 포인터 변경으로 인해 18 출력
            System.out.println( "파일 포인터 위치 : " + raf.getFilePointer() );

            // -> 계속해서 포인터의 위치가 변경된다
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
