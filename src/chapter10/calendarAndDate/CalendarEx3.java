package chapter10.calendarAndDate;

import java.util.Calendar;

public class CalendarEx3 {
    public static void main(String[] args) {
        // 시간 단위를 위한 값
        final int[] TIME_UNIT = {3600, 60, 1};
        final String[] TIME_UNIT_NAME = {"H", "M", "S"};

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        // 차이는 10분 10초 차이 -> 610분
        // 10시 10분 10초
        calendar1.set(Calendar.HOUR_OF_DAY, 10);
        calendar1.set(Calendar.MINUTE, 10);
        calendar1.set(Calendar.SECOND, 10);
        // set() 매개변수로 지정해서 값을 연달아 넣는 방법은 없음 -> 불가능

        // 10시 20분 20초
        calendar2.set(Calendar.HOUR_OF_DAY, 10);
        calendar2.set(Calendar.MINUTE, 20);
        calendar2.set(Calendar.SECOND, 20);

        // calendar1과 calendar2의 출력문
        System.out.println("C1 : " + calendar1.get(Calendar.HOUR_OF_DAY) + "H " + calendar1.get(Calendar.MINUTE) + "M " + calendar1.get(Calendar.SECOND) + "S");
        System.out.println("C2 : " + calendar2.get(Calendar.HOUR_OF_DAY) + "H " + calendar2.get(Calendar.MINUTE) + "M " + calendar2.get(Calendar.SECOND) + "S");

        // 1000으로 나눠서 초단위로 바꾸기
        long difference = Math.abs((calendar2.getTimeInMillis()) - calendar1.getTimeInMillis()) / 1000;

        System.out.println("Difference : " + difference + "seconds");

        StringBuilder temp = new StringBuilder();

        // 반복문
        // 시 분 초 단위로 나누면서 뒤에 붙는 문자열을 추가하고 3600(60 * 60), 60, 1 에 따라 나눠진 나머지를 계속 반복문을 통해 계산한다 -> 시 분 초
        for (int i = 0; i < TIME_UNIT.length; i++) {
            temp.append(difference / TIME_UNIT[i]).append(TIME_UNIT_NAME[i]);
            difference %= TIME_UNIT[i];
        }

        System.out.println("HMS : " + temp);
    }
}
