package chapter15.input_output;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;

public class InputThread extends Thread {
    PipedReader pr = new PipedReader();
    StringWriter sw = new StringWriter();

    // 생성자
    InputThread(String name) {
        // Thread 내에 변수 name 초기화
        super( name );
    }

    public void run() {
        int data;
        try {
            // data 읽어들여 표시
            while ( (data = pr.read()) != -1 ) {
                sw.write( data );
            }
            System.out.println( getName() + " received : " + sw.toString() );
        } catch ( IOException ioe ) {
            ioe.printStackTrace();
        }
    }

    // 인스턴스 변수로 선언된 pr 을 반환
    public PipedReader getPr() {
        return pr;
    }

    // connect() 메소드의 PipedWriter 와 PipedReader 를 통해, 상호간의 메세지를 주고 받는다.
    public void connect(PipedWriter pw) {
        // PipedWriter 와 PipedReader 연결하기
        try {
            pr.connect( pw );
        } catch ( IOException ioe ) {
            ioe.printStackTrace();
        }
    }
}
