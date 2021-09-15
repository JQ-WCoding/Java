package Chapter7.ch7.overriding;

public class Point {
    // 인스턴스 변수 선언
    int x, y;

    // 생성자를 통해 매개변수 x, y의 값 받아 인스턴스 변수들을 초기화
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * toString()과 비슷하게 인스턴스 변수 출력하는 메소드
     *
     * @return x, y
     */
    String getLocation() {
        return "x : " + x + " y : " + y;
    }
}

