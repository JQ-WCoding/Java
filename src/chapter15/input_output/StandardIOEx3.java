package chapter15.input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardIOEx3 {
    public static void main( String[] args ) {
        PrintStream ps;
        FileOutputStream fos;
        String root = "src\\chapter15\\input_output\\";
        try {
            fos = new FileOutputStream( root + "test.txt" );
            ps = new PrintStream( fos );
            // setOut() 메소드는 PrintStream 파라미터를 새로운 인자값으로 던져준다.
            //     private static native void setOut0(PrintStream out);
            System.setOut( ps ); // 즉 앞으로 System.out 으로 출력되는 문구는 root + "test.txt" 의 파일에 작성된다
        } catch (FileNotFoundException ffe) {
            System.err.println( "Cannot Find File" );
        }

        System.out.println( "Hello By System.out" ); // -> test.txt 파일에 작성
        System.err.println( "Hello By System.err" ); // -> err 문구는 그대로 콘솔창에 출력
    }
}
