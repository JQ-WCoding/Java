package sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateSample {
    public static void main( String[] args ) {
        // 현재시간 년도와 요일 찾기 위한 수정 건
        final String strYear = LocalDateTime.now().format( DateTimeFormatter.ofPattern( "yyyy" ) );
        final String strMonth = LocalDateTime.now().format( DateTimeFormatter.ofPattern( "MM" ) );
        System.out.println( "strYear = " + strYear );
        System.out.println( "strMonth = " + strMonth );
    }
}
