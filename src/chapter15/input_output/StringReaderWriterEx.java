package chapter15.input_output;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterEx {
    public static void main( String[] args ) {
        // 문자열 "AAA" 를 StringReader 의 인스턴스화 시, parameter 로 값을 넘겨준다
        String inputData = "AAA";
        StringReader input = new StringReader( inputData );
        StringWriter output = new StringWriter();

        int data;

        try {
            while (( data = input.read() ) != -1) { // 값이 계속 유지되고 있는지에 대한 확인
                // 반복문이 지속되는 이유 -> StringReader 의 변수 next 가 ++ 되고 있기 때문에
                output.write( data );
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println( "Input Data : " + inputData );
//        System.out.println( "Output Data : " + output.toString() );
        // toString() 사용할 이유 없음
        System.out.println( "Output Data : " + output );
        // getBuffer() 를 통해 StringBuffer 형 값을 다시 toString() 을 이용해 문자열로 반환한다.
        System.out.println( "Output Data : " + output.getBuffer().toString() );
    }
}
