package chapter15.input_output;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class OutputThread extends Thread {
    PipedWriter pw = new PipedWriter();

    OutputThread(String name) {
        // InputThread 와 동일 -> Thread 의 변수 name 에 값 입력
        super( name );
    }

    public void run() {
        String message = "HI";
        try {
            // Thread 를 상속받아 getName() 메소드 사용 -> name 값 반환
            System.out.println( getName() + " sent : " + message );
            // 해당 message 문자열은 pw.write() 를 통해 작성
            pw.write( message );
            pw.close();
        } catch ( IOException ioe ) {
            ioe.printStackTrace();
        }
    }

    public PipedWriter getPw() {
        return pw;
    }

    public void connect(PipedReader pr) {
        try {
            pw.connect( pr );
        } catch ( IOException ioe ) {
            ioe.printStackTrace();
        }
    }

}
