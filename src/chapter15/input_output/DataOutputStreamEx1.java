package chapter15.input_output;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx1 {
    public static void main( String[] args ) {
        // 선언만 해두고 예외처를 위해 구현은 try 문에서 한다
        FileOutputStream fos;
        DataOutputStream dos;
        // 절대 경로
        final String ROOT = "D:\\Code\\Java\\src\\chapter15\\input_output\\";

        try {
            // 해당 루트에 파일명으로 없으면 생성
            fos = new FileOutputStream( ROOT + "sample.dat" );
            // fos 의 값을 data 로 출력
            dos = new DataOutputStream( fos );
            // 10
            dos.writeInt( 10 );
            // float 형 20.0f 넣기
            dos.writeFloat( 20.0f );
            // boolean true 값 넣기
            dos.writeBoolean( true );

            dos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
