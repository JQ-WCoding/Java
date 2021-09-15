package chapter9.langPackage;

public class Circle implements Cloneable {
    Point2 point; // x, y 값
    double r; // 반지름

    // 생성자
    Circle(Point2 point, double r) {
        this.point = point;
        this.r = r;
    }

    /*
     얕은 복사
     -> 얕은 복사는 Circle 객체는 다르지만 지역변수인 point 는 같은 곳을 주소로 참조하고 있다
     */
    public Circle shallowCopy() {
        Object obj = null;

        try {
            obj = super.clone(); // 값만 복사
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }

        // Circle 형변환하여 obj 반환
        return (Circle) obj;
    }

    /*
     깊은 복사
     -> 깊은 복사는 circle 참조변수에 new Point() 인스턴스화를 통해 새로운 주소에 값을 입력하여 참조하도록 하는 것이다.
     즉, 값은 같지만 새로 생성된 메모리 영역에 같은 값이 저장되어 참조하는 형식
     */
    public Circle deepCopy() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }

        Circle circle = (Circle) obj;
        System.out.println(circle);
        // Point는 공유였어서 변환?
        circle.point = new Point2(this.point.x, this.point.y); // Point 인스턴스화

        return circle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", r=" + r +
                '}';
    }
}
