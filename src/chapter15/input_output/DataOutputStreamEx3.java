package chapter15.input_output;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx3 {
    public static void main( String[] args ) {
        // score int 형 배열로
        int[] score = {100, 90, 95, 70, 85, 50};

        FileOutputStream fos;
        DataOutputStream dos;
        final String ROOT = "D:\\Code\\Java\\src\\chapter15\\input_output\\";

        try {
            // score.dat 에서 가져온 값들
            fos = new FileOutputStream( ROOT + "score.dat" );
            dos = new DataOutputStream( fos );

            for (int i : score) {
                dos.writeInt( i );
            }

            dos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
