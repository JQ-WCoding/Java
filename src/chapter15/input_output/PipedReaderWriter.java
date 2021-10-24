package chapter15.input_output;

public class PipedReaderWriter {
    public static void main(String[] args) {
        // 생성자와 함께 Thread name 설정
        InputThread inputThread = new InputThread( "InputThread" );
        OutputThread outputThread = new OutputThread( "OutputThread" );

        // private 이 아니라서 그냥 가져와서 사용해도 상관없다
        inputThread.connect( outputThread.getPw() );

        inputThread.start();
        outputThread.start();
    }
}
