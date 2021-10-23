package chapter15.input_output;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx3 {
    public static void main( String[] args ) {
        // score int 형 배열로
        int[] score = {100, 90, 95, 70, 85, 50};

        // 파일에서 Stream 형태로 값 가져오기
        FileOutputStream fos;
        // fos 에 초기화된 값을 -> DataOutputStream 으로 변환
        DataOutputStream dos;
        final String ROOT = "D:\\Code\\Java\\src\\chapter15\\input_output\\";

        try {
            // score.dat 에서 가져온 값들
            fos = new FileOutputStream( ROOT + "score.dat" );
            dos = new DataOutputStream( fos );

            for (int i : score) {
                // int 형으로 출력
                dos.writeInt( i );
            }

            dos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
