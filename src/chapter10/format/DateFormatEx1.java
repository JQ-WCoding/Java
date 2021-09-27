package chapter10.format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx1 {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4, sdf5, sdf6, sdf7, sdf8, sdf9;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        // E 는 요일 표현 가능
        sdf2 = new SimpleDateFormat("''yy년 MM dd일 E요일");
        // ss초 SSS 는 밀리 초까지 가능
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        // a 는 오전 오후를 나눌 수 있는 표현방법
        sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        System.out.println("오늘은");
        // day 는 대소문자가 해와 주의 표현이 다름....
        sdf5 = new SimpleDateFormat("올 해의 D번째 날");
        sdf6 = new SimpleDateFormat("이 달의 d번째 날");
        sdf7 = new SimpleDateFormat("올 해의 w번째 주");
        sdf8 = new SimpleDateFormat("이 달의 W번째 주");
        sdf9 = new SimpleDateFormat("이 달의 F번째 E요일");

        // 각 형식에 맞는 표현 법으로 출력
        System.out.println(sdf1.format(today));
        System.out.println(sdf2.format(today));
        System.out.println(sdf3.format(today));
        System.out.println(sdf4.format(today));

        System.out.println();

        System.out.println(sdf5.format(today));
        System.out.println(sdf6.format(today));
        System.out.println(sdf7.format(today));
        System.out.println(sdf8.format(today));
        System.out.println(sdf9.format(today));
    }
}
