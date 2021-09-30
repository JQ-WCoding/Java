package chapter10.time;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterEx1 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        String[] patterns = {
                // 연대 (서기 -> AD) -> 안타깝게 기원전은 없음
                "(G) yyyy-MM-dd HH:mm:ss",
                // q -> 분기를 의미
                "q ''yy년 MM dd일 E요일",
                "yyyy-MM-dd HH:mm:ss Z VV", // 시간대 위치, 시간대 id
                // 시간대 ID 사용을 위해 V 를 두번 사용한다
                "yyyy-MM-dd E요일 H a", // 오전 오후 표시(a), 요일(E)표시
                "년의 w번째, 월의 W번째 주",
        };
        
        // 반복문에서 선언하는 행동 제외하기!! -> 외부에서 한번 선언하고 계속 초기화 시키면서 사용해도 되는것
        DateTimeFormatter formatter;
        for (String pattern : patterns) {
            formatter = DateTimeFormatter.ofPattern(pattern);
            System.out.println(zonedDateTime.format(formatter));
        }
    }
}
