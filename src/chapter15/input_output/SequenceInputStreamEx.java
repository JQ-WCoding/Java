package chapter15.input_output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

public class SequenceInputStreamEx {
    public static void main(String[] args) {
        // byte 배열
        byte[] arr1 = {0, 1, 2};
        byte[] arr2 = {3, 4, 5};
        byte[] arr3 = {6, 7, 8};
        byte[] outSrc;

        // Vector 선언
        Vector vector = new Vector();
        // 배열로 arr1, 2, 3 추가하기
        vector.add( new ByteArrayInputStream( arr1 ) );
        vector.add( new ByteArrayInputStream( arr2 ) );
        vector.add( new ByteArrayInputStream( arr3 ) );

        // 여러 개의 입력스트림을 연속적으로 연결 -> 하나의 스트림처럼 읽어들이는 클래스
        // 큰 파일을 여러개 작은 파일로 나눴다가 다시 합칠 때, 사용가능
        SequenceInputStream input = new SequenceInputStream( vector.elements() ); // vector 의 요소들을 하나의 Stream 으로 연결하여 데이터 수집
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        int data;

        try {
            // read() 메소드에 값이 더이상 읽을 값이 없다면, -1을 반환
            while ( (data = input.read()) != -1 ) {
                // data 값을 작성
                output.write( data );
            }
        } catch ( IOException ioe ) {
            ioe.printStackTrace();
        }

        outSrc = output.toByteArray();

        System.out.println( "Input Source1 : " + Arrays.toString( arr1 ) );
        System.out.println( "Input Source2 : " + Arrays.toString( arr2 ) );
        System.out.println( "Input Source3 : " + Arrays.toString( arr3 ) );
        System.out.println( "Output Source : " + Arrays.toString( outSrc ) );
    }
}
