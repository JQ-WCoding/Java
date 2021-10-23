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

        SequenceInputStream input = new SequenceInputStream( vector.elements() );
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        int data = 0;

        try {
            while ( (data = input.read()) != -1 ) {
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
