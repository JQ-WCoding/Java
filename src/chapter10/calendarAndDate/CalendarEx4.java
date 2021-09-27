package chapter10.calendarAndDate;

import java.util.Calendar;

public class CalendarEx4 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2021, Calendar.JUNE, 20);

        System.out.println(toString(date));
        System.out.println("After a day");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("After 3 months");
        date.add(Calendar.MONTH, 3);
        System.out.println(toString(date));

        // roll() 실험 -> 12개월 후면 연도가 바뀌는지 궁금해서 해봄
        // 변하지 않고 같은 연도 같은 월이다 -> 다른 필드에는 영향을 주지 않기 때문에 연도 변경없이 지정한 필드인 월(달)에만 영향을 미친다
        date.roll(Calendar.MONTH, 12);
        System.out.println(toString(date));

        // roll()은 31일이 지난 일을 표현할뿐 월을 +1을 하지 않는다
        // -> 다른 필드에 영향을 주지 않는다
        System.out.println("After 31 days(roll)");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        // add() 일이 증가하여 해당 월의 일수를 넘으면 +1 달 증가시킨 후 해당 월의 일수로 계산한다
        System.out.println("Before 31 days(add)");
        date.add(Calendar.DATE, -31);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "Y " + (date.get(Calendar.MONTH) + 1) + "M " + date.get(Calendar.DATE) + "D";
    }
}
