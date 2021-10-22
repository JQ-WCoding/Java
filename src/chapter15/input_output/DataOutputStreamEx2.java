package chapter15.input_output;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class DataOutputStreamEx2 {
    public static void main( String[] args ) {
        ByteArrayOutputStream bos;
        DataOutputStream dos;

        byte[] result;

        try {
            bos = new ByteArrayOutputStream();
            dos = new DataOutputStream( bos );
            dos.writeInt( 10 );
            dos.writeFloat( 20.0f );
            dos.writeBoolean( true );

            // 결과를 byte 배열로 전환한 값 초기화
            result = bos.toByteArray();

            // 문자열 배열 hex 변수 선인 및 result.length 길이 만큼 초기화
            String[] hex = new String[result.length];

            for (int i = 0; i < result.length; i++) {
                if (result[i] < 0) { // 값이 - 부호이면 256 을 추가로 더해서 + 부호로 바꿔준다 -> 정반대 값 -> 1byte 는 0 ~ 255 범위이기에 1 추가
                    hex[i] = String.format( "%02x", result[i] + 256 );
                } else {
                    hex[i] = String.format( "%02x", result[i] );
                }
            }
            // result 는 기본 결과값 10진수, hex 값은 16진수
            System.out.println( "10진수 : " + Arrays.toString( result ) );
            System.out.println( "16진수 : " + Arrays.toString( hex ) );
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
