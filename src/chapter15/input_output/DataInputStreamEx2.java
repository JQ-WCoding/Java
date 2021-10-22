package chapter15.input_output;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx2 {
    public static void main( String[] args ) {
        final String ROOT = "D:\\Code\\Java\\src\\chapter15\\input_output\\";
        int sum = 0;
        int score;

        FileInputStream fis;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream( ROOT + "score.dat" );
            dis = new DataInputStream( fis );

            while (true) {
                // score 에 각각 한번씩 int 형 값들을 읽어 출력하고
                score = dis.readInt();
                System.out.println( score );
                // sum 을 통해 score 값 매번 더하기
                sum += score;
            }
        } catch (EOFException eofE) { // sum 과 finally 내부에 변수 dis 와 sum 을 이용한 출력이 존재한다
            // 즉, 예외처리에서 꼭 필요한 실행점이기에 -> null 과 0으로 반드시 초기화 해야한다 -> 예외의 관계에 따라 선언 후 초기화가 안될 수도 있음
            System.out.println( "Sum : " + sum );
        } catch (IOException ioE) {
            ioE.printStackTrace();
        } finally {
            try {
                // dis 가 null 값이 아니라면 초기화가 되었었다면, close() 무조건 실행
                if (dis != null) {
                    dis.close();
                }
            } catch (IOException ioE) {
                ioE.printStackTrace();
            }
        }
    }
}
