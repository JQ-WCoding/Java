package Chpater7.ch7.overriding;

public class PointTest2 {
    public static void main(String[] args) {
        Point3D2 point3D2 = new Point3D2();
        // 출력문
        System.out.println("point x : " + point3D2.x);
        System.out.println("point y : " + point3D2.y);
        System.out.println("point z : " + point3D2.z);
    }
}

class Point2 {
    int x = 1, y = 2;

    Point2(int x, int y) {
        // super(); 컴파일러가 자동 생성 -> Object() 클래스의 생성자를 의미함
        this.x = x;
        this.y = y;
    }
}

class Point3D2 extends Point {
    int z = 3;

    // Point3D2의 기본생성자
    Point3D2() {
        this(1, 2, 3);
    }

    Point3D2(int x, int y, int z) {
        super(x, y); // 부모클래스 Point의 기본생성자 -> 부모 클래스의 인스턴스 변수먼저 초기화 필요
        this.z = z;
    }
}