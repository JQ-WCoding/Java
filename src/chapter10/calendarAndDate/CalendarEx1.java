package chapter10.calendarAndDate;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {

        Calendar today = Calendar.getInstance();

        System.out.println("Year : " + today.get(Calendar.YEAR) + "년");
        // 0 ~ 11 이라 1 ~ 12로 바꾸기 위한 변경
        System.out.println("Month : " + (Integer.parseInt(String.valueOf(today.get(Calendar.MONTH))) + 1) + "월");
        System.out.println("Week of this year : " + today.get(Calendar.WEEK_OF_YEAR));
//        System.out.println("This Week of the month : " + today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Week of this month : " + today.get(4)); // Calendar.WEEK_OF_MONTH 의 값이 4이기에 사용해봄

        // DATE = DAY_OF_MONTH
        System.out.println("the day of this month : " + today.get(Calendar.DATE));
        System.out.println("the day of this month : " + today.get(Calendar.DAY_OF_MONTH)); // 이번달의 몇번째 일인지
        System.out.println("the day of this year : " + today.get(Calendar.DAY_OF_YEAR)); // 올해의 몇번째 일인지
        System.out.println("Day : " + today.get(Calendar.DAY_OF_WEEK)); // 1: Sunday, 2: Monday ... 7: Saturday -> 월은 0부터 시작하지만 요일은 1부터 시작
        System.out.println("the day of this week in month : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));

    }
}
