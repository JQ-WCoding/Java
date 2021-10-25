package chapter15.input_output;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx2 {
    public static void main( String[] args ) {
        String root = "src\\chapter15\\input_output\\";
        int[] score = {
                1, 100, 90, 90,
                2, 70, 100, 80,
                3, 60, 70, 90,
                4, 10, 100, 20,
                5, 30, 90, 80
        };

        try {
            RandomAccessFile raf = new RandomAccessFile( root + "score2.dat", "rw" );

            for (int i : score) {
                raf.writeInt( i ); // 해당 값을 전부 입력
            }

            raf.seek( 0 ); // 포인터의 위치 변경 필요 -> 포인터의 위치를 0부터 시작하도록 한다
            while (true) { // 파일의 마지막 부분부터 읽어들이기 때문에 값이 없어서 즉시 EOFException 예외 처리되어 반복문이 종료된다
                System.out.println( raf.readInt() ); // int 형으로 읽어들인다
            }
        } catch (EOFException eofe) { // IOException 으로도 걸러진다
            eofe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
