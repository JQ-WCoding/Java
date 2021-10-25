package chapter15.input_output;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx3 {
    public static void main( String[] args ) {
        int sum = 0;
        String root = "src\\chapter15\\input_output\\";
        try {
            RandomAccessFile raf = new RandomAccessFile( root + "score.dat", "r" ); // "r" 은 readOnly 이기에 값을 입력할 순 없다
            int i = 4;

            while (true) {
                raf.seek( i ); // 해당 커서 위치 변경
                sum += raf.readInt(); // int 형으로 읽어들인 반환값 모두 sum 에 저장
                i += 16; // 한줄의 값이 int 형 4개로 구성되어 있기에 16byte 커서를 옮겨 다음 줄의 값을 찾도록 설정
            }
        } catch (EOFException eofe) {
            // 예외사항에 의해 종료되면, sum 값 출력
            System.out.println( "sum : " + sum );
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
