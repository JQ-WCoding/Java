package Chapter7.ch7.inheritance;

// Shape을 상속받은 Circle 클래스
public class Circle extends Shape {
    Point center; // 참조변수 center는 Point를 인스턴스화한 변수
    int r;

    // 기본생성자 -> (0,0)에 반지름 100인 원을 기본생성자로 인스턴스화시 값이 초기화된다. (인자값을 작성하지 않을 경우)
    Circle() {
        this(new Point(0, 0), 100);
    }

    // Point클래스의 참조변수를 매개변수로 받아 해당 인스턴스 변수들만 값을 복사해서 초기화 시켜줄 것이다. -> 해당 x와 y는 Point클래스의 인스턴스 변수이다.
    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() {
        // center.x, y는 point의 인스턴스 변수 , color는 부모클래스인 Shape의 인스턴스 변수이다.
        System.out.println(center.x + "-" + center.y + "-" + color);
    }
}
