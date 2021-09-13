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


