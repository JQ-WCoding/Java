package chapter10.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterEx2 {
    public static void main(String[] args) {
        LocalDate year = LocalDate.parse("2022-01-01", DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDate date = LocalDate.parse("2020-01-01");
        LocalTime time = LocalTime.parse("22:10:10");
        // LocalDate 와 LocalTime 합쳐서 하나의 값으로 출력하기 -> LocalDateTime.of(date, time)순으로 입력
        LocalDateTime localDateTime = LocalDateTime.of(date, time);
        // 날짜와 시간 사이 T 필요
        LocalDateTime dateTime = LocalDateTime.parse("2020-01-01T22:32:13");

        // formatter 를 사용하여 입력받는 다면 해당 형식에 맞게 표현
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
        LocalDateTime endTime = LocalDateTime.parse("2021-12-31 오후 23:59:59", formatter);

        System.out.println(year);
        System.out.println(date);
        System.out.println(time);

        System.out.println(localDateTime);

        System.out.println(dateTime);
        System.out.println(endTime);
    }
}
