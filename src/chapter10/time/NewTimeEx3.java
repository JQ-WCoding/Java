package chapter10.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class NewTimeEx3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        // today 인 현재 시간에 2일 추가한 새로운 객체 생성
        LocalDate date = today.with(new DayAfterTomorrow());

        print(today);
        print(date);

        // 모든 출력은 연도-월-요일로 출력된다
        // 책의 예시는 TemporalAdjusters. 하위 메소드를 전부 임포트하여 사용한다 -> 어떤 클래스에 속한 메소드인지 기억하기 위해 다 작성해보기
        print(today.with(TemporalAdjusters.firstDayOfNextMonth())); // 다음 달의 첫번째 일
        print(today.with(TemporalAdjusters.firstDayOfMonth())); // 이번달의 첫번째 일
        print(today.with(TemporalAdjusters.lastDayOfMonth())); // 이번달의 마지막 일
        print(today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY))); // DayOfWeek 클래스의 enum MONDAY 를 인자값을 넘겨 해당 요일이 이번달 첫번째로 시작하는 일이 언제인지 반환
        // enum 클래스 특성상 0 부터 순서대로 값이 증가한다
        // -> 일일이 정수 값을 알아야하기 보단 해당 정수를 상수로 사용한다면 지정해두는 방법도 굉장히 유용
        print(today.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY)));
        print(today.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY))); // previous() 이전의 -> 바로 저번 화요일 (전 주의 화요일)을 찾는 메소드
        print(today.with(TemporalAdjusters.previousOrSame(DayOfWeek.TUESDAY))); // 만약 오늘이 () 인자값의 일이라면 해당 요일을 , 아니라면 전 주의 화요일을 출력
        print(today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY))); // 다음 주 화요일 찾기 ! (현재 월요일이어도 다음주 화요일 찾기)
        print(today.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY)));  // 오늘 포함한 다음 화요일 찾기ㄴ
        print(today.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.MONDAY))); // 이번 달의 첫번째 인자값(순서)의 두번째 인자값(요일) 찾기
    }

    static void print(Object o) {
        // 잦은 출력문 생략을 위한 메소드
        System.out.println(o);
    }
}