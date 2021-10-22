package chapter15.input_output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx3 {
    public static void main( String[] args ) {
        byte[] inputSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        byte[] outSrc;
        byte[] temp = new byte[4];

        ByteArrayInputStream input = new ByteArrayInputStream( inputSrc );
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        System.out.println( "Input Source : " + Arrays.toString( inputSrc ) );

        try {
            while (input.available() > 0) { // 값이 남아있다면
                input.read( temp,0, 4); //  temp 배열 길이만큼 복사 -> 딱 맞게 채운다 -> 나머지 값은 0으로 변경 (길이 제한 시)
                // 기존 값을 지우고 작성이 아니라 덮어씌우기 형식으로 동작하기 때문에 뒤의 부족한 값은 이전에 초기화했던 값을 그대로 불러온다
                output.write( temp ); // output 에 값 입력

                outSrc = output.toByteArray();
                printArrays( temp, outSrc );
            }
        } catch (IOException ioe) {
            // 예외처리 문구 출력
            ioe.printStackTrace();
        }
    }

    static void printArrays( byte[] temp, byte[] outSrc ) {
        // 단순 출력문
        System.out.println( "temp : " + Arrays.toString( temp ) );
        System.out.println( "Output Source : " + Arrays.toString( outSrc ) );
    }
}
