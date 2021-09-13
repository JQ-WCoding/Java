package Chpater7.ch7.modifier;

public class Time {
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