package chapter15.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
    public static void main( String[] args ) {
        String line;

        try {
            // Scanner 와 같이 값을 입력받는 클래스 -> Stream 형으로 읽어들인다는 것
            InputStreamReader isr = new InputStreamReader( System.in );
            // BufferedReader 에 입력받아 인스턴화하는 생성자를 만든다
            BufferedReader br = new BufferedReader( isr );

            System.out.println( "현재 os의 인코딩 정보 : " + isr.getEncoding() ); // 현재 os의 인코딩은 UTF8 

            do { // 무조건 한번 실행
                System.out.print( "문장 입력, 종료는 q >> " );
                line = br.readLine();
                System.out.println( "입력 문장 : " + line );
            } while (!line.equalsIgnoreCase( "q" )); // 입력 받은 줄이 (line 변수) q 또는 Q 가 아니라면 계속 반복

            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
