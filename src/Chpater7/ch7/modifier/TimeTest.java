package Chpater7.ch7.modifier;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(13, 29, 33);
        System.out.println(time); // time.toString() 을 출력
//        time.hour = 11; // 직접 접근 불가능 (접근제어자가 private이기 때문에)
        time.setHour(time.getHour() + 2); // 현재 초기화한 시간보다 2시간 이후의 값으로 초기화
        // time 객체 문자열로 출력
        System.out.println(time);
        // 시간을 출력하기 위해서는 time.hour이 아닌 getter를 사용하여 호출
        System.out.println(time.getHour());
    }
}