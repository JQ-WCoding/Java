package chapter10.time;

import java.time.*;

public class NewTimeEx2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 3, 24);
        LocalTime time = LocalTime.of(11, 34, 32);

        // LocalDateTime 은 LocalDate 와 LocalTime 을 합쳐서 만들어진 클래스 -> of 로 인자값을 넘겨줄때, LocalDate 와 LocalTime 으로 넘겨서 생성할 수 있다
        LocalDateTime localDateTime = LocalDateTime.of(date, time);
        System.out.println(localDateTime);
        // 특정 필요한 인자값이 존재함
        // ZoneId 는 타임존을 세팅하는 추상 클래스
        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        System.out.println(zoneId);
        // 해당 시간을 위치에 맞게 변환 시켜주려함
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        System.out.println(zonedDateTime);

        String strZid = zonedDateTime.getZone().getId(); // 설정되어있는지 확인가능 -> getZone()의 getId()를 통해 확인가능
        System.out.println(strZid);

        ZonedDateTime seoulTime = ZonedDateTime.now(); // 현재 시간 출력
        System.out.println(seoulTime); // -> now() 메소드 사용시 나노초까지 출력가능
        ZoneId nyId = ZoneId.of("America/New_York");
        ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);
//        ZoneId laId = ZoneId.of("PST"); la 될줄 알았는데 안되넹...췟
        /*
        아래와 같은 형식으로 값들이 이미 저장되어있음 static 으로
        map.put("CAT", "Africa/Harare");
        map.put("CNT", "America/St_Johns");
        map.put("CST", "America/Chicago");
        map.put("CTT", "Asia/Shanghai");
        map.put("EAT", "Africa/Addis_Ababa");
        map.put("ECT", "Europe/Paris");
        map.put("IET", "America/Indiana/Indianapolis");
        map.put("IST", "Asia/Kolkata");
        map.put("JST", "Asia/Tokyo");
         */
        OffsetDateTime offsetDateTime = zonedDateTime.toOffsetDateTime();

        System.out.println(offsetDateTime);

    }
}
