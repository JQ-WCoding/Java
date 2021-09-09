package Chpater7.ch7.inheritance;

public class DrawShape {
    public static void main(String[] args) {
        /*
         Point를 배열로 총 3가지 경우를 선언
         Point 인스턴스화와 함께 생성자를 통해 Point의 인스턴스 변수인 x, y값을 초기화
         */
        Point[] points = {
                new Point(50, 50),
                new Point(100, 100),
                new Point(10, 40)
        };

        /*
         Triangle 클래스를 인스턴스화 하며 생성자에 인자값으로 배열 points를 입력
         해당 인자값들은 Triangle의 인스턴스 배열인 points에 초기화 된다
         */
        Triangle triangle = new Triangle(points);
        /*
         Circle 클래스 인스턴스화와 함께 생성자 인자값으로 Point클래스 생성자와 정수를 입력
         값을 입력하지 않았다면 (0,0) 반지름 100의 기본생성자로 값이 초기화 되었을 것이다
         */
        Circle circle = new Circle(new Point(200, 200), 10);

        // draw 메소드 실행 -> triangle draw() 메소드는 반복문을 통해 총3번 출력문을 출력하고 circle은 한번만 실행하고 종료된다
        triangle.draw();
        circle.draw();
    }
}

class Shape {
    // 인스턴스 변수 color엔 white로 초기화 되어 있다
    String color = "White";

    void draw() {
        System.out.println("color : " + color);
    }
}

class Point {
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

// Shape을 상속받은 Circle 클래스
class Circle extends Shape {
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

// Shape 클래스를 상속받은 Triangle
class Triangle extends Shape {
    // 객체 배열로 선언
    Point[] points = new Point[3];

    Triangle(Point[] points) {
        this.points = points;
    }

    void draw() {
        // 반복적인 작업 반복문을 통해 단순화
        for (Point i : points) {
            System.out.println(i.getXY() + "-" + color);
        }
    }
}