package chapter10.calendarAndDate;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {

        Calendar today = Calendar.getInstance();

        System.out.println("Year : " + today.get(Calendar.YEAR) + "년");
        // 0 ~ 11 이라 1 ~ 12로 바꾸기 위한 변경
        System.out.println("Month : " + (Integer.parseInt(String.valueOf(today.get(Calendar.MONTH))) + 1) + "월");
        System.out.println("Week of this year : " + today.get(Calendar.WEEK_OF_YEAR));
//        System.out.println("This Week of the month : " + today.get(4));
        System.out.println("Week of this month : " + today.get(Calendar.WEEK_OF_MONTH)); // Calendar.WEEK_OF_MONTH 의 값이 4이기에 사용해봄

        // DATE = DAY_OF_MONTH
        System.out.println("the day of this month : " + today.get(Calendar.DATE));
        System.out.println("the day of this month : " + today.get(Calendar.DAY_OF_MONTH)); // 이번달의 몇번째 일인지
        System.out.println("the day of this year : " + today.get(Calendar.DAY_OF_YEAR)); // 올해의 몇번째 일인지
        System.out.println("Day : " + today.get(Calendar.DAY_OF_WEEK)); // 1: Sunday, 2: Monday ... 7: Saturday -> 월은 0부터 시작하지만 요일은 1부터 시작
        System.out.println("the day of this week in month : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 이달의 요일
        System.out.println("0-> AM, 1-> PM : " + today.get(Calendar.AM_PM)); // 현재 오전인지 오후인지 출력
        System.out.println("Time(0 ~ 11) : " + today.get(Calendar.HOUR)); // 12시간 기준으로 사용할때
        System.out.println("Time(0 ~ 23) : " + today.get(Calendar.HOUR_OF_DAY)); // 24시간 기준으로 시간표시
        System.out.println("Minute(0 ~ 59) : " + today.get(Calendar.MINUTE));
        System.out.println("Second(0 ~ 59) : " + today.get(Calendar.SECOND));
        System.out.println("MilliSecond(0 ~ 999) : " + today.get(Calendar.MILLISECOND));

        System.out.println("TimeZone(-12 ~ +12) : " + (today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000)));

        System.out.println("The last day of this month : " + today.getActualMaximum(Calendar.DATE)); // getActualMaximum() 은 Date 의 해당 달 마지막 날을 반환
    }
}
