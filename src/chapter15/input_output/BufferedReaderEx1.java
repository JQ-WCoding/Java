package chapter15.input_output;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx1 {
    public static void main( String[] args ) {
        final String ROOT = "src\\chapter15\\input_output\\";
        try {
//            File file = new File("hi");
//            System.out.println(file.getAbsolutePath());
            // 파일의 경로가 어디로 설정되어 있는지 알아보기 위해 getAbsolutePath() 를 이용해 경로를 찍어보았다

            FileReader fr = new FileReader( ROOT + "BufferedReaderEx1.java" );
            BufferedReader br = new BufferedReader( fr );


            String line;

            // br.readLine() 이 null 값이 아닐 때 까지
            for (int i = 1; ( line = br.readLine() ) != null; i++) {
                // ";"를 포함하고 있다면
                if (line.contains( ";" )) {
                    System.out.println( i + " : " + line );
                }
            }

            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        // 출력문을 통해 ; 가 포함되지 않은 try catch 문은 출력되지 않는 것을 확인할 수 있었다.
    }
}
