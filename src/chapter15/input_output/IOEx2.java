package chapter15.input_output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx2 {
    public static void main( String[] args ) {
        byte[] inputSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc;
        // 임시 byte 배열 선언
        byte[] temp = new byte[10];

        ByteArrayInputStream input = new ByteArrayInputStream( inputSrc );
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        int data = input.read( temp, 0, temp.length ); // 읽은 수 반환 -> read() 메소드를 통해 읽어들이고 첫번째 인자값 temp 배열에 복사한다
        output.write( temp, 5, 5 ); // -> 덮어쓰기
        // outSrc 에 Stream -> 배열로 반환
        outSrc = output.toByteArray();

        System.out.println( "InputSrc : " + Arrays.toString( inputSrc ) );
        System.out.println( "OutputSrc : " + Arrays.toString( outSrc ) );
        System.out.println( "Temp : " + Arrays.toString( temp ) );
        System.out.println(data);
    }
}
