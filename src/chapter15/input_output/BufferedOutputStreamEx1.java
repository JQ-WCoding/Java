package chapter15.input_output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {
    public static void main( String[] args ) {
        // 절대경로 설정
        final String ROOT = "D:\\Code\\Java\\src\\chapter15\\input_output\\";

        try {
            // sample.txt 파일 불러와 Stream 으로 전환
            FileOutputStream fos = new FileOutputStream( ROOT + "sample.txt" );
            // buffer 형식을 통해 -> 크기 5만큼의 fos 를 불러오기
            BufferedOutputStream bos = new BufferedOutputStream( fos, 5 );

            // 1 ~ 9까지 입력
            for (int i = '1'; i <= '9'; i++) {
                bos.write( i );
                // but, 크기가 5이기 때문에 나머지 출력하지 못하고 종료
            }
            // BufferedOutputStream 도 종료해주어야 버퍼에 남아있던 모든 내용이 전부 출력된다.

            bos.close();
            //  BufferedOutputStream 을 종료함으로서 FileOutputStream 은 close() 를 사용하지 않아도 된다 -> Buffered 기반이기 때문에
            // 따로 추가적인 호출이 불필요하다
//            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
