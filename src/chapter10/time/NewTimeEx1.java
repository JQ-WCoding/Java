package chapter10.time;

import java.time.LocalDate;
import java.time.LocalTime;

public class NewTimeEx1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        // LocalTime 과 LocalDate 는 final 클래스로 선언되어 상수처럼 변하지 않는다
        // 무슨의미? -> 더이상 상속받아서 사용할 수 없다.
        LocalTime now = LocalTime.now();

        LocalDate birthDate = LocalDate.of(1994,8,20);
        // 인자값을 4개 전달하면 나노 초단위도 입력 가능 LocalTime.now 를 보고 암
        LocalTime birthTime = LocalTime.of(13,32,25,235);

        System.out.println("today : " + today);
        System.out.println("now : " + now);
        System.out.println("birthDate : " + birthDate);
        System.out.println("birthTime : " + birthTime);


    }
}
