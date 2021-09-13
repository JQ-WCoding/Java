package Chpater7.ch7.inheritance;

public class Point {
    int x, y;

    // 매개변수를 필요로 하는 생성자
    Point(int x, int y) {
        // 자신의 인스턴스 변수에 해당 매개변수를 초기화하는 과정
        this.x = x;
        this.y = y;
    }

    // 기본 생성시 -> 0,0으로 인스턴스 변수 초기화 작업
    Point() {
        this(0, 0);
    }

    String getXY() {
        return x + "-" + y; // 문자열로 치환하기 위해 ""을 사용해 String으로 변환 시켜주었다
    }
}