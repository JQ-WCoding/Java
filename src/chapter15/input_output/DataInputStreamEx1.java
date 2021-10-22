package chapter15.input_output;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx1 {
    public static void main( String[] args ) {
        final String ROOT = "D:\\Code\\Java\\src\\chapter15\\input_output\\";
        try {
            // sample.dat 파일에 있는 파일 입력받는다 -> Stream 으로
            FileInputStream fis = new FileInputStream( ROOT + "sample.dat" );
            // DataInputStream 에 해당 루트에서 가져온 값을 세팅한다
            DataInputStream dis = new DataInputStream( fis );

            // InputStream 통해 입력된 값을 -> int 형, float 형, boolean 형으로 나눠서 각각에 맞게 읽어나가게 한다
            System.out.println( dis.readInt() );
            System.out.println( dis.readFloat() );
            System.out.println( dis.readBoolean() );

            dis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
