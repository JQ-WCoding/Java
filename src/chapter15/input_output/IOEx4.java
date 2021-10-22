package chapter15.input_output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx4 {
    public static void main( String[] args ) {
        byte[] inputSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        byte[] outSrc;
        byte[] temp = new byte[4];

        ByteArrayInputStream input = new ByteArrayInputStream( inputSrc );
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        int length;
        try {
            while (input.available() > 0) {
                length = input.read( temp );
                output.write( temp, 0, length );
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        outSrc = output.toByteArray();

        System.out.println( "InputSrc : " + Arrays.toString( inputSrc ) );
        System.out.println( "OutputSrc : " + Arrays.toString( outSrc ) );
        // 9, 10, 11, 7 의 값이 나오던 기존과 달리 -> write()에 temp 이후 인덱스와 범위를 지정해줌으로서 알맞게 값을 정렬시켜줄 수 있다
        System.out.println( "Temp : " + Arrays.toString( temp ) );
    }
}
