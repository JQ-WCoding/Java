package chapter15.input_output;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileConversion {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader( args[0] );
            FileWriter fw = new FileWriter( args[1] );

            int data;

            while ( (data = fr.read()) != -1 ) { // 입력 값이 계속 존재할 경우
                // data 의 값이 단순 줄바꿈, 띄어쓰기, 커서를 문장 제일 앞으로 등의 문구가 아니라면
                if ( data != '\t' && data != '\n' && data != ' ' && data != '\r' ) {
                    // fileWriter 에 data 값을 입력한다
                    fw.write( data );
                }
            }
            fr.close();
            fw.close();
        } catch ( IOException ioe ) {
            ioe.printStackTrace();
        }
    }
}
