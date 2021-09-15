package chapter9.langPackage;

// Cloneable 인터페이스를 상속해 clone() 메소드를 오버라이드해서 명칭을 재사용한다
public class Point implements Cloneable {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    // 오버라이딩 익명 클래스가 null 이면 -> 해당 clone() 메소드를 호출할 수 있는 부모의 클래스의 clone() 메소드를 사용
    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException cnse) {
            // clone() 메소드를 지원하지 않는 예외사항
            System.out.println("Not Supported");
        }
        return obj;
    }
}
