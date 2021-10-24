package chapter15.input_output;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
    public static void main(String[] args) {
        String fileName = "test.txt";

        try {
            FileInputStream fis = new FileInputStream( fileName );
            FileReader fr = new FileReader( fileName );

            int data;
            // FileInputStream 으로 읽어들이기
            while ( (data = fis.read()) != -1 ) {
                System.out.print( ( char ) data );
            }
            System.out.println();
            fis.close();

            // FileReader 로 읽어들이기
            while ( (data = fr.read()) != -1 ) {
                System.out.print( ( char ) data );
            }
            System.out.println();
            fr.close();

            // 두 출력문의 차이 -> FileReader 는 한글도 읽어들인다
        } catch ( IOException ioe ) {
            ioe.printStackTrace();
        }
    }
}
