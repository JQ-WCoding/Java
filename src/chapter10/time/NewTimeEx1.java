package chapter10.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class NewTimeEx1 {
    public static void main(String[] args) {
        // 현재 시간
        LocalDate today = LocalDate.now();
        // LocalTime 과 LocalDate 는 final 클래스로 선언되어 상수처럼 변하지 않는다
        // 무슨의미? -> 더이상 상속받아서 사용할 수 없다.
        LocalTime now = LocalTime.now();

        // 특정 설정 시간
        LocalDate birthDate = LocalDate.of(1994, 8, 20);
        // 인자값을 4개 전달하면 나노 초단위도 입력 가능 LocalTime.now 를 보고 암
        LocalTime birthTime = LocalTime.of(13, 32, 25, 235);

        System.out.println("today : " + today);
        System.out.println("now : " + now);
        System.out.println("birthDate : " + birthDate);
        System.out.println("birthTime : " + birthTime);

        // ChronoUnit 과 ChronoField 라는 java.time 패키지 내에 존재하는 객체 -> 각 객체에서
        System.out.println(birthDate.withYear(2000)); // 연도 변경
        System.out.println(birthDate.plusDays(1)); // 날일 추가하기
        System.out.println(birthDate.minusDays(2)); // 일 수 빼기
        System.out.println(birthDate.plusDays(-1)); //
        // DAYS 는 ChronoUnit 형의 객체이다
        System.out.println(birthDate.plus(1, ChronoUnit.DAYS));
        System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));

        // CLOCK_HOUR_OF_DAY 도 ChronoField 의 객체이다 -> 따라서 .range() 와 같이 메소드로 사용
        System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range()); // 하루를 시계의 시간으로 표현할 수 있는 범위를 출력하는 메소드
        System.out.println(ChronoField.HOUR_OF_DAY.range()); // 하루를 시간값으로 범위를 표현하는 메소드
    }
}
