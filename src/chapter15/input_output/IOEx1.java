package chapter15.input_output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {
    public static void main( String[] args ) {
        // 입력할 소스를 byte 배열로 선언 및 초기화
        byte[] inputSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 출력할 소스는 선언만 하고 이후 초기화
        byte[] outSrc;

        ByteArrayInputStream input = new ByteArrayInputStream( inputSrc );
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        
        // data 값
        int data;
        // input.read()의 반환형인 int 인 data 변수에 값이 존재없으면 -1, 존재한다면 각각의 수들이 초기화된다
        while (( data = input.read() ) != -1) {
            // output 에 write() 메소드를 통해 data 값 반복문마다 배열에 값 넣어주기
            output.write( data );
        }

        // 입력된 배열의 값을 byte 형으로 변환한 값 -> outSrc 에 초기화
        outSrc = output.toByteArray();

        System.out.println( "InputSrc : " + Arrays.toString( inputSrc ) );
        System.out.println( "OutputSrc : " + Arrays.toString( outSrc ) );
    }
}
