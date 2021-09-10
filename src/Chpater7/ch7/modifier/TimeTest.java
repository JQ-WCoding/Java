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

class Time {
    // 접근제어자 private 으로 선언하여 인스턴스화 시, 직접 접근을 하지 못하도록 설정
    private int hour, minute, second;

    // 생성자 -> 매개변서 hour, minute, second를 필요로 한다
    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // hour, minute, second 마다 getter와 setter를 통해 값을 불러오고 초기화 한다
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        // 유효성 검사
        if (hour < 0 || hour > 23) return; // 시간에 맞지 않는 값 0 미만 이거나 23 초과이면 종료한다.
        this.hour = hour; // 멤버 변수 hour 초기화
    }

    // 하단은 hour와 같은 원리의 메소드 getter, setter 이다
    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) return;
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + " : " + minute + " : " + second;
    }
}