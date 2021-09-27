package chapter10.calendarAndDate;

import java.util.Calendar;

public class CalendarEx5 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.set(2021, Calendar.JANUARY, 31); // 날짜 직접 지정 -> 1월 31일
        System.out.println(toString(date));

        // 한달 후인 2월은 28일까지만 존재한다 -> 따라서 한달을 증가 시키면 가장 끝 일수로 등록된다
        date.roll(Calendar.MONTH, 1);
        System.out.println(toString(date));

        // add()도 동일한지 확인하기 위한 메소드
        date.set(2021, Calendar.JANUARY, 31);
        date.add(Calendar.MONTH, 1);
        System.out.println(toString(date));

        // roll() 은 다른 필드에 영향을 주지 않지만 월을 끝과 같은 날의 표현을 위해서 사용된다

        // 이후 한달 후를 설정하면 28일로 된다 -> 가장 끝일로 만들 수 있는 방법은 없을까?
        date.roll(Calendar.MONTH, 1);
        System.out.println(toString(date));

        // 이런식으로 설정 해보았음 -> getMaximum 을 통해 해당 달의 마지막날을 찾을 수 있다
        date.set(date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.getMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(toString(date));

        // 굉장히 불편하네...
        date.add(Calendar.MONTH, 1);
        System.out.println(toString(date));

        date.add(Calendar.MONTH, 1);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "Y " + (date.get(Calendar.MONTH) + 1) + "M " + date.get(Calendar.DATE) + "D";
    }
}
