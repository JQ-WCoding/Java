package chapter10.calendarAndDate;

import java.util.Calendar;

public class CalendarEx7 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage : java CalendarEx7 2021 6");
            return;
        }

        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        Calendar startDay = Calendar.getInstance();
        Calendar endDay = Calendar.getInstance();

        startDay.set(year, month - 1, 1);
        // 바로 마지막 일을 지정하는 방법 -> getActualMaximum()
        endDay.set(year, month - 1, startDay.getActualMaximum(Calendar.DATE));

        // -부호를 통해 -> 정반대로 일요일로 간다
        startDay.add(Calendar.DATE, -startDay.get(Calendar.DAY_OF_WEEK) + 1);
        endDay.add(Calendar.DATE, 7 - endDay.get(Calendar.DAY_OF_WEEK));

        System.out.println("     " + args[0] + "Y " + args[1] + "M");
        System.out.println(" S  M  T  W  T  F  S ");

        // 1씩 날짜를 증가
        // while 문이 더 좋아 보이지만 for 문의 다양한 형태를 구경할 수 있어서 그냥 따라 적어보기
        for (int i = 1; startDay.before(endDay) || startDay.equals(endDay); startDay.add(Calendar.DATE, 1)) {
            int day = startDay.get(Calendar.DATE);
            System.out.print((day < 10) ? "  " + day : " " + day);
            if (i++ % 7 == 0) {
                System.out.println();
            }
        }
    } // main
}
