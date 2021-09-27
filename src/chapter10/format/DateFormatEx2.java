package chapter10.format;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatEx2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // 날짜 기입
        calendar.set(2018, Calendar.OCTOBER, 24);

        Date date = calendar.getTime(); // -> 시간으로 변경 Date format 으로 변경

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;

        // format 형식 선언
        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("yy-MM-dd E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        // 해당 형식에 맞게 출력
        System.out.println(sdf1.format(date));
        System.out.println(sdf2.format(date));
        System.out.println(sdf3.format(date));
        System.out.println(sdf4.format(date));
    }
}
