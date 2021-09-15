package Chapter7.ch7.inheritance;

// Shape 클래스를 상속받은 Triangle
public class Triangle extends Shape {
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