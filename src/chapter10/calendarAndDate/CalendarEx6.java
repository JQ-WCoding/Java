package chapter10.calendarAndDate;

import java.util.Calendar;

public class CalendarEx6 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage : java CalendarEx6 2021 9 연월을 입력! ");
            // if문 하단의 코드를 실행하지 않고 반환
            return;
        }

        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        // 이거 final 아닌데..?
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        // 시작일
        Calendar startDay = Calendar.getInstance();
        // 종료일
        Calendar endDay = Calendar.getInstance();

        // 입력받은 월 -1 을 해야 원하는 달이 입력된다
        startDay.set(year, month - 1, 1);
        // 한달 차이
        endDay.set(year, month, 1);

        // 시작일의 해당 달 가장 마지막 날이 된다
        endDay.add(Calendar.DATE, -1);

        // 시작 요일과 종료 요일 확인
        START_DAY_OF_WEEK = startDay.get(Calendar.DAY_OF_WEEK);

        END_DAY = endDay.get(Calendar.DATE);

        // args 매개변수로 main 문에서 입력받은 값 및 날짜 계산
        System.out.println("     " + args[0] + "Y " + args[1] + "M");
        System.out.println(" S  M  T  W  T  F  S ");

        for (int i = 1; i < START_DAY_OF_WEEK; i++) {
            System.out.print("   ");
        }

        // 반복문 내에 변수 2개 설정 가능 -> 하지만 종료의 요건은 오직 한가지여야 한다
        for (int i = 0, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
            System.out.print((i < 10) ? "  " + i : " " + i);
            if (n % 7 == 0) {
                System.out.println();
            }
        }
    }
}
