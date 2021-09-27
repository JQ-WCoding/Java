package chapter10.calendarAndDate;

import java.util.Calendar;
import java.util.Objects;

public class CalendarEx2 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        // 왜 두개는 같은 값이 아니지...?
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        // 날짜 설정! -> 기본값이 아니라 set 을 통해 설정하면 다른 달짜가 나온다!
        date1.set(2021, Calendar.JUNE, 20); // final 값이고 사용하는데 더 직관적인 Calendar.SEPTEMBER 변수를 사용하는 것이 더 좋음
//        date1.set(2021,8,27);
        // DAY_OF_WEEK[] 에 해당 주의 날짜가 몇번째인지 반환하는 get(Calendar.DAY_OF_WEEK)을 통해 요일을 출력
        System.out.println("date1 : " + toString(date1) + " " + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + ", ");
        System.out.println("today(date2) : " + toString(date2) + " " + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + ".");

        // int 길이보다 더 넓은 범위의 값인 경우 대비 long 형으로 선언 -> 밀리초인만큼 나누기 1000을 통해 초 단위로 변경 -> 1000밀리초 = 1초
        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;

        System.out.println("the day(date1) to today(date2) : passed " + difference + "seconds");

        // 24시간 * 60초 * 60분 -> 하루
        System.out.println("days : " + difference / (24 * 60 * 60) + "days");
    }

    // 연월일 출력 메소드
    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + ". " + (date.get(Calendar.MONTH) + 1) + ". " + date.get(Calendar.DATE);
    }
}
