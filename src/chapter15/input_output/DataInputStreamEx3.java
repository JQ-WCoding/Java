package chapter15.input_output;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int score;
        final String ROOT = "";

        try ( FileInputStream fis = new FileInputStream( "..\\input_output\\score.dat" );
              DataInputStream dis = new DataInputStream( fis ) ){

            while ( true ){
                // int 형 score 변수기에 int 형으로 읽어들인다
                score = dis.readInt();
                // 해당 값 출력
                System.out.println(score);
                // sum 에 score 값 계속 더하기
                sum += score;
            }
        }catch ( EOFException eofe ){
            // 예외처리가 시, 현재까지 더한 값까지만 출력
            System.out.println("sum : " + sum);
        }catch ( IOException ioe ){
            ioe.printStackTrace();
        }
    }
}
