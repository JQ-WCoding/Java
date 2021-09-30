package chapter10.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class NewTimeEx4 {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2020, 3, 4);
        LocalDate localDate2 = LocalDate.of(2021, 11, 15);
        // 인자값으로 생성된 객체 확인
        System.out.println("LD1 : " + localDate1);
        System.out.println("LD2 : " + localDate2);

        // Period 객체 생성과 함께 between 메소드로
        Period period = Period.between(localDate1, localDate2); // -> 해당 메소드의 반환 객체를 보면 Period 임
        System.out.println("period : " + period); // p Y(연도) M(월) D(일)수 차이 표시

        System.out.println("Year : " + period.get(ChronoUnit.YEARS)); // ChronoUnit 의 Year 은 연도를 초단위로 환산한 값을 가지고 있다
        System.out.println("Month : " + period.get(ChronoUnit.MONTHS)); // 해당 간격의 차이 중에 월은 얼마나 차이나는가?
        System.out.println("Day : " + period.get(ChronoUnit.DAYS)); // 일별 차이 get() 내의 인자값을 통해 구분해서 가져온다

        LocalTime localTime1 = LocalTime.of(11, 10, 10);
        LocalTime localTime2 = LocalTime.of(12, 3, 17);
        System.out.println("LT1 : " + localTime1);
        System.out.println("LT2 : " + localTime2);

        // 날짜의 차이는 period 로 생성, 시간의 차이는 duration 을 사용한다
        Duration duration = Duration.between(localTime1, localTime2);
        System.out.println("duration : " + duration);

        // 뭘하는걸까 했더니 인자값으로 시간, 분 이후 plusSeconds 를 통해
        // lt1 과 lt2 의 시간차만큼을 초로 추가하는 것
        LocalTime tempTime = LocalTime.of(0, 0, 1).plusSeconds(duration.getSeconds());
        // nano 초의 default 값은 0으로 설정되어 있다
        System.out.println(tempTime.getNano());
        // of() 시간 분 초에는 int 형 파라미터만 가질 수 있구만
//        tempTime = LocalTime.of(11, 10, (int) duration.getSeconds()); // 런타임 에러 발생

        System.out.println("hour : " + tempTime.getHour());
        System.out.println("minute : " + tempTime.getMinute());
        System.out.println("second : " + tempTime.getSecond());
    }
}
