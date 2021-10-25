package chapter15.input_output;

import java.io.IOException;

public class StandardIOEx1 {
    public static void main( String[] args ) {
        int input;

        try {
            while (( input = System.in.read() ) != -1) { // System.in -> 입력에 관련된 클래스
                // 내가 입력한 글들이 ascii 코드로 몇인지 알 수 있다
                // 스페이스 공백 -> 32의 값을 가지고 있다
                // 앤터키를 누르면 10의 값이 출력 -> 앤터도 값이 존재하는 추가적인 사항임
                System.out.println( "input : " + input + ", (char)input : " + (char) input );
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
